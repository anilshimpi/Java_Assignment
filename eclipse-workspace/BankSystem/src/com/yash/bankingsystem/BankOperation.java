package com.yash.bankingsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BankOperation extends Customer implements BankService {

	Scanner sc=new Scanner(System.in);
	Customer cust=new Customer();
	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.print("Enter Account No: ");  
        cust.setAccno(sc.next());  
        System.out.print("Enter Account type: ");   
        cust.setAcc_type(sc.next());
        System.out.print("Enter Name: ");  
        cust.setName(sc.next());  
        System.out.print("Enter Balance: ");  
        cust.setBalance(sc.nextLong()); 
	}

	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
       cust.balance=cust.balance+amt;  
       
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (cust.getBalance() >= amt) {  
            cust.balance = cust.getBalance() - amt;  
            System.out.println("Balance after withdrawal: " + cust.getBalance());  
        } 
        else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
		
	}

	@Override
	public boolean search(String ac_no) {
		 if (cust.getAccno().equals(ac_no)) {  
	            showAccount();  
	            return (true);  
	        }  
	        return (false);  
	      
	}


	@Override
	public void showAccount() {
		// TODO Auto-generated method stub
		
		System.out.println("Name of account holder: " +cust.getName());  
        System.out.println("Account no.: " + cust.getAccno());  
        System.out.println("Account type: " + cust.getAcc_type());  
        System.out.println("Balance: " + cust.getBalance());  
		
	}

	

	
}
