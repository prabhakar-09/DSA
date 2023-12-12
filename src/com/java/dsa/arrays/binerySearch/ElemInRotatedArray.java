package com.java.dsa.arrays.binerySearch;

/*
 * Search in rotated sorted array : you are given a rotated sorted array of distinct integers 
 * and a target value to search. The task is to find the index of the target in the array. 
 * If the target is not found, return -1
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4 
 * 
 * Explanation: In this example, the array [4,5,6,7,0,1,2] is rotated at some pivot. 
 * Even though the array is rotated, it is still sorted. The target value is 0,
 * and its index in the array is 4.
 * 
 * TC : logN
*/
public class ElemInRotatedArray {

	public static void main(String[]args) {
		
		int array[] = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(findTargetElement(array, target));
		
	}
	
	public static int findTargetElement(int[] array, int target) {
		
		int low = 0, high = array.length - 1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(array[mid] == target) {
				return mid; // target index
			}
			else if(array[low] < array[mid]) { // checking of low to mid is sorted or not 
//				meaning low to mid part is sorted 
				
//				checking for target if it lies between low & mid 
				if(target >= array[low] && array[mid] > target) {
					high = mid-1; // assuming the element lies within low & mid.
				}
				else {
					low = mid+1;
				}
			}
			else if(array[mid] < array[high]) { // checking if mid to high is sorted or not 
//				meaning mid to high part of the array is sorted..
				if(target > array[mid] && array[high] >= target) {
					
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
		}
		
		return -1;
	}
}
