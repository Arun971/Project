package com.example.project1.controller;


import com.example.project1.models.Orders;

import com.example.project1.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    public OrdersService ordersService;

    @GetMapping
    public List<Orders> getAllOrder(){
        return ordersService.findAll();
    }

    @PostMapping
    public String insertOrder(@RequestBody Orders orders){
        ordersService.save(orders);
        return "order create";
    }


}
