package com.java.dsa.arrays;

import java.util.Arrays;

public class MinAndMaxElemInArr {

	public static void main(String[] args) {
//		Given Array
		int[] arr = {4,7,2,6,7,8,9,10,3,13};
		
		int[] result = minMaxArr(arr); // using sort array
		
		
		System.out.println("Max and Min elem are " + result[0] + " and " + result[1]);
		
		
		int [] result1 = minMaxArrWithoutSort(arr);
		
		System.out.println("Min elem " + result1[0] + " Max elem " + result1[1]);
	}
	
//	Function which returns combo of min and max elements
	public static int[] minMaxArr(int[] arr) {
		
		Arrays.sort(arr);
		
		int[] array = {arr[0], arr[arr.length-1]};
		
		return array;
		
		
//		return new {1,2};
	}
	
	public static int[] minMaxArrWithoutSort(int [] arr) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int elem : arr) {
			if(elem < min) {
				min = elem;
			}
			
			if(elem>max) {
				max = elem;
			}
		}
		
		int[] result = {min, max}; 
		
		return result;
	}
}
