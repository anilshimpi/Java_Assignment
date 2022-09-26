package com.yash.bankingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class BankOperation extends Customer implements BankService {

	int count=0,i=0;
	Customer[] ac= new Customer[50];
	Scanner sc=new Scanner(System.in);
	
	public void createAccount()
		{
			
			Customer acc=new Customer();
			boolean True=true;
			
			System.out.println("Enter Account Holder Name: ");
			String name=sc.nextLine();
			acc.setName(name);
			
			
			while(True) {
				
				System.out.println("Enter Account Number: ");
				long ac=sc.nextLong();
				
				if(Long.toString(ac).length()==8) {
						 acc.setAccNo(ac);
						sc.nextLine();
						//True=false;
						 break;
						
					 }
					 else {
							System.out.println("Enter correct 8 digit Account Number");
							//True=true;
							
						}
				
				
			}
				
			while(True) {
				
				System.out.println("Enter Mobile Number: ");	
				long mn=sc.nextLong();
				
				if(Long.toString(mn).length()==10) {
					acc.setMobNo(mn);
					//True=false;
					break;
					
				}
				else {
					System.out.println("Enter 10 digit mobile number");
				 	//True=true;
				 	
				}
				
			}
			
			while(True) {
				System.out.println("Enter Adhar Number: ");
				long ad=sc.nextLong();
				
				if(Long.toString(ad).length()==12) {
					acc.setAdharNo(ad);	
					//True=false;
					break;
					
				}
				else {
					System.out.println("Enter 12 digit adhar card number");
				 	//True=true;
				 	
				}
				
			}
			
			while(True) {
				System.out.println("Enter Gender: ");
				String g=sc.next();
				
				if(g.equals("Male")||g.equals("male")||g.equals("Female")||g.equals("female")) {
					
					acc.setGender(g);	
					//True=false;
					break;
					
				}
				else {
					System.out.println("Enter gender male or female");
				 	//True=true;
				 	
				}
				
			}
				
			while(True) {
				System.out.println("Enter Age: ");
				int age=sc.nextInt();
				
				if(age>=18) {
				
					acc.setAge(age);
					//True=false;
					break;
					
				}
				else {
					System.out.println("Customer age is below 18 not applicable to create bank account");
				 	//True=true;
				 	
				}
				
			}
			
			while(True) {
				System.out.println("Enter Balance: ");
				double bal=sc.nextDouble();
				
				if(bal>=500) {
					acc.setBalance(bal);
					System.out.println("Account create successfully...");
					ac[count]=acc;
					count++;
					True=false;
					sc.nextLine();
				}
				else {
					System.out.println("Minimum 500/- rupees required to create account");
					 True=true;
				}
				
			}	
			
	}
				
		public void displayAllDetails()
		{	
		
			boolean isAccountFound=true;
			
			if(count!=0)//0!=1
			{
				System.out.println("Enter account no. to display details:: ");
				long accno= sc.nextLong();
				
				 for(i=0;i<ac.length;i++) // |101|102|
				 {
					if(accno==(ac[i].getAccNo())) //|101.equals 101|102==102---true  103--false
					{
						System.out.println("Account Number: "+ac[i].getAccNo());
						System.out.println("Name: "+ac[i].getName());
						System.out.println("Mobile Number: "+ac[i].getMobNo());
						System.out.println("Adhar Number: "+ac[i].getAdharNo());
						System.out.println("Age: "+ac[i].getAge());
						System.out.println("Gender: "+ac[i].getGender());
						System.out.println("Balance: "+ac[i].getBalance());
						
						isAccountFound=false;
						break;
					}
				 }
					if(isAccountFound==true)
					{
						System.out.println("Account Invalid");
					}
			    }
			else
			{
				System.out.println("Please create account first");
			}

		}
		
		public void depositeMoney()
		{
			boolean depositeBal=true;
			double a=0;
			double add=0;
			
			if(count!=0) {
				
				System.out.println("Enter account no. to display details:: ");
				long accno=sc.nextLong();
				
				for(i=0;i<ac.length;i++) {
					
					if(accno==ac[i].getAccNo()) {
						
						System.out.println(a=ac[i].getBalance());
						System.out.println("Enter deposit amount");
						double d=sc.nextDouble();
						add= a+d;
						System.out.println(add);
						ac[i].setBalance(add);
						System.out.println("New Amount is::"+ac[i].getBalance());
						depositeBal=false;
						break;
	
					}
					
					
				}
				
				if(depositeBal==true) {
					System.out.println("Invalid Account");

				}
			
			}
			
			else
			{
				System.out.println("Please create account first");
				 }
				
		}
		
		public void withdrawal()
		{
			//double amt=0;
			boolean isAcc=true;
			
			if(count!=0) {
				
				System.out.println("Enter Account number you want to withdrawer money : ");
				long acc_no=sc.nextLong();
				
				for(i=0;i<ac.length;i++) {
					
					if(acc_no==ac[i].getAccNo()) {
						
					System.out.println(ac[i].getBalance());
					System.out.println("Enter the amount: ");
					double bal=sc.nextDouble();
					double amt=ac[i].getBalance()-bal;
					System.out.println("Remaining amount after withdrawer : "+amt);
						
					if(amt>=500) {
						ac[i].setBalance(amt);
						isAcc=false;
						break;
					}
					else
					{
						System.out.println("Minimum balance should be 500/- to maintain your account");
					}
					
				}
				}
			
			
				if(isAcc==true) {
						
						System.out.println("Account Invalid");

					}
					
			}
				else {
						System.out.println("Please create account first");

					}
				
		}
		
		public void balanceCheck()
		{
			boolean balCheck=true;
			
			
			if(count!=0) {
				
				System.out.println("Enter account number you want to check balance: ");
				long acc_no =sc.nextLong();
				
				for(i=0;i<ac.length;i++) {
					
					if(acc_no==ac[i].getAccNo()) {
						System.out.println("Amount is "+ac[i].getBalance());
						balCheck=false;
						break;
						
					}
					
				}
					if(balCheck==true) {
						
						System.out.println("Invalid Account");
					}
					
			}
					else {
						
						System.out.println("Create account first ");
					}
					
				
			}
			
	
}
