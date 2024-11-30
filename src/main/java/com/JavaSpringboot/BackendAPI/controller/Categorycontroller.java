package com.JavaSpringboot.BackendAPI.controller;

import com.JavaSpringboot.BackendAPI.Category;
import com.JavaSpringboot.BackendAPI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/categories")
public class Categorycontroller {

    @Autowired
    private CategoryService categoryService;

    public Categorycontroller(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "10") int size) {
        return categoryService.getAllCategories(PageRequest.of(page, size));
    }

    @GetMapping("/{di}")
    public Category getCategoryById(@PathVariable("di") Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/{di}")
    public Category updateCategory(@PathVariable("di") Long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{di}")
    public void deleteCategory(@PathVariable("di") Long id) {
        categoryService.deleteCategory(id);
    }
}