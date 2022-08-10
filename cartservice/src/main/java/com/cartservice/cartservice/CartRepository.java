package com.cartservice.cartservice;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository

public interface CartRepository extends JpaRepository<Cart, Integer> {
   @Query(value="SELECT * FROM cart WHERE user_id = ?1", nativeQuery = true)
   List<Cart> findUserCart(int id);
}
