package com.example.project1.controller;


import com.example.project1.models.Products;

import com.example.project1.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")

public class ProductsController {


    @Autowired
    public ProductsService productsService;

    @GetMapping
    public List<Products> getAllProducts() {
        return productsService.findAll();
    }

    @PostMapping
    public String insertProducts(@RequestBody Products products) {
        productsService.save(products);
        return "Products create";
    }
}
