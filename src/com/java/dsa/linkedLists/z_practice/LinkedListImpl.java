package com.java.dsa.linkedLists.z_practice;

public class LinkedListImpl {

	private static Node head;
	private static Node tail;

	public LinkedListImpl(){
		this.head = null;
		this.tail = null;
	}

	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
//	Adding data to LL
	public void addLast(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode; // setting current tail pointer to new node 
			tail = newNode;     // updating tail of the LL
		}
	}
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			
			newNode.next = head;
			head = newNode;
		}
	}
	
	public static void displayLL() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		
	}
	
	public static void sizeLL() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			
			count++;
			temp = temp.next;
		}
		
		System.out.println("Size of Linked List is : " + count);
	}
	
	public static void main(String[] args) {
		
		LinkedListImpl ll = new LinkedListImpl();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		
		ll.displayLL(); 
		
		ll.addFirst(0); // will add 0 at first
		
		System.out.println();
		
		ll.displayLL(); // Out : 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 
		
		System.out.println();
		
		ll.sizeLL();
	}
}
