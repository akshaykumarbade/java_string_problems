package com.stringproblems;

//Q. Java Program to replace lower-case characters with upper-case and vice-versa.

public class UpperCasetoLowerCaseAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I Love My India";
		System.out.println("Original String: ");
		System.out.println(s1);
		
		StringBuffer result = new StringBuffer(s1);
		
		for(int i=0; i<s1.length();i++) {
			//First converting All UpperCase Characters from string s1 to LowerCase and storing in StringBuffer result.
			if(Character.isUpperCase(s1.charAt(i))) {
				result.setCharAt(i, Character.toLowerCase(s1.charAt(i)));
			}
			//Now converting All LowerCase Characters from string s1 to UpperCase and storing in StringBuffer result.
			else if(Character.isLowerCase(s1.charAt(i))) {
				result.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
			}
		}
		
		//printing new result string
		System.out.println("New Result String after conversion: ");
		System.out.println(result);

	}

}
