package com.interview;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		
		Map<Character, Long> map=str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c ->c,Collectors.counting()));
		
		map.forEach((c,count) -> System.out.println(c+" "+count));

	}

}


/* 
	 * String str = "hello world";
	Map<Character, Long> charCountMap = str.chars()
	        .mapToObj(c -> (char) c) // convert each int to char
	        .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // group by char and count occurrences
	
	charCountMap.forEach((c, count) -> System.out.println(c + ": " + count));

 * */
 