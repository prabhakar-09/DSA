package com.java.dsa.sorting.searching;

import java.util.Arrays;

/*Given an unsorted array and a number n, find if there exists
a pair of elements in the array whose difference is n.

Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
Output: Pair Found: (2, 80)

Input: arr[] = {90, 70, 20, 80, 50}, n = 45
Output: No Such Pair*/

public class FindPairWithGivenDifference {

	public static void main(String[] args) {

		int arr[] = {5, 20, 3, 2, 50, 80};
		int n = 78; // target difference number
		
		int res[] = findPair(arr,n);

		if(res != null) {
			System.out.println("Pair : (" + res[0] + "," + res[1] + ")");
		}else {
			System.out.println("No pair found!!");
		}
	}

	public static int[] findPair(int arr[], int n) {
		
		Arrays.sort(arr); // TC for Arrays.sort() is O(n log n) 
		int left = 0;
		int right = arr.length-1;
		int resArr [] = new int[2];
		
//		The two pointers traverse the array once from both ends, which takes O(n) time in the worst case.
		
		while(left<right) {
			int diff = arr[right]-arr[left];
			if(diff == n) {
				resArr[0] = arr[left];
				resArr[1] = arr[right];
				
				return resArr;
			}else if(diff<n) {
				left++;
			}else {
				right--;
			}

		}

		return null;
	}
}

/* Time & Space Complexity 
 * -----------------------
 * Time Complexity: O(n log n) 
 * Space Complexity: O(1)
 */
