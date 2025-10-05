package com.java.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class OddEvenStreams {

	public static void main(String args[]) {
		
		List<Integer> transactionIds = Arrays.asList(101, 102, 103, 104, 105, 106);

		Map<Boolean, List<Integer>> groupedId = transactionIds.stream()
				.collect(Collectors.groupingBy(id -> id % 2 == 0));
		System.out.println(groupedId);

	}
}