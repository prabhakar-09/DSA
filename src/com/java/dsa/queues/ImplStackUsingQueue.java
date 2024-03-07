package com.java.dsa.queues;

import java.util.LinkedList;
import java.util.Queue;

/*Implement a last-in-first-out (LIFO) stack using only two queues. 
The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:

void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.

Input
["MyStack", "push", "push", "top", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 2, 2, false]

Explanation
MyStack myStack = new MyStack();
myStack.push(1);
myStack.push(2);
myStack.top(); // return 2
myStack.pop(); // return 2
myStack.empty(); // return False
*/
public class ImplStackUsingQueue {

//	In Java, you cannot directly create an instance of the Queue 
//	interface using the new keyword because the Queue interface is abstract and cannot be instantiated.
//	Queue<Integer> queue = new Queue<>(); 
	
	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int top;
	
	public ImplStackUsingQueue() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
		
	public void push(int n) {
		q2.offer(n);
		top = n;
		while(!q1.isEmpty()) {
			q2.offer(q1.poll());
		}
		
//		swapping queues
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
		
	}
	
	public int pop() {
		
		int popped = q1.poll();
		
		if(!q1.isEmpty()) {
			top = q1.peek();
		}
		return popped;
	}
	
	public int top() {
		
		return top;

	}
	
	public boolean empty() {
        return q1.isEmpty();
    }
	
	
	@Override
	public String toString() {
		return "ImplStackUsingQueue [q1=" + q1 + "]";
	}


	public static void main(String[] args) {
		
		ImplStackUsingQueue stack = new ImplStackUsingQueue();
		
		stack.push(1);
		stack.push(2);
		stack.push(3); // last inserted top elem as per stack 
		
		System.out.println("Curr Queue " + stack.q1);
		
		System.out.println("Popped Item is " + stack.pop());  // should pop 3 as per stack LIFO
		
		System.out.println("Top item is " + stack.top()); // should be 2 as per stack and 1 as per queue 
	}
}
