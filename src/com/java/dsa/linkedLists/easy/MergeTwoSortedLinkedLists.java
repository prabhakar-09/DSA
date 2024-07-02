package com.java.dsa.linkedLists.easy;

public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {
//		Leetcode P.no 21
		
		/*
		 * You are given the heads of two sorted linked lists list1 and list2.
		 * 
		 * Merge the two lists into one sorted list. The list should be made by splicing
		 * together the nodes of the first two lists.
		 * 
		 * Return the head of the merged linked list.
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
		
//		This solution using one extra space for a LL. This can further be optimized without using any extra space.
		
//		class Solution {
//		    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//		        
//		        ListNode temp1 = list1;
//		        ListNode temp2 = list2;
//
//		        ListNode head = new ListNode(100);
//		        ListNode temp = head;
//
//		        while(temp1 != null && temp2 != null){
//
//		            if(temp1.val < temp2.val){
//		                ListNode a = new ListNode(temp1.val);
//		                temp.next = a;
//		                temp = a;
//		                temp1 = temp1.next;
//		            }else{
//		                ListNode a = new ListNode(temp2.val);
//		                temp.next = a;
//		                temp = a;
//		                temp2 = temp2.next;
//		            }
//		        }
//
//		        if(temp1 == null){
//		            temp.next = temp2;
//		        }else{
//		            temp.next = temp1;
//		        }
//
//		        return head.next;
//		    }
//		}
	}
}
