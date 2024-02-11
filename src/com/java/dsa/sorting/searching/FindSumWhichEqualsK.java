package com.java.dsa.sorting.searching;


/*Given two unsorted arrays A of size N and B of size M of distinct elements, 
the task is to find all pairs from both arrays whose sum is equal to X.

Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input: arr[] = {1, 5, 7, -1, 5}, K = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
*/

public class FindSumWhichEqualsK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 8;
        int res = findPairs(arr, k);
        System.out.println(res);
    }

    public static int findPairs(int[] arr, int k) {
        int ans = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                ans++;
                left++; // Move left pointer forward to find other pairs
            } else if (sum < k) {
                left++; // Move left pointer forward
            } else { // sum > k
                right--; // Move right pointer backward
            }
        }
        return ans;
    }
}
