package com.main.maindriver;

public class Order {
    
    private int orderId;
    private int userId;
    private int itemId;
    private String itemName;
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
