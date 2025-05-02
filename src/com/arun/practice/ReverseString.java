package com.arun.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenString = "reverse the whole string";
		StringBuilder reversedString = new StringBuilder(givenString);
		reversedString = reversedString.reverse();
		System.out.println(reversedString);
		

	}

}
