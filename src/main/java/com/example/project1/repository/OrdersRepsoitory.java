package com.example.project1.repository;



import com.example.project1.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepsoitory extends JpaRepository<Orders,Long> {
}
