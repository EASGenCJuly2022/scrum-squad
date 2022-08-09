package com.cartservice.cartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDao {
    @Autowired
    private CartRepository repository;

    public Cart save(Cart cart){
        if (cart.getCartId() != 0){
       }
        return cart;
    }

    public List<Cart> findAllCarts(){
        return this.repository.findAll();
    }
}
