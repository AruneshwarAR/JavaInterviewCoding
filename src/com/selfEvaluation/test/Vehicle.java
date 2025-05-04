package com.selfEvaluation.test;

public class Vehicle extends Transport{
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
@Override
public void move() {
	// TODO Auto-generated method stub
	System.out.println("Moving Vehicle "+type);
}
}

