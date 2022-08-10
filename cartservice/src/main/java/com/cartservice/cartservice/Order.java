package com.cartservice.cartservice;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id", nullable = false)
    private int orderId;

    @Column(name="user_id", nullable = false)
    private int userId;

    @Column(name="item_id", nullable = false)
    private int itemId;
    
    @Column(name="item_name", nullable = false)
    private String itemName;
    @Column(name="item_price", nullable = false)
    private float itemPrice;
   
    public Order() {
        super();
    }

    

    public Order(int id, int userId, int itemId, String productName, float productPrice) {
        this.orderId = id;
        this.userId = userId;
        this.itemId = itemId;
        this.itemName = productName;
        this.itemPrice = productPrice;
    }
    

    public int getOrderId() {
        return orderId;
    }



    public void setOrderId(int orderId) {
        this.orderId = orderId;
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



    public String getItemName() {
        return itemName;
    }



    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



    public float getItemPrice() {
        return itemPrice;
    }



    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }



    @Override
    public String toString() {
        return "Order [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", orderId="
                + orderId + ", userId=" + userId + "]";
    }


}
