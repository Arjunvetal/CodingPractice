package com.interview;

import java.util.Scanner;

public class PalindromeRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		boolean result=isPalindrome(str,0,str.length()-1);
		System.out.println(result);

	}

	 static boolean isPalindrome(String str,int l,int h) {
		// TODO Auto-generated method stub
		if(l>=h)
			return true;
		
		if(str.charAt(l)!=str.charAt(h)){
			return false;
			}
			
		return isPalindrome(str, l+1, h-1);
		
		
	}

}
