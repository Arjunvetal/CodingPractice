package com.interview;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class NumReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		int digit=num;
		while(num>0) {
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
			
		System.out.println(reverse);
		
		duplicateString("Java");

	}
	public static void duplicateString(String str) {
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			set.add(ch);
		}
		
		System.out.println(set);
	}

}
