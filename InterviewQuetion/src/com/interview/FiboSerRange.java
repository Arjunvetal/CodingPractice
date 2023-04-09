package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FiboSerRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int n1=1,n2=2,sum=0;
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		while(sum<b) {
			sum=n1+n2;
			//System.out.println("sum=="+sum);
			if(sum>=a && sum<=b) {
				System.out.print(sum+ " ");
			}
			list.add(sum);
			n1=n2;
			n2=sum;
		}
		
		for(int i=0;i<list.size();i++) {
			
		}

	}

}
