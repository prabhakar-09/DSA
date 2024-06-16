package com.java.dsa.linkedLists.easy;

public class DeleteGivenNode {
	
	private static Node head;
	private static Node tail;
	
	public DeleteGivenNode() {
		
		this.head = null;
		this.tail = null;
	}
	
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
		}
	}
	
	public static void createNodeAtLast(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			
			tail.next = newNode;
			tail = newNode;
		}
		
		System.out.println("New added elem " + data);
	}
	
	public static void displayLL() {
		
		Node temp = head;
		
		while(temp != null) {
			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	
	public static void deleteNodeAtPosition(int position){
		
		if(position == 1) {
			head = head.next;
		}else {
			
			Node prev = head; // to keep track of prev node
			
			int count = 1;
			
			while(count < position-1) {
				
				prev = prev.next;
				count++;
				
			}
			
			prev.next = prev.next.next;
			
		}
	}


	public static void main(String[] args) {
		
		createNodeAtLast(5);
		createNodeAtLast(6);
		createNodeAtLast(7);
		createNodeAtLast(8);
		createNodeAtLast(9);
		createNodeAtLast(10);
						
		displayLL();

//		Delete node at a position
		deleteNodeAtPosition(4); // data at position 4 is 8
		
		System.out.println("List after delete");
		
		displayLL();
		
	}
}
