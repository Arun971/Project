package com.example.project1.service;

import com.example.project1.models.Cart;
import com.example.project1.models.Users;
import com.example.project1.repository.CartRepository;
import com.example.project1.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartService {

    @Autowired
    public CartRepository cartRepository;

    public List<Cart> findAll(){
        return cartRepository.findAll();
    }
    public Cart save(Cart cart){
        return cartRepository.save(cart);
    }
}
