package com.java.dsa.strings.easy;
import java.util.*;

public class FindAllDuplicateCharCount {

	public static void main(String[] args) {
		
		String str = "peekuuneekku";
		
		findDuplicateCount(str);
	}
	
	public static void findDuplicateCount(String str) {
		
//		HashMap to store the count of each letter present in the string
		
		Map<Character, Integer> strMap = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(strMap.containsKey(str.charAt(i))) {
				
				strMap.put(str.charAt(i), strMap.get(str.charAt(i))+1);
				
			}else {
				
				strMap.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(strMap); // Output: {p=1, e=4, u=3, k=3, n=1}
		
		for(Map.Entry entry : strMap.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
