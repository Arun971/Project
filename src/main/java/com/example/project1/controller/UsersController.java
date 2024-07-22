package com.example.project1.controller;


import com.example.project1.models.Users;
import com.example.project1.repository.UsersRepository;
import com.example.project1.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    public UsersService usersService;

    @GetMapping
    public List<Users> getAllUsers(){
        return  usersService.findAll();
    }

    @PostMapping
    public String insertUsers(@RequestBody Users users){
        usersService.save(users);
        return "Users added";
    }


}