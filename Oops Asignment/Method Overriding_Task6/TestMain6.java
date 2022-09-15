package OOPSQ6;

import java.util.Scanner;

public class TestMain6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Find maximum of 3 ,4 or 5 for n number");

		int n = sc.nextInt();

		if (n == 3) {

			System.out.println("Enter 3 digit number");

			int number = sc.nextInt();

			Class1 class1 = new Class1();

			class1.getNumbers(number);
		}

		if (n == 4) {

			System.out.println("Enter 4 digit number");

			int number = sc.nextInt();

			Class2 class2 = new Class2();

			class2.getNumbers(number);
		}

		if (n == 5) {

			System.out.println("Enter n digit number");

			int number = sc.nextInt();

			Class3 class3 = new Class3();

			class3.getNumbers(number);
		}

	}

}
