package com.java.dsa.strings;

import java.util.HashSet;

/* Q. Longest Substring Without Repeating Characters :
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
*/
public class LongestSubstringLength {

	public static void main(String[] args) {

		String s = "abcabcbb";
		
		System.out.println("The length of longest substring is:  " + findLongestSubstring(s));
		
	}
	
	public static int findLongestSubstring(String s) {
		

		int maxLen = 0; // To store the max length of the longest substring.
		
		for(int i=0; i<s.length();i++) {
			
			HashSet<Character> set = new HashSet<>();
			int currentLength = 0;
			
			for(int j=i;j<s.length();j++) {
				
				if(!set.contains(s.charAt(j))) {
					
					set.add(s.charAt(j));
					currentLength++;
				}else {
					break;
				}
			}
			
			maxLen = Math.max(maxLen, currentLength);
			
		}
		
		return maxLen;
	}

}



// Code Dry Run below 

/*
 * Initial Setup: maxLen = 0: To store the maximum length of the longest
 * substring. 
 * 
 * Outer Loop (for(int i=0; i<s.length(); i++)): i = 0: Starting from
 * the first character "a". 
 * 
 * set: An empty HashSet to track unique characters.
 * currentLength = 0: To track the length of the current substring. 
 * 
 * Outer Loop Iteration 1 (i = 0): 
 * 
 * Inner Loop (for(int j=i; j<s.length(); j++)):
 * j = 0: Starting from the current character "a". set is empty, so add "a" to
 * the set, and currentLength becomes 1. 
 * 
 * j = 1: Moving to the next character
 * "b". "b" is not in the set, so add it to the set, and currentLength becomes 2. 
 * 
 * j = 2: Moving to the next character "c". "c" is not in the set, so add it
 * to the set, and currentLength becomes 3. 
 * 
 * j = 3: Moving to the next character
 * "a". "a" is already in the set, so break out of the inner loop. Update maxLen
 * to the maximum of maxLen and currentLength (3).
 * 
 * Outer Loop Iteration 2 (i = 1): 
 * 
 * Inner Loop (for(int j=i; j<s.length(); j++)):
 * 
 * j = 1: Starting from the current character "b". "b" is not in the set, so add
 * it to the set, and currentLength becomes 1. 
 * 
 * j = 2: Moving to the next
 * character "c". "c" is not in the set, so add it to the set, and currentLength
 * becomes 2. 
 * 
 * j = 3: Moving to the next character "a". "a" is not in the set, so
 * add it to the set, and currentLength becomes 3. 
 * 
 * j = 4: Moving to the next
 * character "b". "b" is already in the set, so break out of the inner loop.
 * Update maxLen to the maximum of maxLen and currentLength (3).
 * 
 * Outer Loop Iteration 3 (i = 2): 
 * 
 * Inner Loop (for(int j=i; j<s.length(); j++)):
 * 
 * j = 2: Starting from the current character "c". "c" is not in the set, so add
 * it to the set, and currentLength becomes 1. 
 * 
 * j = 3: Moving to the next
 * character "a". "a" is not in the set, so add it to the set, and currentLength
 * becomes 2. 
 * 
 * j = 4: Moving to the next character "b". "b" is not in the set, so
 * add it to the set, and currentLength becomes 3. 
 * 
 * j = 5: Moving to the next
 * character "c". "c" is already in the set, so break out of the inner loop.
 * Update maxLen to the maximum of maxLen and currentLength (3).
 */