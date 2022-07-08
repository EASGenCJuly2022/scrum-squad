package com.cognizant.scrum;

public class Customer {
	private int c_ID, orders;
	private String name;

	public Customer(int c_ID, String name) {
		this.c_ID = c_ID;
		this.name = name;
	}
	public int getC_ID() {
		return c_ID;
	}
	public String getName() {
		return name;
	}
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
	}

}
