package com.bridgelabz.workshop;

public class Ford extends Car {

	int year;
	int manufacturerDiscount;

	// initializing year and manufacturer discount and calling super method
	public Ford(int speed, double regularPrice, String colour, int year, int manufacturerDiscount) {
		super(speed, regularPrice, colour);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	// calculating the Sale price of Ford
	public double getSalePrice() {

		// returning Sale price of sedan after removing manufacturer discount from Sale price computed from Car class
		return (super.getSalePrice() - super.getSalePrice() * (manufacturerDiscount / 100d));

	}

}
