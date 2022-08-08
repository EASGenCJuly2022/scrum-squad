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
    @GeneratedValue
    private int cartId;
    @Column(name="user_id")
    private int userId;
    @Column(name="product_name")
    private String productName;
    @Column(name="product_price")
    private float productPrice;
   
    public Cart() {
        super();
    }

    public Cart(int cartId, int userId, String productName, float productPrice) {
        this.cartId = cartId;
        this.userId = userId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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
        return "Cart [cartId=" + cartId + ", productName=" + productName + ", productPrice=" + productPrice
                + ", userId=" + userId + "]";
    }



}
