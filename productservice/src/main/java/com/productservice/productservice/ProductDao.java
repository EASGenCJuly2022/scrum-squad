package com.productservice.productservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDao {
	
	@Autowired
	private ProductRepository repository;
	
	public void saveProduct(Product product)
	{
		this.repository.save(product);
	}
	
	public List<Product> findAllProducts()
	{
		return this.repository.findAll();
	}
	
	
	public Product findByName(String name) 
	{
		return this.repository.singleProduct(name);
	}
	
	
	public List<Product> categorySearch(String type)
	{
		
		return this.repository.categoryProducts(type);
	}
	
	
}
