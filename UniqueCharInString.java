package com.stringproblems;

import java.util.HashMap;
import java.util.Map;


/*Q. You have to find an unique character in a given string. i.e. you have to print a character which is not repeating.
    e.g aabbcckkeefhjhj => d, e, s
  */


public class UniqueCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaccbbdbefggsf";
		
		System.out.println("Given String: "+ str);
		System.out.println("Unique Chars: ");
		
		for(int i=0;i<str.length();i++) {
			boolean flag = true;
			for(int j=0; j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println(str.charAt(i));
				
			}
		}
		
		// Using collections:
		
		Map<Character, Integer> strMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(strMap.containsKey(c)) {
				strMap.put(c, strMap.get(c)+1);
			}else {
				strMap.put(c, 1);
			}
		}
		
		System.out.println(strMap);
		
		for(java.util.Map.Entry<Character, Integer> entrySet : strMap.entrySet()) {
			if(entrySet.getValue()==1) {
				System.out.println(entrySet.getKey());
			}
		}
	

	}

}
