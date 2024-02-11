package com.java.dsa.sorting.searching;

import java.util.Arrays;

/*Permute two arrays such that sum of every pair is greater or equal to K

Input : a[] = {2, 1, 3}, 
b[] = { 7, 8, 9 }, 
k = 10. 
Output : Yes
Permutation  a[] = { 1, 2, 3 } and b[] = { 9, 8, 7 } 
satisfied the condition a[i] + b[i] >= K.

Input : a[] = {1, 2, 2, 1}, 
b[] = { 3, 3, 3, 4 }, 
k = 5. 
Output : No*/


public class PermuteArraysForSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int[] arr2 = { 3, 3, 3, 4 };
//        int[] arr = {2, 1, 3};
//        int[] arr2 = {7, 8, 9};
        int k = 10;
        
        boolean res = isValidSum(arr, arr2, k);
        
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isValidSum(int[] arr1, int[] arr2, int k) {
        Arrays.sort(arr1); // Sorting first array
        Arrays.sort(arr2); // Sorting second array
        
        int left = 0;
        int right = arr2.length - 1;
        
        while (left < arr1.length && right >= 0) {
            int sum = arr1[left] + arr2[right];
            if (sum < k) {
                left++; // Move to next element in the first array
            } else if (sum >= k) {
                right--; // Move to previous element in the second array
            }
            if (sum >= k) {
                return true; // Found a pair with sum greater than or equal to k
            }
        }
        
        return false; // No pair found with sum greater than or equal to k
    }
}

