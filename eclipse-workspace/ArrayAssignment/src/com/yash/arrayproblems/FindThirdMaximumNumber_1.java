package com.yash.arrayproblems;

public class FindThirdMaximumNumber_1 {
	public static void main(String[] args) {
		int arr[]= {1,2,58,45,56,57,55};
		int size= arr.length;
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Third largest number: "+arr[size-3]);
	}
}

