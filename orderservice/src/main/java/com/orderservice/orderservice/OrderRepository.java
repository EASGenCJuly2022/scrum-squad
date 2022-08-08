package com.orderservice.orderservice;

import org.springframework.data.repository.CrudRepository;

import com.orderservice.orderservice.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    
}
