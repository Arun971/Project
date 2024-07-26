package com.example.project1.service;

import com.example.project1.models.Category;
import com.example.project1.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    public CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
    public Category save(Category category){
        category.setCreatedOn(LocalDate.now());
        category.setStatus(true);
        return categoryRepository.save(category);
    }
}
