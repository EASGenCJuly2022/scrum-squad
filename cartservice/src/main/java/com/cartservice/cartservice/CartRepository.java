package com.cartservice.cartservice;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;



@Repository

public interface CartRepository extends JpaRepository<Cart, Integer> {
    
}
