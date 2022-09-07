package com.yash.bankingsystem;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);  
          
        System.out.println("How many number of customers do you want to input: ");  
        int n = sc.nextInt();  
        BankOperation b[] = new BankOperation[n];  
        for (int i = 0; i < b.length; i++) {  
            b[i] = new BankOperation();  
            b[i].openAccount();  
        }  
        
        int ch;  
        do {  
            System.out.println("\nBanking System Application");  
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < b.length; i++) {  
                            b[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.println("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < b.length; i++) {  
                            found = b[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.println("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < b.length; i++) {  
                            found = b[i].search(ac_no);  
                            if (found) {  
                                b[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.println("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < b.length; i++) {  
                            found = b[i].search(ac_no);  
                            if (found) {  
                                b[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println(" Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
	}

}
