package com.cartservice.cartservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
    @Id
    private int itemId;
    @Column(name="user_id")
    private int userId;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_price")
    private float productPrice;
   
    public Cart() {
        super();
    }

    public Cart(int itemId, int userId, String productName, float productPrice) {
        this.itemId = itemId;
        this.userId = userId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getitemId() {
        return itemId;
    }

    public void setitemId(int cartId) {
        this.itemId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Cart [itemId=" + itemId + ", productName=" + productName + ", productPrice=" + productPrice
                + ", userId=" + userId + "]";
    }



}
