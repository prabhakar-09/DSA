package com.java.dsa.arrays.binerySearch;

/*
 * Problem : Find first and last occurrence of the element in an array.
 * 
 * find the starting and ending position of a given target value.
   If target is not found in the array, return [-1, -1].
   You must write an algorithm with O(log n) runtime complexity.
   
   Example 1:

	Input: nums = [5,7,7,8,8,10], target = 8
	Output: [3,4]
	Example 2:
	
	Input: nums = [5,7,7,8,8,10], target = 6
	Output: [-1,-1]
	
	Since the array is sorted directly apply Binary Search..
*/
public class FirstLastPosArray {

    public static void main(String[] args) {

        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = firstLastOccurrence(arr, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] firstLastOccurrence(int[] arr, int target) {
        int[] result = {-1, -1};
        int n = arr.length - 1;

        // Finding first occurrence
        int low = 0, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result[0] = mid;
                high = mid - 1; // Move to the left to find the first occurrence.
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Finding the second occurrence
        low = 0;
        high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result[1] = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
