package com.java.dsa.arrays.easy;

import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 
respectively.
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		
		int m=3;
		int n=3;
		
		
		System.out.println("Both arrays before merge " + Arrays.toString(nums1) + " " + Arrays.toString(nums2));
		
		mergeSortedArrays(nums1, nums2, m, n);

		System.out.println("Array after merge " + Arrays.toString(nums1));
	}
	
	public static void mergeSortedArrays(int[]nums1, int[]nums2, int m, int n) {
		
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		while(j>=0) {
			
			if(i>=0 && nums1[i]>nums2[j]) {
				
				nums1[k] = nums1[i];
				i--;
				k--;
			}
			else {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
		}
	}
}
