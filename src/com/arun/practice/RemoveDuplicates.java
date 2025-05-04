package com.arun.practice;
import java.util.*;

public class RemoveDuplicates {
public static void main(String[] args) {
	String str = "Programming";
	Set<Character> set = new LinkedHashSet<>();
	for(Character c: str.toCharArray()) {
		set.add(c);
	}
	StringBuilder strb = new StringBuilder();
	for(Character c: set) {
		strb.append(c);
	}
//	strb.append(set);
	System.out.println(strb);
	
}
}
