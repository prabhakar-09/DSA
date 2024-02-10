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

		// String str = "aba";
		// String str = "abca";
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
// Dry run 
// Initialize left to 0 and right to 3 (length of string - 1).
// Enter the while loop: left = 0 and right = 3.
// Check if str.charAt(left) (character at index 0, 'a') is equal to str.charAt(right) (character at index 3, 'a'). They are equal, so continue.
// Increment left (now left = 1) and decrement right (now right = 2).
// Check if str.charAt(left) (character at index 1, 'b') is equal to str.charAt(right) (character at index 2, 'c'). They are not equal.
// Since characters at indices 1 and 2 are not equal, the condition str.charAt(left) != str.charAt(right) is true.
// Return the result of isPalindrome(str, left + 1, right) || isPalindrome(str, left, right-1).
// For isPalindrome(str, left + 1, right): Check if the substring from index 2 to index 2 (str.substring(2, 2)) is a palindrome. It's a single character, so it's considered a palindrome.
// For isPalindrome(str, left, right-1): Check if the substring from index 1 to index 1 (str.substring(1, 1)) is a palindrome. It's a single character, so it's considered a palindrome.
// Since either of the conditions returns true, the method returns true.
// So, the output of validatingPalindrome("abca") is true.




