package com.java.dsa.strings;

import java.util.Arrays;

/*Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] str = {"flower","flow","flight"};
		String ans = returnPrefix(str);
		System.out.println(ans);
	}
	
	public static String returnPrefix(String[] str) { // passing the array of string
		
//		Sorting the given array of string
		Arrays.sort(str); // this will sort the str array Lexicographically
		
//		storing first & last string 
		String str1 = str[0];
		String str2 = str[str.length - 1];
		
		int i = 0;
		
		while(i < str1.length() && str1.charAt(i) == str2.charAt(i)) {
			i++;
		}
		
		return i == 0 ? "" : str1.substring(0,i);
		
	}
}
