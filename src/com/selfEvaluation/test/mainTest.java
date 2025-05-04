package com.selfEvaluation.test;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike appuBike = new Bike("passion pro");
		System.out.println(appuBike.displayInfo());
		
		Car appuCar = new Car("TATA","Curvv",2000000);
		Car sowmiCar = new Car("TATA","Curvv.ev",1800000);
		System.out.println(appuCar.getBrand());
		System.out.println(appuCar.getModel());
		System.out.println(appuCar.getPrice());
		System.out.println(sowmiCar.getBrand());
		System.out.println(sowmiCar.getModel());
		System.out.println(sowmiCar.getPrice());
		
		appuCar.setBrand("Porche");
		appuCar.setModel("Caymen");
		appuCar.setPrice(150000000);
		
		sowmiCar.setBrand("Lamborghini");
		sowmiCar.setModel("urus");
		sowmiCar.setPrice(420000000);
		
		System.out.println(appuCar.getBrand());
		System.out.println(appuCar.getModel());
		System.out.println(appuCar.getPrice());
		System.out.println(sowmiCar.getBrand());
		System.out.println(sowmiCar.getModel());
		System.out.println(sowmiCar.getPrice());
		
		
		//polymorphism
		Vehicle ref = new Bike("Type");
		ref.start();
		
	}

}
