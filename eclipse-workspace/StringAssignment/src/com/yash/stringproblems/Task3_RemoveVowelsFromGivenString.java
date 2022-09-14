package com.yash.stringproblems;
//WAP to remove all the vowels from the given string.
public class Task3_RemoveVowelsFromGivenString {
	public static void main(String[] args) {
		String s = "aebciodjulm";
	
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
	                || s.charAt(i) == 'i' || s.charAt(i) == 'o'
	                || s.charAt(i) == 'u' || s.charAt(i) == 'A'
	                || s.charAt(i) == 'E' || s.charAt(i) == 'I'
	                || s.charAt(i) == 'O'
	                || s.charAt(i) == 'U') {
	               
	            }
	            else {
	                System.out.print(s.charAt(i));
	            }
	        }
	}

}
