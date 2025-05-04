package com.arun.practice;

import java.util.*;

public class CountC {
	public static void main(String[] args) {
		String givenStr = "programming one java";
		
		Map<Character, Integer> map = new HashMap<>();
		for (char c : givenStr.toCharArray()) {
			map.put(c, (map.getOrDefault(c, 0) + 1));
		}
		System.out.println(map);
//	map.forEach((k,v)-> System.out.println("k "+k+" : v "+v));
		map.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst().ifPresent(entry ->System.out.println(entry.getKey()));
	}
}
