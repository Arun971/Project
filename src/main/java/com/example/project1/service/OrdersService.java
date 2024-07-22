package com.example.project1.service;

import com.example.project1.models.Orders;
import com.example.project1.repository.OrdersRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrdersService {
    @Autowired
    public OrdersRepsoitory ordersRepsoitory;

    public List<Orders> findAll(){
        return ordersRepsoitory.findAll();
    }
    public Orders save(Orders orders){
        return ordersRepsoitory.save(orders);
    }

}
