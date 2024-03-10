package com.java.dsa.deque;

import java.util.ArrayDeque;
import java.util.Deque;

// Deque supports insertion & deletion from both the ends front & rare
// Deque is an Interface. ArrayDeque & LinkedList implements this interface 
public class DequeIntro {

	public static void main(String[] args) {
		
		Deque<Integer> arrDeq = new ArrayDeque<>();
		
//		Add operations 
		arrDeq.add(2);
		arrDeq.offerFirst(4); // adds at the first 
		arrDeq.offerLast(5); // adds at the end 
		arrDeq.add(6); // will add after 5 so far OUT -> [4, 2, 5, 6]
		arrDeq.offerFirst(1); // After this addition OUT -> [1, 4, 2, 5, 6]

//		To add elem at the last we can use below functions
//		arrDeq.addLast();
		
		System.out.println(arrDeq);
		
		System.out.println("First/top elem " + arrDeq.peek() + 
							" | Also First/top " + arrDeq.peekFirst() + 
							" | Last elem or Top as per stack " + arrDeq.peekLast());
		
//		Remove operations
		arrDeq.poll(); // will remove the element from the top as per queue which is 1
		arrDeq.pollFirst(); // wil do the same 
		arrDeq.pollLast(); // will remove last or top elem as per stack which is 6
	}
}


/*
 * Definition: Deque is a linear collection that supports the insertion and
 * removal of elements at both ends. It can be used as a queue (FIFO -
 * First-In-First-Out) or a stack (LIFO - Last-In-First-Out).
 * 
 * Interface: Deque interface extends the Queue interface and provides
 * additional methods for inserting, removing, and inspecting elements at both
 * ends.
 * 
 * Implementation Classes: Java provides several implementations of the Deque
 * interface, including ArrayDeque, LinkedList, and LinkedBlockingDeque.
 * 
 * ArrayDeque: ArrayDeque is a resizable-array implementation of the Deque
 * interface. It is not thread-safe but offers better performance compared to
 * LinkedList in most situations.
 * 
 * LinkedList: LinkedList is a doubly-linked list implementation of the Deque
 * interface. It provides efficient insertion and removal operations but may
 * have higher overhead due to its node-based structure.
 * 
 * Common Methods: Some common methods provided by the Deque interface include
 * addFirst(), addLast(), offerFirst(), offerLast(), removeFirst(),
 * removeLast(), pollFirst(), pollLast(), getFirst(), getLast(), peekFirst(),
 * peekLast(), etc.
 * 
 * Performance: The performance characteristics of Deque implementations may
 * vary based on the specific operations and the underlying data structure.
 * ArrayDeque generally offers better performance for most operations due to its
 * array-based implementation.
 * 
 * Usage: Deque is commonly used in scenarios where elements need to be added or
 * removed from both ends of the collection, such as implementing double-ended
 * queues, sliding window algorithms, or maintaining a history of recently
 * visited elements.
 * 
 * Thread Safety: The implementations of Deque interface in Java (e.g.,
 * ArrayDeque, LinkedList) are not thread-safe by default. If thread safety is
 * required, you can use Collections.synchronizedDeque() method to obtain a
 * synchronized (thread-safe) wrapper around a Deque.
 * 
 * Null Elements: Deque implementations generally allow null elements unless
 * specified otherwise by a specific implementation.
 */