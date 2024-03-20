package com.java.dsa.linkedLists;

public class LinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.size = 0;
	}
	
	public void insertFirst(int value) { // inserting at first
		
		Node node = new Node(value);
		
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		
		size +=1;
	}
	
	public void insertLast(int value) {
		
		if(tail == null) {
			insertFirst(value);
			return;
		}
		
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void displayLL() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		
		System.out.println("End ");
	}
	
	private class Node {
		
		private int value;
		private Node next; // By default it points to null
		
		public Node(int value) { // constructor with only one value setting
			this.value = value;
		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}
		
	}
}
