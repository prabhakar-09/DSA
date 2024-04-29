package com.java.dsa.arrays.medium;

public class MaxSubArrSum {

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum subarray sum: " + findMaxSubArraySum(arr));
    }

    public static int findMaxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
            }
        }
        return maxSum;
    }
}
