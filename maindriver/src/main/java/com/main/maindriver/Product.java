package com.main.maindriver;

public class Product {

	private int id;
	private String productName;
	private String type;
	private float price;
	private int stock;
    
	public Product() {super();}

	public Product(int id, String productName, String type, float price, int stock) {
		super();
		this.id = id;
		this.productName = productName;
		this.type = type;
		this.price = price;
		this.stock = stock;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", type=" + type + ", price=" + price
				+ ", number=" + stock + "]";
	}
	
	

}
