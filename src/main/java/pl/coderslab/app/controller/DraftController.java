package pl.coderslab.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.app.entity.Article;
import pl.coderslab.app.groupInterfaces.DraftArticle;
import pl.coderslab.app.repository.ArticleDao;

@Controller
@RequestMapping("/draft")
public class DraftController {

    private final ArticleDao articleDao;

    public DraftController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @GetMapping("/list")
    public String draftsList(Model model) {
        model.addAttribute("articles", articleDao.findAllDrafts());
        return "article/list";
    }

    @PostMapping("/add")
    public String addingDraft(@Validated(DraftArticle.class) Article article, BindingResult result) {
        if (result.hasErrors()) {
            return "article/add";
        }
        articleDao.save(article);
        return "redirect:list";
    }

    @PostMapping("/edit")
    public String editingDraft(@Validated(DraftArticle.class) Article article, BindingResult result) {
        if (result.hasErrors()) {
            return "article/edit";
        }
        articleDao.update(article);
        return "redirect:/article/list";
    }
}
