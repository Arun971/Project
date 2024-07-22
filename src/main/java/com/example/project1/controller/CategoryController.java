package com.example.project1.controller;

import com.example.project1.models.Category;
import com.example.project1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Style;
import java.util.List;

@RestController
@RequestMapping("/category")

public class CategoryController {

    @Autowired
    public CategoryService categoryService;


    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.findAll();
    }

    @PostMapping
    public String insertCategory(@RequestBody Category category){
        categoryService.save(category);
        return "Category create";
    }





}
