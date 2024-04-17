package com.java.dsa.arrays.easy;

import java.util.Arrays;

public class ReverseGivenArray {

	
	public static void reverseArray(int[]arr, int n) {
		
//		Declare an array to store the reversed array
		
		int res[] = new int[n]; 
		
		for(int i=n-1;i>=0;i--) {
			
			res[n-i-1] = arr[i];
		}
		
		System.out.println("Arr after sort  " + Arrays.toString(res));
	}
	
	
	public static void main(String[] args) {
		
//		Declare an array :
		int [] arr = {5,4,3,2,1};
		
		int n = arr.length; // size of an array
		
		System.out.println("Arr before sort "+ Arrays.toString(arr));
		reverseArray(arr, n);
	}
}
