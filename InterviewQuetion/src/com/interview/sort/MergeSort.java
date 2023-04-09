package com.interview.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,11,2,4,8,1,3};
		sort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
		

	}

	private static void sort(int[] arr,int start,int end) {
		
		if(arr.length<=1) return;
		
		int[] temp=new int[arr.length];
		mergeHelper(arr,0,arr.length-1,temp);
		
	}

	private static void mergeHelper(int[] arr, int start, int end, int[] temp) {
		
		if(start>=end) return;
		
		int mid=start+(end-start)/2;
		
		mergeHelper(arr, start, mid, temp);
		mergeHelper(arr, mid+1, end, temp);
		merge(arr,start,mid,end,temp);
		
	}

	private static void merge(int[] arr, int start, int mid, int end, int[] temp) {
		
		int left=start;
		int right=mid+1;
		int index=start;
		
		while(left<=mid && right<=end) {
			if(arr[left]<=arr[right]) {
				temp[index]=arr[left];
				left++;
			}else {
				temp[index]=arr[right];
				right++;
			}
			index++;
		}
		while(left<=mid) {
			temp[index]=arr[left];
			left++;
			index++;
			
		}
		while(right<=end) {
			temp[index]=arr[right];
			right++;
			index++;
		}
		for(int i=start;i<=end;i++) {
			arr[i]=temp[i];
		}
		
	}

}
