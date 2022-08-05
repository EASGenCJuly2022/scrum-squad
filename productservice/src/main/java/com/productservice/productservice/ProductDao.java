package com.productservice.productservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductDao {
	
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
		name = name.toLowerCase();
		String productName;
		List<Product> products = this.repository.findAll();
		for (Product product : products)
		{
			productName = product.getProductName().toLowerCase();
			if (name.equals(productName))
			{
				return product;
			}
		}
		return null;
	}
	
	public List<Product> categorySearch(String type)
	{
		String productTypeName;
		
		List<Product> products = this.repository.findAll();
		List<Product> productsInCategory = new ArrayList<Product>();
		
		type = type.toLowerCase();
		
		for (Product product : products)
		{
			productTypeName = product.getType().toLowerCase();
			if (type.equals(productTypeName))
			{
				productsInCategory.add(product);
			}
		}
		
		return productsInCategory;
	}
	
	
}
