package com.java.dsa.linkedLists.medium;

public class ReturnNodeWhereCycleStarts {

	public static void main(String[] args) {
		
//		142. Linked List Cycle II
		
		/**
		 * Definition for singly-linked list.
		 * class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode(int x) {
		 *         val = x;
		 *         next = null;
		 *     }
		 * }
		 */
//		public class Solution {
//		    public ListNode detectCycle(ListNode head) {
//		        // Check for edge cases
//		        if (head == null || head.next == null) {
//		            return null; // No cycle if list is empty or has only one node
//		        }
//
//		        // Initialize slow and fast pointers
//		        ListNode slow = head;
//		        ListNode fast = head;
//
//		        // Phase 1: Detecting the cycle
//		        while (fast != null && fast.next != null) {
//		            slow = slow.next;
//		            fast = fast.next.next;
//		            
//		            if (slow == fast) {
//		                // Cycle detected
//		                break;
//		            }
//		        }
//
//		        // If no cycle found
//		        if (fast == null || fast.next == null) {
//		            return null;
//		        }
//
//		        // Phase 2: Finding the start of the cycle
//		        slow = head;
//		        while (slow != fast) {
//		            slow = slow.next;
//		            fast = fast.next;
//		        }
//
//		        return slow; // slow (or fast) now points to the start of the cycle
//		    }
//		}

	}
}
