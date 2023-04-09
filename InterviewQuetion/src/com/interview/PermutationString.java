package com.interview;

import java.util.Scanner;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		permutation(s.toCharArray(),0);

	}

	private static void permutation(char[] charArray, int fi) {
	
		if(fi==charArray.length-1) {
			System.out.println(charArray);
			return;
		}
		
		for(int i=fi;i<charArray.length;i++) {
			 	swap(charArray,i,fi);
			 	permutation(charArray, fi+1);
			 	swap(charArray,i,fi);
		}
		
	}

	private static void swap(char[] charArray, int i, int fi) {
		
		char temp=charArray[i];
		charArray[i]=charArray[fi];
		charArray[fi]=temp;
		
	}

}
