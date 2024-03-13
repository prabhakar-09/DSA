package com.java.dsa.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplStackQueUsingDeque {

	public static void main(String[] args) {
		
//		Implementing stack first 
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack);
		
		System.out.println("Top popped elem is - " + stack.pop());
		
		System.out.println("Top element of stack - " + stack.peek());
		
		System.out.println("Is the stack empty - " + stack.isEmpty());
		
		
		System.out.println();
//		Implementing queue 
		MyQueue<Integer> queue = new MyQueue<>();
		
		queue.offer(5);
		queue.offer(6);
		queue.offer(7);
		queue.offer(8);
		
		System.out.println(queue);
		
		System.out.println("Popped operation - " + queue.poll());
		
		System.out.println("Top element - " + queue.peek());
		
		System.out.println("Is queue empty - " + queue.isEmpty());
	}
	
	static class MyStack<Integer>{
		
		private Deque<Integer> deque;
		
		public MyStack() {
			deque = new ArrayDeque<>();
		}
		
		
		public void push(Integer elem) {
			deque.add(elem);
		}
		
		public Integer pop() {
			return deque.removeLast();
		}
		
		public Integer peek() {
			return deque.peekLast();
		}
		
		public boolean isEmpty() {
			return deque.isEmpty();
		}


		@Override
		public String toString() {
			return "MyStack [deque=" + deque + "]";
		}

	}
	
	static class MyQueue<Integer>{
		
		private Deque<Integer> deque;
		
		public MyQueue(){
			deque = new ArrayDeque<>();
		}
		
		public void offer(Integer elem) {
			deque.add(elem);
		}
		
		public Integer poll() {
			return deque.removeFirst();
		}
		
		public Integer peek() {
			return deque.peekFirst();
		}
		
		public boolean isEmpty() {
			return deque.isEmpty();
		}

		@Override
		public String toString() {
			return "MyQueue [deque=" + deque + "]";
		}
		
	}
}
