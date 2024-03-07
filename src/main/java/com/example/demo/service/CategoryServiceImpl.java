package com.example.demo.service;

import com.example.demo.model.Categories;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.utility.CategoryUtil;
import com.example.demo.utility.SlugUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public Categories findCategory(String id) {
        return categoryRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Categories> findAllCategories() {
        return categoryRepository.findAll();
    }


    @Override
    public Categories save(Categories category) {
        Categories savedCategory = categoryRepository.saveAndFlush(category);
        String newPath = CategoryUtil.generateCategoryPath(category.getPath(), savedCategory.getId());
        savedCategory.setSlug(SlugUtil.toSlug(savedCategory.getName()));
        savedCategory.setPath(newPath);
        return categoryRepository.save(savedCategory);
    }

    @Override
    public Categories update(String id, Categories category) {
        categoryRepository.findById(id).orElseThrow();
        category.setSlug(SlugUtil.toSlug(category.getName()));
        return categoryRepository.save(category);
    }

    @Override
    public void delete(String id) {
        categoryRepository.findById(id).orElseThrow();
        categoryRepository.deleteById(id);
    }
}
