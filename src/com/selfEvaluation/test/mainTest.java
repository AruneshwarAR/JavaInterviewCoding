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
		
		appuCar.startEngine();
		sowmiCar.stopEngine();
		appuCar.stopEngine();
		sowmiCar.startEngine();
		appuCar.setBrand("Porche");
		appuCar.setModel("Caymen");
		appuCar.setPrice(150000000);
		
		sowmiCar.setBrand("Lamborghini");
		sowmiCar.setModel("urus");
		sowmiCar.setPrice(420000000);
		appuCar.startEngine();
		sowmiCar.stopEngine();
		appuCar.stopEngine();
		sowmiCar.startEngine();
	
		
		System.out.println(appuCar.getBrand());
		System.out.println(appuCar.getModel());
		System.out.println(appuCar.getPrice());
		System.out.println("Appu car Mileage"+appuCar.calculateMileage(5, 70));
		System.out.println(sowmiCar.getBrand());
		System.out.println(sowmiCar.getModel());
		System.out.println(sowmiCar.getPrice());
		System.out.println("Sowmi car Mileage"+sowmiCar.calculateMileage(8, 120));
		
//		System.out.println("Appu car Mileage"+appuCar.calculateMileage(0, 70));
		
		//polymorphism
		Vehicle ref = new Bike("Type");
		ref.start();
		ref.move();
		Car.totalCars();
		License li = new License();
		li.getRules();
		
		Garage g = new Garage();
		g.showGarage();
		
		
		
		
		
	}

}
