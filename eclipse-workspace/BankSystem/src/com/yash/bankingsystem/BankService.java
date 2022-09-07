package com.yash.bankingsystem;

import java.util.List;

public interface BankService {
	
	/*
	 * public void accountOpen(); public void withdraw(double withdrawnAmount);
	 * public void deposite(double depositeAmount); public void statement(); public
	 * void displayCustomer();
	 */
	 public void openAccount();
	 public void showAccount() ;
	 public void deposit();
	 public void withdrawal();
	 public boolean search(String ac_no);

}
