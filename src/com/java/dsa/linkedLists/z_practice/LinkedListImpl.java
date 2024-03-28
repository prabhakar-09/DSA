package com.java.dsa.linkedLists.z_practice;

public class LinkedListImpl {

	private static Node head;

	public LinkedListImpl(){
		this.head = null;
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
	public void add(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			
			head = newNode;
		}else {
			Node currNode = head;
			
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			
			currNode.next = newNode;
		}
	}
	
	public static void displayLL() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		
	}
	
	public static void main(String[] args) {
		
		LinkedListImpl ll = new LinkedListImpl();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.displayLL();
	}
}
