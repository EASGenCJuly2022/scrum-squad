package com.cartservice.cartservice;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class CartRest {
    @Autowired
    private CartRepository service;

    @Autowired
    private CartData data;

   /* @GetMapping("/cart")
    public List<Cart> retrieveAllCarts(){
        return service.findAll();
    }*/
    @GetMapping("/cart")
    public List<CartMap> returnCartData(){
        return data.getList();
    }
    /*@GetMapping("/cart/{id}")
    public List<Cart> retrieveUserCart(@PathVariable int id){
        return service.findUserCart(id);
    }*/
    @GetMapping("/cart/test")
    public String testCart(){
        data.populate();
        return "Test complete!";
    }
    @PostMapping("/cart")
    public void addToCart(@Validated @RequestBody CartMap cart){
        data.addTo(cart);
    }
    @DeleteMapping("/cart")
    public void removeFromCart(){
        data.deleteUserCart();
    }
    /*@PostMapping("/cart")
    public ResponseEntity<Object> createCart(@Validated @RequestBody Cart cart){
            Cart savedCart = service.save(cart);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCart.getitemId()).toUri();
        return ResponseEntity.created(location).build();
    }*/
   /*  @DeleteMapping("/cart/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }*/
}
