package com.arun.practice;

public class SwapNumNoTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 7;
		System.out.println(a + " " + b);// a=7,b=5
		a = a + b;// 12
		b = a - b;// 12-7 b=5
		a = a - b;// 12-5 a=7

		System.out.println(a + " " + b);// a=7,b=5
	}

}
