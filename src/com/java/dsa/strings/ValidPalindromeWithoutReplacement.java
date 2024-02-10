package com.java.dsa.strings;

public class ValidPalindromeWithoutReplacement {

	public static void main(String[]args) {
//		String str = "racecar"; // reads same back & forth. Check for valid palindrome.
		String str = "itisnotwhatitis";
//		String str = "itseasyisntit";
		
		System.out.println(palindromeCheck(str));
		
	}
	
	public static boolean palindromeCheck(String str) {
		
		
		int left = 0;
		int right = str.length()-1;
		
		while(left<=right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
}
