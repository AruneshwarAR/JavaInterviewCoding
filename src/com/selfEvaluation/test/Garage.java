package com.selfEvaluation.test;
import java.util.*;
public class Garage {
	
	Car appuCar = new Car("TATA","Curvv",2000000);
	Car sowmiCar = new Car("TATA","Curvv.ev",1800000);
	
	List<Car> garage = new ArrayList<>();
	public Garage(){
	garage.add(appuCar);
	garage.add(sowmiCar);
	}
	public void showGarage()
	{
		for(Car car:garage) {
			System.out.println(car.getBrand());
			System.out.println(car.getModel());
			System.out.println(car.getPrice());
			System.out.println("------------");
		}
	}
}
