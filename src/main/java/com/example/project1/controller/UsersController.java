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
@PutMapping("/{id}")
    public Users updateUsers(@PathVariable long id,@RequestBody Users users){
        Optional<Users>users1= usersService.usersRepository.findById(id);
        if (users1.isPresent()){
            users1.get().setAddress(users.getAddress());
        }

        return usersService.save(users);
}
@DeleteMapping("/users/{id}")
    public String deleteUsers(@PathVariable long id){
        return usersService.delete(id);
}

}