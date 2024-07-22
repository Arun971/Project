package com.example.project1.service;

import com.example.project1.models.Products;
import com.example.project1.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductsService {
    @Autowired
    public ProductsRepository productsRepository;

    public List<Products> findAll(){

        return productsRepository.findAll();
    }
    public Products save(Products products){
        products.setCreatedOn(LocalDate.now());

        return productsRepository.save(products);
    }
}
