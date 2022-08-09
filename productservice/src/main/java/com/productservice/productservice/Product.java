package com.productservice.productservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   
    @Column(name="product_name", nullable = false)
    private String productName;
   
    @Column(name="product_type", nullable = false)
    private String type;
   
    @Column(name="price", nullable = false)
    private float price;
   
    @Column(name="stock", nullable = false)
    private int stock;
   
    public Product() {}
    public Product(String productName, String type, float price, int stock) {
        this.productName = productName;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }
    public int getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public String getType() {
        return type;
    }
    public float getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", productName=" + productName + ", type=" + type + ", price=" + price
                + ", number=" + stock + "]";
    }
   
   
}