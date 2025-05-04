package com.selfEvaluation.test;

public class Bike extends Vehicle{
	//private String type;

	public Bike(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	public String displayInfo() {
		return "This is a bike of type : "+ type;
	}
	public void start() {
		System.out.println("BikeStart "+type);
	}
}
