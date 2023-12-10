package com.java.dsa.arrays.binerySearch;

/*
 * Binary Search : efficient algorithm to find a specific element in a
 * sorted array. It works by repeatedly dividing the search interval in half.
 * The key comparison is performed, and the search continues in the left or
 * right subarray until the element is found or the search interval is empty.
 * Binary search has a time complexity of O(log n), making it significantly
 * faster than linear search for large datasets.
 * 
 * mid = low+high/2 
*/

public class BinarySearch {

	public static void main(String[]args) {
		
		int arr[] = {3,5,6,8,12,14,19,22};
		int key = 14;
				
		System.out.println(searchElement(arr, key));
	}
	
	public static int searchElement(int[]arr, int key) {
		int low = 0, high = arr.length - 1 , mid = 0;
		
		while(low <= high) {
			
			mid = (low+high)/2; // always enclose the division in the parenthesis.
			
			if(key == arr[mid]) {
				return mid; // returning index when element found!
			}else if(key < arr[mid]){
				high = mid-1; 
			}else {
				low = mid+1;
			}
		}
		
		return -1; // element not found!
	}
}
