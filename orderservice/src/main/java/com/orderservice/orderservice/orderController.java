package com.orderservice.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@RestController
public class orderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/order")
    public List<Order> index(){
        return orderRepository.findAll();
    }

    @GetMapping("/order/{orderId}")
    public Order show(@PathVariable String id){
        int orderId = Integer.parseInt(id);
        return orderRepository.findOne(orderId);
    }



    @PostMapping("/order")
    public Order create(@RequestBody Map<Double, Date> body){
        Double orderTotal = body.get("orderTotal");
        Date orderDate = body.get("orderDate");
        return OrderRepository.save(new Order(orderTotal, orderDate));
    }

    

    @PutMapping("/order/{id}")
    public Order update(@PathVariable String id, @RequestBody Map<String, String> body){
        int orderId = Integer.parseInt(id);
        // getting blog
        Order order = orderRepository.findOne(orderId);
        order.setOrderTotal(body.get("orderTotal"));
        order.setOrderDate(body.get("orderDate"));
        return orderRepository.save(order);
    }

    @DeleteMapping("order/{id}")
    public boolean delete(@PathVariable String id){
        int orderId = Integer.parseInt(id);
        orderRepository.delete(orderId);
        return true;
    }

}