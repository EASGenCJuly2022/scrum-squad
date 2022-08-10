package com.cartservice.cartservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CartData {
    private String name;
    public CartData(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    private int id;
    private int price;
    private List<CartMap> list = new ArrayList<CartMap>();

    public CartData(){};

    public void addTo(CartMap map){
        list.add(map);
    }
    public void deleteUserCart(){
        list.clear();
    }
    public void populate(){
        list.add(new CartMap(1, 1, "minecraft", 10));
        list.add(new CartMap(1, 2, "battlefield", 10));
        list.add(new CartMap(2, 1, "minecraft", 10));
    }
    @Override
    public String toString() {
        return "CartData [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    public List<CartMap> getList() {
        return list;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    
}
