package com.selfEvaluation.test;

import java.util.Locale;

public class Car {
private String brand,model;
private double price;
public Car(String brand, String model, double price) {
	super();
	this.brand = brand;
	this.model = model;
	this.price = price;
}
public String getBrand() {
	return "The Brand is "+brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return "The Model is "+model;
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

}
