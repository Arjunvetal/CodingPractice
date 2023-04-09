package com.interview;

import java.util.Scanner;

public class Coupa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		int temp=0;
		while(sum>0) {
			temp=temp+sum%10;
			sum=sum/10;
		}
		
		System.out.println(temp);

	}

}
