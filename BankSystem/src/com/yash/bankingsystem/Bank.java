package com.yash.bankingsystem;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BankService bank=new BankOperation();
			boolean True=true;
			int ch=0;
			
			System.out.println("Welcome to Bank");	
			
			while(True){
				
			System.out.println("\n---OPERATION---\n" 
					+"1. Create Account\n"
					+"2. Display Details\n"
					+"3. Deposit Money\n"
					+"4. Withdraw\n"
					+"5. Balance Check\n"
					+"6. EXIT\n");
			
			System.out.println("Enter Operation: ");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			
			
			//Display proper msg for calling methods.
			//As per user choice perform bank operation using switch case
		 
			switch(ch)
			{
			
			case 1:
				bank.createAccount();
				break;	
			
			case 2:
				
				bank.displayAllDetails();
				break;
				
			case 3: 
					bank.depositeMoney();
					break;
				
			case 4:
					 bank.withdrawal();
					 break;
				 
			case 5:
					 bank.balanceCheck();
					
					 break;
				 
			case 6:
				True=false;
				System.out.println("Exit from main menu..");
				break;
				
			 default:
				System.out.println("invalid input");
				
				}
			
			}
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
				
			}
	}

}
