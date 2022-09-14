package com.yash.arrayproblems;
//WAP to remove the String which is not palindrome string from the array of String.
public class RemoveNotPalindromeString_11 {
	static String str[]= {"nayan","ssad","akscfd"};
	
	public static void main(String[] args) {
		RemoveNotPalindromeString_11 t= new RemoveNotPalindromeString_11();
		
		for(String st:str)
		{
			t.checkPalindrom(st);
			
		}
	}
	public void checkPalindrom(String s)
	{
		char chArr[]=s.toCharArray();
		
		int n =chArr.length;
		int count=0;
		for(int i=0,j=chArr.length-1;i<chArr.length;i++,j--)
		{
			
			
			if(chArr[i]==chArr[j])
			{
				count++;
			}
			
		}
		if(count==n)
		{
			System.out.println("palindrom: "+s);
		}
	}

}
