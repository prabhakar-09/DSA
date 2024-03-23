package com.java.dsa.linkedLists.z_practice;

public class LinkedLists {

	public static class Node{
		
		int data; // value
		Node next; // will store address of the next node
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static void displayLL(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void displayLLR(Node head) {
		
		if(head == null) return;
		System.out.print(head.data + " ");
		displayLL(head.next);
	}
	
	public static void displayLLReverse(Node head) {
		
		if(head == null) return;
		displayLLReverse(head.next);
		System.out.print(head.data + " ");
	}
	
	public static void main(String[] args) {
		
		Node a = new Node(1); // head node
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		
//		linking LL with each other...
		a.next = b; // 1 -> 2 3 4 5
		b.next = c; // 1 -> 2 -> 3 4 5
		c.next = d; // 1 -> 2 -> 3 -> 4 5
		d.next = e; // 1 -> 2 -> 3 -> 4 -> 5 // all linked
		
//		printing LL
		Node temp = a; // temp references to a
		
//		for(int i = 0;i<5;i++) {
//			
//			System.out.print(temp.data + " -> ");
//			temp = temp.next; // next address of the node
//		}
		
//		Printing LL using while loop
		
//		while(temp != null) {
//			
//			System.out.print(temp.data + " -> ");
//			temp = temp.next;
//		}
		
//		Displaying using functions
		
		displayLL(a); // passing head node 
		
		
		System.out.println();
		
//		Displaying LL recursively
		displayLLR(a);
		
		System.out.println();
		
//		Displaying LL in reverse
		displayLLReverse(a);
	}
	
	
}
