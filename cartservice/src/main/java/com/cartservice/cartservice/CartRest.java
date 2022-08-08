package com.cartservice.cartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRest {
    @Autowired
    private CartDao service;

    @GetMapping("/cart")
    public List<Cart> retrieveAllCarts(){
        return service.findAllCarts();
    }
}
