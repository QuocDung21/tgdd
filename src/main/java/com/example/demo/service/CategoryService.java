package com.example.demo.service;


import com.example.demo.model.Categories;

import java.util.List;

//Cầu nối giữa Controller và Repository
public interface CategoryService {
    Categories findCategory(String id);
    List<Categories> findAllCategories();
    Categories save(Categories category);
    Categories update(String id, Categories category);
    void delete(String id);
}
