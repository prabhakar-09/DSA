package com.java.dsa.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplStackUsingDeque {

	public static void main(String[] args) {
		
		Deque<Integer> stack = new ArrayDeque<>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		
		System.out.println("Current Stack : " + stack);
		
		System.out.println("Top element of stack is : " + stack.peekLast());
		
		System.out.println("Popping top elem of stack " + stack.pollLast());
	}
}
