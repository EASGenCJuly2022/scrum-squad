package com.productservice.productservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRest {
	
	@Autowired
	private ProductRepository serv;

	@GetMapping("/products")
	public List<Product> retrieveAllProducts() 
	{
		return serv.findAll();
	}
	
	
	@GetMapping("/products/{name}")
	public Product retrieveSingleProduct(@PathVariable String name)
	{
		return serv.singleProduct(name);
	}
	
	
	@GetMapping("/products/category/{type}")
	public List<Product> retrieveProductByType(@PathVariable String type)
	{
		return serv.categoryProducts(type);
	}

}
