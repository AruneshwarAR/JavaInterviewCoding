package com.arun.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
public static void main(String[] args) {
	
	int[] a= {1,4,5,2,3,6,7,3,8,4,2,9,8};
 
	List<Integer> result = Arrays.stream(a).boxed().filter(n->n%2==0).collect(Collectors.toList());//forEach(System.out::println);
	result.forEach(System.out::println);
	
}
}