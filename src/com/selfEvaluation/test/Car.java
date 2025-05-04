package com.selfEvaluation.test;

import java.util.Locale;

public class Car implements Engine {
	private String brand, model;
	private double price;
	private static int totalCars=0;

	public Car(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		totalCars++;
	}
public static void totalCars() {
	System.out.println("totalCars count is "+totalCars);
}
	public String getBrand() {
		return "The Brand is " + brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return "The Model is " + model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return String.format(Locale.US, "The pice is %.1f", price);
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void startEngine() {
		System.out.println("Started " + brand + "-" + model);
	}

	public void stopEngine() {
		System.out.println("Stopped " + brand + "-" + model);
	}
}
