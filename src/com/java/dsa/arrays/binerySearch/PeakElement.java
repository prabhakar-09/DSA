package com.java.dsa.arrays.binerySearch;

/*
 *  Given an array arr[] of size N, Return the index of any one of its peak elements. 
 *  
 *  Explanation : a peak element is not necessarily the same as the largest element. A peak element 
 *  
 *  is an element that is greater than or equal to its adjacent elements, but it doesn't have to be 
 *  
 *  the absolute largest element in the entire array. It only needs to be greater than or equal to its neighbors.

	For example, consider the array [1, 3, 20, 4, 1, 0]. In this array, the peak element is 20 
	
	because it is greater than its adjacent elements (3 and 4). However, 20 is not the 
	
	largest element in the array; 20 is simply a peak element.

	So, while a peak element is a local maximum, it may or may not be the largest element in the entire array.
*/

/*
 * Input: 
		N = 3
		arr[] = {1,2,3}
		Possible Answer: 2
		Generated Output: 1
		Explanation: index 2 is 3.
		It is the peak element as it is 
		greater than its neighbour 2.
		If 2 is returned then the generated output will be 1 else 0.
*/

public class PeakElement {

	public static void main(String[] args) {
		
		int[] arr = {2,4,8,12,6}; // unsorted array..
		
		// Printing the index of a peak element 
		System.out.println(getPeakElement(arr));
	}
	
	public static int getPeakElement(int [] array){
		
		int low = 0, high = array.length-1, mid = 0;
		
		int n = array.length-1; // storing length of array..
		
//		Applying binary search on the array tho it is unsorted... below goes the logic
		while(low<=high) {
			
			mid = (low+high)/2;
			
			if(mid > 0 && mid < n) {
				
				if(array[mid]>array[mid-1] && array[mid]>array[mid+1]) {
					
					return mid; 
				}
				else if(array[mid-1]>array[mid]) { 
					
					high = mid-1;
					
				}
				else if(array[mid+1]>array[mid]) { 
					
					low = mid+1;
				}
			}
			
			else if(mid == 0) {
				
				if(array[mid]> array[mid+1]) {	// check for first element to be peak..
					
					return 0;
					
				}
				else if(array[n]> array[n-1]) { // check for the last element to be peak..
					
					return n;
				}
			}
			
		}
		
		return -1;
	}
}
	
