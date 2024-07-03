package com.java.dsa.arrays.easy;

import java.util.Arrays;

public class MovingAllNegative {

	public static void main(String[] args) {
		
//		Given an array of positive and negative integers move all negatives to one side 
		
		int arr[] = {1,4,6,-8,0,-2,-3,-4,22,-33,10};
		
		moveNegativeToLeft(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void moveNegativeToLeft(int arr[]) {
		
//		int n = arr.length;
//		int negIndex = 0; // to store the index of negative values where we gonna move all neg elements
//		
//		for(int i=0;i<n;i++) {
//			
//			if(arr[i]<0) {
//               
//				// If the current element is negative, swap it with the element at negIndex
//				int temp = arr[i];
//				arr[i] = arr[negIndex];
//				arr[negIndex] = temp;
//				negIndex++;
//			}
//		}
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
		    // Move the left pointer until finding a negative number
		    while (left <= right && arr[left] < 0) {
		        left++;
		    }
		    
		    // Move the right pointer until finding a positive number
		    while (left <= right && arr[right] >= 0) {
		        right--;
		    }
		    
		    // Swap if left pointer is still to the left of the right pointer
		    if (left < right) {
		        int temp = arr[left];
		        arr[left] = arr[right];
		        arr[right] = temp;
		        left++;
		        right--;
		    }
		}

//		System.out.println(Arrays.toString(arr));

	}
}
