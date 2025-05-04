package com.selfEvaluation.test;

public class Vehicle {
protected String type;
public Vehicle(String type) {
	this.type = type;
}
public String displayInfo() {
	return "The Vehicle type is "+type;
}

public void start() {
	System.out.println("VehicleStart");
}
}

