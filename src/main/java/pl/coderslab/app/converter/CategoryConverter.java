package pl.coderslab.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.app.entity.Category;
import pl.coderslab.app.repository.CategoryDao;

public class CategoryConverter implements Converter<String, Category> {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Category convert(String s) {
        return categoryDao.findById(Long.parseLong(s));
    }

}
