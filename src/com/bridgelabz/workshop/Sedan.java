package com.bridgelabz.workshop;

public class Sedan extends Car {

	int length;

	// initializing length and calling super method
	public Sedan(int speed, double regularPrice, String colour, int length) {
		super(speed, regularPrice, colour);
		this.length = length;
	}

	// calculating the Sale price of Sedan
	public double getSalePrice() {
		double discount = 0;
		if (length > 20) {
			discount = regularPrice * 0.05; 	// calculating 5% discount if length>20
		} else {
			discount = regularPrice * 0.1; 		// calculating 10% discount if length<20
		}
		return regularPrice - discount;		    // returning Sale price of sedan after removing discount
	}

}
