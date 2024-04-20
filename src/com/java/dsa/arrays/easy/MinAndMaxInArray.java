package com.java.dsa.arrays.easy;

public class MinAndMaxInArray {

	public static void main(String[] args) {
		
		int [] arr = {5,6,9,2,1,10,14,13,18};
		
		findMinMax(arr);
	}
	
	public static void findMinMax(int [] arr) {
		
		int min = Integer.MAX_VALUE; // since we override the value while comparing..
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			else if(arr[i]> max) {
				
				max = arr[i];
			}
		}
		
		System.out.println("The min & max values in the array are : " + min + " & " + max);
	}
}
