package com.java.dsa.arrays;

import java.util.Arrays;

public class BasicArray {
	
	public static void main(String[]args) {

		BasicArray.IntegerArrays();
		
		BasicArray.StringArrays();
		
	}
	
	public static void StringArrays() {
		
//		One way to store and print the string array.
		String[] weekDays = new String[7];
		
		weekDays[0] = "Monday";
		weekDays[1] = "Tuesday";
		weekDays[2] = "Wednesday";
		weekDays[3] = "Thursday";
		weekDays[4] = "Friday";
		weekDays[5] = "Saturday";
		weekDays[6] = "Sunday";
		
		System.out.println(Arrays.toString(weekDays));
		System.out.println();
		
//		Another way to store and print .
		String[] weekDay = {"Monday", "Tuesday", "Wednesday", 
							"Thursday", "Friday", "Saturday",
							"Sunday"};
		
		System.out.println("Printing using for each!!");
		System.out.println();
		for(String day : weekDay) {
			System.out.println(day);
		}
	}
	
	public static void IntegerArrays() {
//		Defining an array
//		type  name    memory allocation.
		int[] array = new int[5];
		
		
//		Storing values in 'array'
		array[0] = 2;
		array[1] = 4;
		array[2] = 6;
		array[3] = 8;
		array[4] = 10;
		
		
//		It converts the array arr into a human-readable string, displaying the elements of the array.									  0 1 2 3 4 5  Memory rep
		System.out.println(Arrays.toString(array)); // visual rep [2,4,6,8,10]
		
//		Inserting values while defining.
		int[] arr = new int[]
				{9,8,7,
				 6,5,4,
				 3,2,1};
		
//		Printing each array element using for loop.
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();

	}
}
