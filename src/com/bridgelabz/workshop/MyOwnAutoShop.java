package com.bridgelabz.workshop;

public class MyOwnAutoShop {

	public static void main(String[] args) {

		System.out.println("***Welcome to My Own Auto Shop program***");

		// creating instance of Sedan class
		Sedan sedan = new Sedan(78, 40000, "Black", 25);
		System.out.println("\nSale price of sedan : " + sedan.getSalePrice());

		// creating instance of Ford class
		Ford ford1 = new Ford(74, 50000, "Red", 2015, 10);
		System.out.println("\nSale price of ford1 : " + ford1.getSalePrice());

		// creating instance of Ford class
		Ford ford2 = new Ford(81, 75000, "Green", 2019, 12);
		System.out.println("\nSale price of ford2 : " + ford2.getSalePrice());

		// creating instance of Car class
		Car car = new Car(85, 70000, "White");
		System.out.println("\nSale price of car : " + car.getSalePrice());

	}

}
