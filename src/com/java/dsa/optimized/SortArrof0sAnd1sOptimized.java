package com.java.dsa.optimized;

import java.util.Arrays;

// This method sorts the array of unsorted 0s & 1s using two pointer approach..
public class SortArrof0sAnd1sOptimized {

	public static void main(String[] args) {
		
		int[] arr = {1,0,0,1,1,0,1,0,1};
		
		System.out.println("Before swap " + Arrays.toString(arr));
		
		sortArray(arr);
	}
	
	public static void sortArray(int[] arr) {
		
		int n = arr.length;
		
		int left = 0;
		int right = n-1;
		
		while(left<right) {
			
			if(arr[left] == 0) {
				left++;
			}
			else if(arr[right] == 1) {
				right--;
			}
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		System.out.println("After swap " + Arrays.toString(arr));
	}
}
