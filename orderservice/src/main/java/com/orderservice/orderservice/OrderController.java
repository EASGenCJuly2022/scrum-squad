package com.orderservice.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path= "/demo")
public class OrderController {
    @Autowired
    
    private OrderRepository orderRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewOrder (@RequestParam int orderID, @RequestParam int customerID) {
        Order n = new Order();
        n.setOrderID(orderID);
        n.setCustomerID(customerID);
        orderRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Order> getAllOrders() {
        // Returns a JSON or XML with the orders
        return orderRepository.findAll();
    }

}
