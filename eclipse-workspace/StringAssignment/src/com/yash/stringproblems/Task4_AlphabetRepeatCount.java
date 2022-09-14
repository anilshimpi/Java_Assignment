package com.yash.stringproblems;

//WAP to print the number of alphabets repeated in the given string.
public class Task4_AlphabetRepeatCount {
	public static void main(String[] args) {

		String string1 = "repeated ralphabet";
		int count;          

		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		
		for (int i = 0; i < string.length; i++) {
			count = 0;
			for (int j = i + 1; j < string.length; j++) {              
				if (string[i] == string[j] && string[i] != ' ') {        
					count++;
					
					string[j] = '0';
				}
			}
		
			if (count >= 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}

}
