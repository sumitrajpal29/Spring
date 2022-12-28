package com.springcore.lifecycle;

public class Samosa {
	private double price;

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa(double price) {
		System.out.println("inside constructor.");
		this.price = price;
	}
	
	public void init() {
		System.out.println("inside init() method.");
	}
	public void destroy() {
		System.out.println("inside destroy() method.");
	}
}
