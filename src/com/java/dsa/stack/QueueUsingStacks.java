package com.java.dsa.stack;
import java.util.*;

/*Implement a first in first out (FIFO) queue using only two stacks. 
The implemented queue should support all the functions
of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

void push(int x) Pushes element x to the back of the queue.
int pop() Removes the element from the front of the queue and returns it.
int peek() Returns the element at the front of the queue.
boolean empty() Returns true if the queue is empty, false otherwise.

*/

public class QueueUsingStacks {


	Stack<Integer> inpStack;
	Stack<Integer> outStack;
	
	public QueueUsingStacks() {
		inpStack = new Stack<>();
		outStack = new Stack<>();
	}
	
	public void push(int x) {
		
		inpStack.push(x);
	}
	

	public int pop() {
		
		if(outStack.isEmpty()) {
			transferStack(); // Internal method 
		}
		
		return outStack.pop();
	}
	
	public int peek() {
		
		if(outStack.isEmpty()) {
			transferStack();
		}
		
		return outStack.peek();
	}
	
	public boolean empty() {
		return inpStack.isEmpty() && outStack.isEmpty();
	}
	
//	making it private ensures that the queue's internal state remains consistent and is 
//	not modified by external code.
	private void transferStack() {
		while(!inpStack.isEmpty()) { // '!' because isEmpty() returns true when stack empty
			outStack.push(inpStack.pop());
		}
	}
	
	@Override
	public String toString() {
		return "QueueUsingStacks [inpStack=" + inpStack + ", outStack=" + outStack + "]";
	}
	
	public static void main(String[] args) {
		
		QueueUsingStacks queue = new QueueUsingStacks();
		
		queue.push(2);
		queue.push(4);
		queue.push(6);
		queue.push(8);
		queue.push(10);
		
		System.out.println("Queue after adding elements " + queue); // to print this make sure toString is present in the class 
		
		System.out.println(queue.peek()); // returns 2 as the top element as per queue
		System.out.println(queue.pop()); // pops top 2 as per queue
		System.out.println(queue.empty());
		
	}

}


// TC & SC for the above code

/*
 * Time Complexity: push(int x): This operation involves pushing an element onto
 * the inpStack, which has a time complexity of O(1).
 * 
 * pop(): If the outStack is not empty, this operation simply involves popping
 * an element from the outStack, which also has a time complexity of O(1).
 * However, if the outStack is empty, it requires transferring all elements from
 * the inpStack to the outStack using the transferStack() method, which takes
 * O(n) time, where n is the number of elements in the queue.
 * 
 * peek(): Similar to pop(), if the outStack is not empty, this operation
 * involves peeking at the top element of the outStack, which has a time
 * complexity of O(1). Otherwise, it requires transferring elements from
 * inpStack to outStack, which also takes O(n) time.
 * 
 * empty(): This operation checks if both inpStack and outStack are empty, which
 * has a time complexity of O(1).
 * 
 * Space Complexity:
 * 
 * 2N :there are two stacks (inpStack and outStack), each potentially containing
 * up to N elements, where N is the total number of elements in the queue.
 */