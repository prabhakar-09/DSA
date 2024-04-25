package com.java.dsa.arrays.easy;

import java.util.Arrays;

public class SortArrof0sAnd1s {

	public static void main(String[] args) {
		
		int [] arr = {0,0,1,0,1,0}; // sort this to 0s & 1s arr size 6 - starting from 1
		
		sortArr(arr);
	}
	
	public static void sortArr(int[] arr) {
		
		int n = arr.length; // len == 6
		
		for(int i=0;i<n;i++) {
			System.out.println("Outer loop index " + i);
			for(int j=0;j<n-1;j++) {
				System.out.println("inner loop index " + j);
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
