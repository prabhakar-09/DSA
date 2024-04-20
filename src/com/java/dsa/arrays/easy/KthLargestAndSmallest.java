package com.java.dsa.arrays.easy;

import java.util.Arrays;

public class KthLargestAndSmallest {

	public static void main(String[] args) {
		
		int arr[] = {1,6,7,3,5,8,9};
		
		int k = 3; // means find 3rd largest & 3rd smallest elements of an array..
		
		kthLargestAndSmallest(arr, k);
	}
	
	public static void kthLargestAndSmallest(int [] arr, int k) {
		
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println("Third largest & third smallest elements are " + arr[n-k] + " & " + arr[k-1]);
	}
}
