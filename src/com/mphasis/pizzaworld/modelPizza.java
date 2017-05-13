package com.mphasis.pizzaworld;

public class modelPizza {
	
	private String name,type;
	
	private int price , Quantity ;
	
	public modelPizza(String name, String type, int price, int quantity) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		Quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	

}
