package com.yash.arrayproblems;

//WAP to find duplicate numbers and there counting from list of numbers.
public class DuplicateNumber_2 {
	public static void main(String[] args) {
		int a[] = { 11, 12, 11, 20, 30, 40, 12, 40 };

		int sum = 0;
		System.out.print("Duplicate Number are: ");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					count++;
					sum = sum + count;
					System.out.print(a[i] + " ");
				}

			}

		}
		System.out.println();

		System.out.println("Total Count: " + sum);
	}

}
