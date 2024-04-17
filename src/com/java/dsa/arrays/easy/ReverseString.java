package com.java.dsa.arrays.easy;

public class ReverseString {

	public static void main(String[] args) {
		
		String str ="abcd", res="";
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			res = ch+res;
		}
		
		System.out.println(res);
	}
}
