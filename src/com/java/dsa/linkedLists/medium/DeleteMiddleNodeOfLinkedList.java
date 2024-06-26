package com.java.dsa.linkedLists.medium;

public class DeleteMiddleNodeOfLinkedList {

	public static void main(String[] args) {
		
//		1 -> 2 -> 3 -> 4 -> 5 : example LL
		
		/**
		 * Leetcode problem no. 2095
		 * 
		 * Definition for singly-linked list.
		 * public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode() {}
		 *     ListNode(int val) { this.val = val; }
		 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 * }
		 */
//		class Solution {
//		    public ListNode deleteMiddle(ListNode head) {
//		        // Step 1: Check if the list has only one node
//		        if(head.next == null)
//		            return null;
//
//		        // Step 2: Initialize slow and fast pointers
//		        ListNode slow = head;
//		        ListNode fast = head;
//
//		        // Step 3: Move the fast pointer twice as fast as the slow pointer
//		        while(fast.next.next != null && fast.next.next.next != null){
//		            slow = slow.next;
//		            fast = fast.next.next;
//		        }
//
//		        // At this point, the slow pointer is pointing to the node before the middle node
//		        // and the fast pointer is pointing to the last node
//
//		        // Step 4: Delete the middle node
//		        slow.next = slow.next.next;
//
//		        // Step 5: Return the modified list
//		        return head;
//		    }
//		}
	}
}
