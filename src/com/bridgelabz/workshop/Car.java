package com.bridgelabz.workshop;

public class Car {

	int speed;
	double regularPrice;
	String colour;

	// initializing speed,regular price and colour
	public Car(int speed, double regularPrice, String colour) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}

	// calculating the Sale price of Car
	public double getSalePrice() {
		return regularPrice;		 // returning Sale price of Car
	}

}
