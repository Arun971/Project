package com.example.project1.controller;

import com.example.project1.models.Cart;
import com.example.project1.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cart")
public class CartController {

        @Autowired
        public CartService cartService;

        @GetMapping
        public List<Cart> getAllCart(){
            return  cartService.findAll();
        }

        @PostMapping
        public String insertCart(@RequestBody Cart cart){
            cartService.save(cart);
            return "Users added";
        }

    }
