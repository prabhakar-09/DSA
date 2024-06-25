package com.java.dsa.linkedLists.easy;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		
//		step 1 : find size of both the linked lists
//		step 2 : find the steps to move ahead for specific linked list i.e., 
//		if(lenA>lenB) then steps = lenA-lenB else lenB-lenA and move the bigger linked lists with the given steps
//		step 3 : start traversing until both nodeA and nodeB doesn't get equal.. once they equal return node
		
//		Problem ref. from leetcode  P.no : 160
		/**
		 * Definition for singly-linked list.
		 * public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode(int x) {
		 *         val = x;
		 *         next = null;
		 *     }
		 * }
		 */
//		public class Solution {
//		    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//		        ListNode tempA = headA;
//		        ListNode tempB = headB;
//
//		        int lengthA = 0;
//
//		        while(tempA != null){
//
//		            lengthA++;
//		            tempA = tempA.next;
//		        }
//
//		        int lengthB = 0;
//
//		        while(tempB != null){
//
//		            lengthB++;
//		            tempB = tempB.next;
//		        }
//
//		        tempA = headA;
//		        tempB = headB;
//		        if(lengthA> lengthB){
//		            int steps = lengthA-lengthB;
//		            for(int i=1;i<=steps;i++){
//		                tempA = tempA.next;
//		            }
//		        }else{
//		            int steps = lengthB - lengthA;
//		            for(int i=1;i<=steps;i++){
//		                tempB = tempB.next;
//		            }
//		        }
//
//		        while(tempA!=tempB){
//		            tempA = tempA.next;
//		            tempB = tempB.next;
//		        }
//
//		        return tempA;
//		        
//		    }
//		}
	}
}
