package com.java.dsa.arrays.easy;

import java.util.HashSet;

public class PairSumEqualsK {

	public static void main(String[] args) {
		
        int[] arr = {2, 5, 6, 1, 3, 2};

        int k = 6;
        
        findPair(arr, k);
	}
	
	public static void findPair(int arr[], int k) {
		
		HashSet<Integer> res = new HashSet<>();
		
		for(int num : arr) {
			
			int compliment = k - num;
			
			if(res.contains(compliment)) {
				System.out.println("Pair found: " + compliment + ", " + num);
				return;
			}
			
			res.add(num);
			
			System.out.println(res);
		}
	}
}

// TC of O(n) since only single pass through the array is required...