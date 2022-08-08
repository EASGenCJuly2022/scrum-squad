package com.cartservice.cartservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDao {
    @Autowired
    private CartRepository repository;

    public void saveCart(Cart cart){
        this.repository.save(cart);
    }

    public List<Cart> findAllCarts(){
        return this.repository.findAll();
    }
}
