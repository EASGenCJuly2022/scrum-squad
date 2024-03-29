package com.cartservice.cartservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository

public interface CartRepository extends JpaRepository<Order, Integer> {
   @Query(value="SELECT * FROM orders WHERE user_id = ?1", nativeQuery=true)
   List<Order> findUserOrders(int userId);
}
