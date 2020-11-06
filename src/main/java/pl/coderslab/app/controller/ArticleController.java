package pl.coderslab.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.entity.Article;
import pl.coderslab.app.entity.Author;
import pl.coderslab.app.entity.Category;
import pl.coderslab.app.repository.ArticleDao;
import pl.coderslab.app.repository.AuthorDao;
import pl.coderslab.app.repository.CategoryDao;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {

    private final ArticleDao articleDao;
    private final CategoryDao categoryDao;
    private final AuthorDao authorDao;

    public ArticleController(ArticleDao articleDao, CategoryDao categoryDao, AuthorDao authorDao) {
        this.articleDao = articleDao;
        this.categoryDao = categoryDao;
        this.authorDao = authorDao;
    }

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryDao.findAll();
    }

    @ModelAttribute("authors")
    public List<Author> authors() {
        return authorDao.findAll();
    }

    @GetMapping("/list")
    public String showAll(Model model) {
        model.addAttribute("articles", articleDao.findAll());
        return "article/list";
    }

    @GetMapping("/add")
    public String addArticle(Model model) {
        model.addAttribute("article", new Article());
        return "article/add";
    }

    @PostMapping("/add")
    public String adding(Article article) {
        articleDao.save(article);
        return "redirect:list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("article", articleDao.findByIdWithCategories(id));
        return "article/edit";
    }

    @PostMapping("/edit/{id}")
    public String editing(Article article) {
        articleDao.update(article);
        return "redirect:/article/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteConfirmation(Model model, @PathVariable Long id) {
        model.addAttribute("article", articleDao.findByIdWithCategories(id));
        return "article/delete";
    }

    @PostMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        articleDao.remove(articleDao.findById(id));
        return "redirect:/article/list";
    }

}