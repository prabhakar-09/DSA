package com.java.dsa.arrays.trickyArrays;

import java.util.HashMap;

/*
 * Find the Duplicate Number :
 * Given an array of integers nums containing n + 1 integers 
 * where each integer is in the range [1, n] inclusive. 
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * 
 * Example 1:
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [3,1,3,4,2]
 * Output: 3
*/

public class FindDuplicate {

	public static void main(String[] args) {

		int array[] = {3,1,1,4,2};
		
		System.out.println(findDuplicate(array));
	}
	
	public static int findDuplicate(int arr[]) {
		
		HashMap<Integer, Integer> elements = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
		
			int currentElem = arr[i];
			
			if(elements.containsKey(currentElem)) {
				return currentElem;
			}else {
				elements.put(currentElem, i);
			}
		}
		
		return -1; // no duplicate found!!
	}

}

// code breakdown below::


/*
 * array = [3,1,1,4,2]
 * 
 * Initialize HashMap and Loop Start
 * 
 * elements = {} 
 * Start looping through the array from left to right. 
 * 
 * Iteration 1
 * (i=0) - currentElem = 3
 * 
 * elements = {3: 0} 
 * Check if 3 is already in the HashMap. No duplicate found.
 * 
 * Iteration 2 
 * (i=1) - currentElem = 1
 * 
 * elements = {3: 0, 1: 1} 
 * Check if 1 is already in the HashMap. No duplicate
 * found. 
 * 
 * Iteration 3 
 * (i=2) - currentElem = 1
 * 
 * elements = {3: 0, 1: 2} 
 * 
 * Check if 1 is already in the HashMap. Duplicate
 * found! Return 1. End of Loop
 * 
 * The loop ends since a duplicate has been found. 
 * 
 * Output Print 1 (the first duplicate). 
 * 
 * Here's a summary of the HashMap after each
 * iteration:
 * 
 * Iteration 1: {3: 0} 
 * Iteration 2: {3: 0, 1: 1} 
 * Iteration 3: {3: 0, 1: 2}
 */
