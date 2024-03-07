package com.example.demo.controller;
import com.example.demo.model.Categories;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/category")
@CrossOrigin(value = "http://localhost:4200/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Categories> getAllCategory() {
        return categoryService.findAllCategories();
    }

    @GetMapping("/{id}")
    public Categories getACategory(@PathVariable String id) {
        return categoryService.findCategory(id);
    }

    @PostMapping
    public ResponseEntity<Categories> createCategory(@RequestBody Categories category) {
        return ResponseEntity.ok(categoryService.save(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categories> updateCategory(@RequestBody Categories category, @PathVariable String id) {
        return ResponseEntity.ok(categoryService.update(id, category));
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable String id) {
        categoryService.delete(id);
    }
}
