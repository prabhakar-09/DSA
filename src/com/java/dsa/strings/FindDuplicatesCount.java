package com.java.dsa.strings;

import java.util.HashMap;

/*Input: S = “geeksforgeeks”
Output:

e, count = 4
g, count = 2
k, count = 2
s, count = 2*/

public class FindDuplicatesCount {

	public static void main(String[] args) {

//		Find the duplicates & their counts in the given string & return.
		String s = "helloohell";
		
		duplicateCounts(s);
	}
	
	public static void duplicateCounts(String s){
		
		HashMap<Character, Integer> strMap = new HashMap<>();
		
//		for(int i=0;i<s.length();i++) {
//			int count = 0;
//			if(strMap.containsKey(s.charAt(i))) {
//				strMap.put(s.charAt(i),count);
//				count++;
//			}
//			else {
//				strMap.put(s.charAt(i), 0);
//			}
//		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(strMap.containsKey(ch)) {
				
				strMap.put(ch, strMap.get(ch)+1);
			}
			else {
				strMap.put(ch, 1);
			}
		}
		
//		print hashmap :
	    // Print the counts of duplicates
        for (HashMap.Entry<Character, Integer> entry : strMap.entrySet()) {
            System.out.println(entry.getKey() + ", count = " + entry.getValue());
        }	}

}
