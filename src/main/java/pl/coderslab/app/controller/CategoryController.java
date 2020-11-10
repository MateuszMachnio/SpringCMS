package pl.coderslab.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.app.entity.Category;
import pl.coderslab.app.repository.CategoryDao;

import javax.validation.Valid;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @GetMapping("/list")
    public String showAll(Model model) {
        model.addAttribute("categories", categoryDao.findAll());
        return "category/list";
    }

    @GetMapping("/add")
    public String addCategory(Model model) {
        model.addAttribute("category", new Category());
        return "category/add";
    }

    @PostMapping("/add")
    public String adding(@Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "category/add";
        }
        categoryDao.save(category);
        return "redirect:list";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("category", categoryDao.findById(id));
        return "category/edit";
    }

    @PostMapping("/edit/{id}")
    public String editing(@Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "category/edit";
        }
        categoryDao.update(category);
        return "redirect:/category/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteConfirmation(Model model, @PathVariable Long id) {
        model.addAttribute("category", categoryDao.findById(id));
        return "category/delete";
    }

    @PostMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        categoryDao.remove(categoryDao.findById(id));
        return "redirect:/category/list";
    }

}
