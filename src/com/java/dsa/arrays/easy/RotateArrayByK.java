package com.java.dsa.arrays.easy;

import java.util.Arrays;

public class RotateArrayByK {

	public static void main(String[] args) {

//	Given an array and a value K you have to rotate the array by K times..
		
		int arr[] = {1,2,3,4,5,6,7};
		int k = 1; // Rotate the array by K times..
		
//		int start = 
		reverseArray(arr, 0, arr.length-1); // Step 1: full array reverse
		System.out.println("arr after first reverse " + Arrays.toString(arr));
		
		reverseArray(arr, 0, k-1); // Step 2: Reverse the first half values till k
		System.out.println("Arr after second half reverse "+ Arrays.toString(arr));
		
		reverseArray(arr, k, arr.length-1); // Step 3: Reverse the second half from k to end
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void reverseArray(int[] arr, int start, int end) {
		
		
		while(start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}
