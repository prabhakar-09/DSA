package com.java.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
//		System.out.println(arr.toString()); // this will print [I@515f550a which we don't want..
		
		System.out.println(Arrays.toString(arr)); // Use this instead to print the data
		
//		Printing the array in reverse 
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i] + " ");
		}
		
	}
}
