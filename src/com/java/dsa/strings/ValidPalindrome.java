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

		String str = "aba";
		String str = "abca";
		String str = "abaad";
		
		System.out.println(validatingPalindrome(str));
		
	}
	
	public static boolean validatingPalindrome(String str) {
		
		int l_pointer = 0; // starting from start
		int r_pointer = str.length()-1; // starting from right both left & right pointers start point defined.
		
		while(l_pointer<= r_pointer) {
			
			if(str.charAt(l_pointer) != str.charAt(r_pointer)) {
				return isPlaindrome(str, l_pointer+1, r_pointer) || isPlaindrome(str, l_pointer+1, r_pointer);
			}
			l_pointer++;
			r_pointer--;
		}
		
		return true;
	}
	
	public static boolean isPlaindrome(String str, int left, int right) {
		
		while(left<=right) {
			
			if(str.charAt(left)!= str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}

}
