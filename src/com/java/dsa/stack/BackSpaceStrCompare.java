package com.java.dsa.stack;

import java.util.*;

/*Given two strings s and t, return true if they are equal when both are 
typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".*/


public class BackSpaceStrCompare {

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		Boolean res = backSpaceCompare(s, t);
		
		System.out.println(res);
		
	}
	
	public static boolean backSpaceCompare(String s, String t) {
		
		Stack<Character> st1 = new Stack<>();
		
		Stack<Character> st2 = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c != '#') {
				
				st1.push(c);
			}else if(!st1.isEmpty()){
				st1.pop();
			}
		}
		
		for(char c : t.toCharArray()) {
			
			if(c !=  '#') {
				st2.push(c);
			}else if(!st2.isEmpty()){
				st2.pop();
			}
		}
		return st1.equals(st2);
	}
}

// Time & Space Complexity 

//TC : O(n).
//SC : O(n).
