package com.java.dsa.z_practice;
import java.util.*;

/*The formula we follow here :
	1. Add elem in Q2
	2. Transfer Q1 elem by elem into Q2
	3. Swap Q2 with Q1 meaning send all elem of Q2 to Q1
	4.*/

public class StacksUsingQueues {

	Queue<Integer> q1;
	Queue<Integer> q2;
	
	public StacksUsingQueues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	public void push(int x) {
		
		q2.offer(x); // adding elems into q2
		
		while(!q1.isEmpty()) {
			
			q2.offer(q1.poll());
		}
		
		Queue<Integer> temp;
		temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public int pop() {
		
		return q1.poll();
	}
	
	public int peek() {
		
		return q1.peek();
	}
	
	@Override
	public String toString() {
		return "StacksUsingQueues [q1=" + q1 + ", q2=" + q2 + "]";
	}

	public static void main(String[] args) {
		
		StacksUsingQueues stq = new StacksUsingQueues();
		
		stq.push(1); // first elem 
		stq.push(2);
		stq.push(3);
		stq.push(4);
		stq.push(5);
		
		System.out.println("Queue 1 " + stq.q1 + " Queue 2 " + stq.q2);
		
		System.out.println("Top elem of stack " + stq.peek());
		
		System.out.println("Popped elem of stack LIFO " + stq.pop());
	}
}
