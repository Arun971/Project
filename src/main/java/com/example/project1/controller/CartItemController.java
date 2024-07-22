package com.example.project1.controller;

import com.example.project1.models.CartItem;
import com.example.project1.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartItem")
public class CartItemController {

    @Autowired
    public CartItemService cartItemService;

    @GetMapping
    public List<CartItem> getAllCartItem(){
        return cartItemService.findAll();
    }
    @PostMapping
    public String insertCartItem(@RequestBody CartItem cartItem){
         cartItemService.save(cartItem);
         return "cart created";
    }


}
