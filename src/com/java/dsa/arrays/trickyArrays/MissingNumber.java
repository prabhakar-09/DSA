package com.java.dsa.arrays.trickyArrays;

/*
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * 
 * Input: nums = [3,0,1]
 * Output: 2
 * 
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 
 * 2 is the missing number in the range since it does not appear in nums.
*/
public class MissingNumber {

	public static void main(String[]args) {
//		Carl Gauss gave a formula for the addition of a sequence like 1 to 10 seq or other.
//		sum = n*(n+1)/2; where n is the length of the sequence.
		
		/*
		 * Here's the logic :
		 * 1. First find the sum of the sequence of the array using its length & store it.
		 * 2. Find the sum of the array elements and store it in a variable.
		 * 3. Subtract the total sum of array with the sum of array elements. Return the sum.
		*/		
		
		int array[] = {9,6,4,2,3,5,7,0,1};
		System.out.println(findMissingNumber(array));
	}
	
	public static int findMissingNumber(int[]arr) {
		
		int n = arr.length; // complete length of array.
		
		int sumArr = n*(n+1)/2;
		int elemSum =0;
		
		for(int i=0; i<arr.length;i++) {
			elemSum += arr[i];
		}
//		for(int arrr : arr) {
//			elemSum += arrr;
//		}
		
		
		return sumArr-elemSum;
	}
//	formula works only when the 0 is included in the sequence
}
