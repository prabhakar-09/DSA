package com.java.dsa.arrays.binerySearch;

/*
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * You must write an algorithm that runs in O(log n) time.
 * 
 * Example 1:
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 * 
*/
public class MinimumInRotatedSortedArr {

	public static void main(String[] args) {

		int array[] = {3,4,5,1,2};
		System.out.println("Minimum element " + minimumElement(array));
	}

	public static int minimumElement(int[]array){
	
		int low = 0, high = array.length-1;
		
//		before hand check if the array is not rotated and fully sorted..
		if(array[low] <= array[high]) {
			return array[low];
		}
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(array[mid] < array[mid-1]) {
				return array[mid];
			}
			else if(array[mid] > array[mid+1]) {
				return array[mid+1];
			}
//			check for if the area is sorted 
			else if(array[low] <= array[mid]) {
				low = mid+1;
			}
			else if(array[mid] <= array[high]) {
				high = mid-1;
			}
		}
		
		return 0;
	}
}
