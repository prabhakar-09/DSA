package com.java.dsa.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplQueueUsingDeque {

	public static void main(String[] args) {
		
		Deque<Integer> queue = new ArrayDeque<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		System.out.println("Current Queue " + queue);
		
		System.out.println("Popped top elem of queue: " + queue.poll());
		
		System.out.println("Popped last entered elem of queue : " + queue.pollLast());
		
		
	}
}
