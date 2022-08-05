package com.orderservice.orderservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    // custom query to search to blog post by title or content
    List<Order> findByTitleContainingOrContentContaining(String text, String textAgain);    
}
