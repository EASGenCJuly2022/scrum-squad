package com.cartservice.cartservice;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CartRest {
    @Autowired
    private CartRepository service;

    @GetMapping("/cart")
    public List<Cart> retrieveAllCarts(){
        return service.findAll();
    }

    @PostMapping("/cart")
    public ResponseEntity<Object> createCart(@Validated @RequestBody Cart cart){
            Cart savedCart = service.save(cart);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCart.getCartId()).toUri();
        return ResponseEntity.created(location).build();
    }
    
}
