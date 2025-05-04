package com.selfEvaluation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class carTest {

	@Test
	void test() {
		Car car = new Car("Honda","City",10000000);
//		The Brand is TATA
//		The Model is Curvv
//		The pice is 2000000.0
		assertEquals("The Brand is Honda",car.getBrand());
		assertEquals("The Model is City",car.getModel());
		assertEquals("The pice is 10000000.0",car.getPrice());
		
		car.setBrand("Hyundai");
		car.setModel("i20");
		car.setPrice(8000000);
		
		assertEquals("The Brand is Hyundai",car.getBrand());
		assertEquals("The Model is i20",car.getModel());
		assertEquals("The pice is 8000000.0",car.getPrice());
	}

}
