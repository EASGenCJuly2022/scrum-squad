package com.productservice.productservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	/*
	@Query(value="SELECT * FROM products", nativeQuery=true)
	List<Product> allProducts();
	*/
	
	@Query(value="SELECT * FROM products WHERE product_type = ?1", nativeQuery=true)
	List<Product> categoryProducts(String category);
	
	@Query(value="SELECT * FROM products WHERE product_name = ?1", nativeQuery=true)
	Product singleProduct(String name);
}
