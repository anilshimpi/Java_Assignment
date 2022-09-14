package com.yash.stringproblems;
//write a program to print all the alphabets of a string in ascending and descending order
public class Task2_AlphabetOfStringAscendingDescending {
	public static void main(String[] args) {
		String s="shubham";
		char[] ch=s.toCharArray();
		System.out.println("Ascending order:");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		for(int k=0;k<ch.length;k++)
		{
			System.out.println(ch[k]);
		}
		
		System.out.println("Descending order:");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
					
				}
			}
		}
		for(int k=0;k<ch.length;k++)
		{
			System.out.println(ch[k]);
		}
	}
	

}
