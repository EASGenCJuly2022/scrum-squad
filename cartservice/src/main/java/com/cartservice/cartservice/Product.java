package com.productservice.productservice;

public class Product {
	
	private int id;
	private String productName;
	private String type;
	private float price;
	private int number;
	
	public Product() {super();}

	public Product(int id, String productName, String type, float price, int number) {
		super();
		this.id = id;
		this.productName = productName;
		this.type = type;
		this.price = price;
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", type=" + type + ", price=" + price
				+ ", number=" + number + "]";
	}
	
	

}
