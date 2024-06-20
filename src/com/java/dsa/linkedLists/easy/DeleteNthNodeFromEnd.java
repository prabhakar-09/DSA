package com.java.dsa.linkedLists.easy;

// Deleting the nth node in one traversal..

public class DeleteNthNodeFromEnd {
	
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
		}
	}
	
	public static Node deleteNthNode(Node head, int x) {
		
		Node slow = head;
		Node fast = head;
		
		for(int i=1;i<=x;i++) {
			fast = fast.next;
		}
		
//		If we need to delete first node(head node itself) from the end that means the given number to delete from end 
//		would be the size of linked list.. In such cases check for the below condition & handle accordingly.
		
		if(fast == null) {
			
			head = head.next;
			return head;
		}
		
		while(fast.next != null) {
			
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		return head;
		
//		System.out.println();
	}
	
	public static void displayLL(Node head) {
		
		Node temp = head;
		
		while(temp != null) {
			
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		
		Node a = new Node(2);
		Node b = new Node(4);
		Node c = new Node(6);
		Node d = new Node(8);
		Node e = new Node(10);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node temp = a;
		
		System.out.println("Nodes before deletion ");
		
		while(temp != null) {
			
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		
		Node aa = deleteNthNode(a, 5);
		
		System.out.println("After delete");
		
		
		displayLL(aa);
	}
}
