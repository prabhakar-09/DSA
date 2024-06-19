package com.java.dsa.optimized;

import com.java.dsa.linkedLists.easy.nthNodeFromEnd.Node;

public class NthNodeFromEndOptimized {
	
	public static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			
			this.data = data;
		}
	}
	
	
//	This method takes two traversals to complete
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

	public static Node nthNode2(Node head, int n) {
		
		Node slow = head;
		Node fast = head;
		
		for(int i=1;i<=n;i++) {
			
			fast = fast.next;
		}
		
		while(fast != null) {
			
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
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
		
		System.out.println();
		
		Node temp2 = nthNode2(a, 3);
		System.out.println(temp2.data);
	}
}
