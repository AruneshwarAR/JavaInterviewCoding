package com.arun.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacters {
	
	
	public static void main(String[] args) {
		String str = "programming";
		Map<Character, Integer> countChar = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			countChar.put(c, (countChar.getOrDefault(c, 0) + 1));
		}
		System.out.println(countChar);
		System.out.println(countChar.size());
		for(Map.Entry<Character , Integer > e :countChar.entrySet()) { 
			if (e.getValue() ==1) {
				 System.out.println("output: "+ e.getKey());
				 //break;
			}
			
		}
	}
}
