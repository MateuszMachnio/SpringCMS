package pl.coderslab.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.app.entity.Author;
import pl.coderslab.app.repository.AuthorDao;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorDao authorDao;

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @GetMapping("/list")
    public String showAll(Model model) {
        model.addAttribute("authors", authorDao.findAll());
        return "author/list";
    }

    @GetMapping("/add")
    public String addAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "author/add";
    }

    @PostMapping("/add")
    public String adding(Author author) {
        authorDao.save(author);
        return "redirect:list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorDao.findById(id));
        return "author/edit";
    }

    @PostMapping("/edit/{id}")
    public String editing(Author author) {
        authorDao.update(author);
        return "redirect:/author/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteConfirmation(Model model, @PathVariable Long id) {
        model.addAttribute("author", authorDao.findById(id));
        return "author/delete";
    }

    @PostMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        authorDao.remove(authorDao.findById(id));
        return "redirect:/author/list";
    }

}
