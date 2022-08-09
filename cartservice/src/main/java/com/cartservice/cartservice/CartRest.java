package com.cartservice.cartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRest {
    @Autowired
    private CartDao service;

    @GetMapping("/cart")
    public List<Cart> retrieveAllCarts(){
        return service.findAllCarts();
    }

    @PostMapping("/cart")
    public void createCart(@RequestBody Cart cart){
            Cart savedCart = service.save(cart);
    }
}
