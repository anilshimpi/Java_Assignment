package com.yash.java8.palindrome_1;

import java.util.stream.IntStream;

public class CheckPalindrome {

	public static boolean isPalindrome(int num) 
	{
		return num == IntStream.iterate(num, i -> i / 10).map(n -> n % 10).limit(String.valueOf(num).length()).reduce(0, (a, b) -> a = a * 10 + b);
	}
	public static void main(String[] args) {
		
		int num = 2345432;

		System.out.println(num + " is a palindrome number " + isPalindrome(num));
	}
}
