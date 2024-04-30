package com.java.dsa.arrays.medium;

import java.util.*;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {4,3,2,7,8,2,3,1}; 
		
		findAllDuplicates(arr);
	}
	
	public static void findAllDuplicates(int[]arr) {
		
		List<Integer> res = new ArrayList<>();
		
		HashSet<Integer> nums = new HashSet<>();
		
		for(int elem : arr) {
			
			if(nums.contains(elem)) {
				
				res.add(elem);
			}else {
				nums.add(elem);
			}
		}
		
		System.out.println(res);
	}
}
