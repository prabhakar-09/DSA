package com.java.dsa.linkedLists.easy;

// We need to find the nth node from the end 
// E.g : 1 2 3 4 5 -> Here last node is 5 given n = 2 finding nth from last would be like node number 3
public class nthNodeFromEnd {
	
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
		}
	}
	
	public static Node nthNodeFind(Node a, int n) {
		
		Node temp = a; // this is a head node
		
		int size = 0;
		
		while(temp != null) {
			
			size++;
			temp = temp.next;
		}
		
		int m = size - n + 1;
		temp = a;
		
		for(int i=1; i<= m-1; i++) {
			
			temp = temp.next;
		}
		
		return temp;
	}

	public static void main(String[] args) {
		
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node temp = nthNodeFind(a, 3);
		
		System.out.println(temp.data);
	}
}
