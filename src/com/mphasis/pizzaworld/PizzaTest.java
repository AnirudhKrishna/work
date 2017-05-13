package com.mphasis.pizzaworld;

public class PizzaTest {

	public static void main(String[] args) {
		
		Pizza p = new PizzaImpl();
		
		p.displayMenu();
		p.placeOrder();
		p.showOrder();
		p.calcAmount();
		
	}

}
