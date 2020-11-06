package pl.coderslab.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.app.repository.ArticleDao;

@Controller
public class HomePageController {

    private final ArticleDao articleDao;

    public HomePageController(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("articles", articleDao.getLastFiveArticles());
        return "article/lastArticles";
    }
}
