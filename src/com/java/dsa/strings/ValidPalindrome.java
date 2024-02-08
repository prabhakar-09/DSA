package com.java.dsa.strings;

/*Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false*/

public class ValidPalindrome {

	public static void main(String[] args) {

		String str = "abca";
		
		System.out.println(validatingPalindrome(str));
		
	}
	
	public static boolean validatingPalindrome(String str){
		
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			
			if(str.charAt(left) != str.charAt(right)) {
				
				return isPalindrome(str, left + 1, right) || isPalindrome(str, left, right-1); 
			}
			left ++;
			right --;
		}
		return true;
		
	}
	
	public static boolean isPalindrome(String str, int left, int right) {
		
		while(left < right) {
			
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		
		return true;
	}

}
