package com.java.dsa.linkedLists.medium;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		
//		LC. P.no : 328. Odd Even Linked List
		
		/*
		 * Given the head of a singly linked list, group all the nodes with odd indices
		 * together followed by the nodes with even indices, and return the reordered
		 * list. The first node is considered odd, and the second node is even, and so
		 * on. Note that the relative order inside both the even and odd groups should
		 * remain as it was in the input. You must solve the problem in O(1) extra space
		 * complexity and O(n) time complexity.
		 */
		
		/**
		 * Definition for singly-linked list.
		 * public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode() {}
		 *     ListNode(int val) { this.val = val; }
		 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 * }
		 */
		
//		
//		class Solution {
//		    public ListNode oddEvenList(ListNode head) {
//
//		        // Check for edge cases where no rearrangement is needed
//		        if (head == null || head.next == null || head.next.next == null) {
//		            return head;
//		        }
//
//		        // Initialize pointers for odd and even lists
//		        ListNode oddHead = head;
//		        ListNode evenHead = head.next;
//		        ListNode odd = oddHead;
//		        ListNode even = evenHead;
//
//		        // Traverse the list and rearrange nodes
//		        while (even != null && even.next != null) {
//		            // Connect odd-indexed nodes
//		            odd.next = even.next;
//		            odd = odd.next;
//		            
//		            // Connect even-indexed nodes
//		            even.next = odd.next;
//		            even = even.next;
//		        }
//
//		        // Connect the end of odd list to the beginning of even list
//		        odd.next = evenHead;
//
//		        // Return the head of the rearranged list
//		        return oddHead;
//		    }
//		}


	}
}
