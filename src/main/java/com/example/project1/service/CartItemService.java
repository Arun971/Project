package com.example.project1.service;

import com.example.project1.models.CartItem;
import com.example.project1.models.Users;
import com.example.project1.repository.CartItemRepository;
import com.example.project1.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartItemService {
    @Autowired
    public CartItemRepository cartItemRepository;

    public List<CartItem> findAll(){
        return cartItemRepository.findAll();
    }
    public CartItem save(CartItem cartItem){
        return cartItemRepository.save(cartItem);
    }



}
