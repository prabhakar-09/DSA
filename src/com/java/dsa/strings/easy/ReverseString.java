package com.java.dsa.strings.easy;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "abcd";
		
//		reverse the above string
		String res = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			res += str.charAt(i);
		}
		
		System.out.println("The reversed string is " + res);
		
	}
}
