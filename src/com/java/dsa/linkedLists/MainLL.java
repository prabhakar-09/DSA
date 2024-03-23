package com.java.dsa.linkedLists;

public class MainLL {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList(); // initially when we initialize it the size - 0 & head & tail will be present
		
		list.insertFirst(3);
		list.insertFirst(5);
		list.insertFirst(8);
		list.insertFirst(10);
		list.insertFirst(12); // will be inserted at the first index
		list.insertLast(112); // will be inserted in the last
		list.insert(100, 4); // out 12 -> 10 -> 8 -> 5 -> 100 -> 3 -> 112 -> End 
		list.displayLL(); // Out : 12 -> 10 -> 8 -> 5 -> 3 
		
	}
}
