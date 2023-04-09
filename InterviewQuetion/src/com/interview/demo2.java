package com.interview;

//Print min numbers from fibonacci series so that sum of those numbers is equal to given number.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		minNumber(num);
				

	}

	private static void minNumber(int k) {
		// TODO Auto-generated method stub
		
		 List<Integer> list = new LinkedList<>();
	        int num=0,n1=1,n2=2,count=0,i;
	        list.add(1);
	        list.add(2);
	        while(num<k)
	        {
	            num = n1+n2;
	            list.add(num);
	            n1=n2;
	            n2=num;
	        }
	        System.out.println("num "+num);
	        i=list.size()-1;
	        while(k>0){
	            if(list.get(i)>k)
	                i--;
	            else if(list.get(i)==num || list.get(i)<num)
	            {
	            	System.out.print(list.get(i)+" ");
	                count++;
	                k-=list.get(i);
	            }
	        }
	       
		
	}

}
