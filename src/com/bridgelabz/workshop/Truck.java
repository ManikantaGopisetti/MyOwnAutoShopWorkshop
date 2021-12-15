package com.bridgelabz.workshop;

public class Truck extends Car {

	int weight;

	// initializing weight calling super method
	public Truck(int speed, double regularPrice, String colour, int weight) {
		super(speed, regularPrice, colour);
		this.weight = weight;
	}

	// calculating the Sale price of Truck
	public double getSalePrice() {
		double discount = 0;
		if (weight > 2000) {
			discount = regularPrice * 0.1;	 // calculating 10% discount if weight>2000
		} else {
			discount = regularPrice * 0.2;	 // calculating 20% discount if weight<2000
		}
		return regularPrice - discount; 	 // returning Sale price of sedan after removing discount
	}

}
