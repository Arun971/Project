package com.example.project1.service;


import com.example.project1.models.Role;
import com.example.project1.models.Users;

import com.example.project1.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UsersService {
    @Autowired
    public UsersRepository usersRepository;

    public List<Users>findAll(){
        return usersRepository.findAll();
    }
    public Users save(Users users){
        users.setCreatedOn(LocalDate.now());
        users.setRole(Role.USER);
        users.setStatus(true);
        return usersRepository.save(users);
    }
}
