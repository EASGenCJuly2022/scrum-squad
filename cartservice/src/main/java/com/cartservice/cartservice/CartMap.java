package com.cartservice.cartservice;


public class CartMap {
    private int userId;
    private int itemId;
    private String itemName;
    private int itemPrice;
    public CartMap(int userId, int itemId, String itemName, int itemPrice) {
        this.userId = userId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    public CartMap(){}
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    @Override
    public String toString() {
        return "CartMap [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", userId="
                + userId + "]";
    }
    
}
