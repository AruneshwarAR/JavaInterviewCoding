package com.arun.practice;

import java.util.*;

public class FindSecondMaxSecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 4, 7, 5, 8, 9, 3, 5 };
		List<Integer> list = new ArrayList<>();
		int j = 0;
		for (int i : a) {
			if (!list.contains(i)) {
			list.add(i);
			System.out.println(list.get(j++));}
		}
Collections.sort(list);
System.out.println(list);
		System.out.println("---");
		System.out.println(list.get(1));
		System.out.println(list.get(list.size() - 2));

	}

}
