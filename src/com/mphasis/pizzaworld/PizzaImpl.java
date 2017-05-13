package com.mphasis.pizzaworld;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaImpl implements Pizza {

	int temp3, temp4, amt=0;
	int temp5=1;

	ArrayList<modelPizza> pizzaList = new ArrayList<modelPizza>();

	

	@Override
	public void displayMenu() {

		System.out.println("Enter your name");

		Scanner sc1 = new Scanner(System.in);
		String temp2 = sc1.next();
		System.out.println("Hello !! " + temp2);
while (temp5==1) {
	

		System.out.println("Press 1 for Veg");
		System.out.println("Press 2 for Non-Veg");
		System.out.println("Press 3 for All Items");

		Scanner sc2 = new Scanner(System.in);
		int temp1 = sc2.nextInt();

		System.out.println();
		switch (temp1) {
		case 1:
			System.out.println("Press 1 for Magarita");
			System.out.println("Press 2 for Pepporini");
			break;

		case 2:
			System.out.println("Press 3 for Chicken Pizza");
			break;

		default:
			System.out.println("Press 1 for Magarita");
			System.out.println("Press 2 for Pepporini");
			System.out.println("Press 3 for Chicken Pizza");
			break;
		}
		
		
		Scanner sc3 = new Scanner(System.in);
		temp3 = sc3.nextInt();
		if (temp3 == 1) {
			modelPizza p1 = new modelPizza("Magarita", "Veg", 500, getquantity());
			pizzaList.add(p1);

		} else if (temp3 == 2) {
			System.out.println("Entered choice 2");
			modelPizza p2 = new modelPizza("Pepporini", "veg", 200, getquantity());
			pizzaList.add(p2);

		} else if (temp3 == 3) {
			modelPizza p3 = new modelPizza("Chicken", "Non-Veg", 700, getquantity());
			pizzaList.add(p3);

		}
		System.out.println("To Continue Press 1 ");
		System.out.println("Press 2 to stop");
		Scanner sc4 = new Scanner(System.in);
		temp5 = sc4.nextInt();
}
		
		
	}

	@Override
	public void placeOrder() {

		

		/*if (temp3 == 1) {
			pizzaList.add(p1);

		} else if (temp3 == 2) {
			pizzaList.add(p2);

		} else if (temp3 == 3) {
			pizzaList.add(p3);

		}*/
		/*System.out.println("Enter the Quantity");
		Scanner sc4 = new Scanner(System.in);
		temp4 = sc4.nextInt();*/
		//return temp4;
	}

	@Override
	public void showOrder() {
		
		for (modelPizza pizza : pizzaList) {
			System.out.println(
					pizza.getName() + "  " + pizza.getType() + "  " + pizza.getPrice() + "  " + pizza.getQuantity());

			amt = amt+pizza.getQuantity() * pizza.getPrice(); //ye dusra call
		}

	}

	@Override
	public void calcAmount() {

		System.out.println("Total Amount is :" + amt);

	}

@Override
public int getquantity(){
	System.out.println("Enter the Quantity");
	Scanner sc4 = new Scanner(System.in);
	temp4 = sc4.nextInt();
	return temp4;
}
}
