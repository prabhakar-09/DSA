package com.java.dsa.strings;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        // String s = "{[()}";
        // String s = "() {} []";
        String s = "[)";
        System.out.println(validateParentheses(s));
    }

    public static boolean validateParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char cc = stack.pop();
                if ((ch == ')' && cc != '(') || (ch == '}' && cc != '{') || (ch == ']' && cc != '[')) {
                    return false;
                }
            }
        }

        // Check if there are any unmatched opening brackets
        return stack.isEmpty();
    }
}
