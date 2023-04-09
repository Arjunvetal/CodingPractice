package com.interview;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		
		String str1=str.replaceAll(" ", "");
		
		System.out.println(str1);

	}

}
