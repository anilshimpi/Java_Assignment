package BankProgram;

import java.util.Scanner;

public class Customer {
	int custid;
	int accountno;
	String customerName;
	String cust_address;
	String cust_dob;
	String cust_acc_opening_date;
	Branch br;

	void custmoerdetails() {

		// System.out.println("Enter Max.10 Customers details=");
		// for (int i = 0; i <= 2; i++) {

		System.out.println("enter customer details:");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer id: ");
		custid = sc.nextInt();
		System.out.println("enter Acc number: ");
		accountno = sc.nextInt();
		System.out.println("enter cust name: ");
		customerName = sc.nextLine();
		sc.nextLine();
		System.out.println("enter cust address: ");
		cust_address = sc.nextLine();
		System.out.println("enter cust DOB:");
		cust_dob = sc.nextLine();
		System.out.println("enter cust_acc_opn_date: ");
		cust_acc_opening_date = sc.nextLine();
		// Branch brobj;

		// }
	}

	void Customerdisplay() {
		System.out.println("details= " + "cust Id=" + custid + " " + " Acc.Number=" + accountno + " " + "Cust Name="
				+ customerName + " " + "Cust. Address=" + cust_address + " " + "cust dob=" + cust_dob + " "
				+ "Cust.AccOpenDate= " + cust_acc_opening_date);

	}

}
