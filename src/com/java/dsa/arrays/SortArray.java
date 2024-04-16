package com.java.dsa.arrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 4;
        arr[1] = 7;
        arr[2] = 3;
        arr[3] = 8;
        arr[4] = 1;

//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            if (i < arr.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
        
        System.out.println("Array before sorting "+Arrays.toString(arr));
        
//        Sorting array using bubble sort.
        
        bubbleSort(arr);
        
        
    }
    
    public static void bubbleSort(int [] arr) {
    	
    	int temp;
    	
    	for(int i=0;i<arr.length-1;i++) {
    		for(int j = 0;j<arr.length-1-i;j++) {
    			if(arr[j]>arr[j+1]) {
    				
    				temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    				
    			}
    		}
    	}
    	
    	System.out.println("Arr after sort "+ Arrays.toString(arr));
    }
}
