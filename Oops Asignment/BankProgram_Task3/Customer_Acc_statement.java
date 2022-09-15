package BankProgram;

import java.util.Scanner;

public class Customer_Acc_statement {

	int caid;
	int amount;
	int deposit_withdrawl;
	String deposite_date;
	Customer ct;
	
	Scanner sc=new Scanner(System.in);
	
	void customerAccstatement() {
		
		
		System.out.println("Enter customer account Id: ");
		caid=sc.nextInt();
		System.out.println("Enter Amount: ");
		amount=sc.nextInt();
		System.out.println("Enter the amount you want to withdraw");
		deposit_withdrawl=sc.nextInt();
		System.out.println("Enter amount deposite date: ");
		deposite_date=sc.nextLine();
		
	}
		public void displayCustomerAccStatement() {
			
			
			System.out.println("Cust Id: "+caid);
			System.out.println("Amount : "+amount);
			System.out.println("Deposite_Withdrawal: "+deposit_withdrawl);
			System.out.println("Deposite Date: "+deposite_date);
	
		}
}
