package com.stringproblems;

/* Q. There is a sequence of words in CamelCase as a string of letters, s , having the following properties:

	It is a concatenation of one or more words consisting of English letters.
	All letters in the first word are lower case.
	For each of the subsequent words, the first letter is Upper case and rest of the letters are lowercase.
	Given , determine the number of words in given String . */

public class camelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "thisIsCamelCaseSentence";
		System.out.println("Given String: "+s);
		
		int count = 1;
		
		for(int i=0;i<s.length();i++) {
			if(s.isEmpty()) {
				count = count - 1;
			}else if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				count = count + 1;
			}
		}
		
		System.out.println("The number of words in given String is: "+ count);

	}

}
