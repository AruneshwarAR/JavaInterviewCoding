package com.java.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Set;

public class OddEvenStreams {

	public static void main(String args[]) {

		List<Integer> transactionIds = Arrays.asList(101, 102, 103, 104, 105, 106);

		Map<Boolean, List<Integer>> groupedId = transactionIds.stream()
				.collect(Collectors.groupingBy(id -> id % 2 == 0));
		System.out.println(groupedId);

		List<String> emails = Arrays.asList("alex@example.com", "bob@example.com", "charli@example.com",
				"alex@example.com", "david@example.com", "bob@example.com");
		Map<String, Long> emailCounts = emails.stream()
				.collect(Collectors.groupingBy(email -> email, Collectors.counting()));
		System.out.println(emailCounts);
		
		Set<String> duplicateEmails = emailCounts.entrySet()
			    .stream()                               // 1. Stream the entries
			    .filter(entry -> entry.getValue() > 1)  // 2. Find entries with a count > 1
			    .map(entry -> entry.getKey())           // 3. Transform each entry into its key
			    .collect(Collectors.toSet());           // 4. Collect the keys into a Set

			System.out.println(duplicateEmails);

	}
}