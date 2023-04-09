package com.interview;

import java.util.Arrays;

public class ZeroatRightArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,3,5,0,4,2,0,1,0};
		System.out.println(Arrays.toString(arr));
		atRightZero(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	public static void atRightZero(int[] arr) {
		
		int nz=0,z=0;
		
		while(nz<arr.length) {
			if(arr[nz]!=0) {
				int temp=arr[nz];
				arr[nz]=arr[z];
				arr[z]=temp;
				
				nz++;
				z++;
			}else {
				nz++;
			}
		}
		
	}

}
