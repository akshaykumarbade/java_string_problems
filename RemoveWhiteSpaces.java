package com.stringproblems;

//Q. Java Program to remove all white spaces from a given string.

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello, my name is Akshay.";
		
		System.out.println("Original String: "+str);
		
		//This method replaces each substring of the string that matches the given regular expression with the given replace_str.
		str = str.replaceAll("\\s+", "");
		
		System.out.println("String without white spaces: "+str);
		
		

	}

}
