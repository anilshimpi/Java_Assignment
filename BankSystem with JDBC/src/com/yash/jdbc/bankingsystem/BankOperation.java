package com.yash.jdbc.bankingsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.yash.jdbc.bankingsystem.jdbc.DatabaseUtil;

public class BankOperation implements BankService {

	int count = 0, i = 0;
	Customer cust = new Customer();
	Scanner sc = new Scanner(System.in);
	// DatabaseUtil util=new DatabaseUtil();
	Connection con = null;

	public void createAccount() throws ClassNotFoundException, SQLException {

		String sql = "insert into Customer(accNo,name,mobNo,adharNo,gender,age,balance) values(?,?,?,?,?,?,?)";
		con = DatabaseUtil.getConnection();
		PreparedStatement smt = con.prepareStatement(sql);
		Customer acc = new Customer();
		boolean True = true;

		System.out.println("Enter Account Holder Name: ");
		String name = sc.nextLine();
		smt.setString(2, name);

		while (True) {

			System.out.println("Enter Account Number: ");
			long ac = sc.nextLong();
			//smt.setLong(1, ac);

			if (Long.toString(ac).length() == 8) {
				//acc.setAccNo(ac);
				smt.setLong(1, ac);
				sc.nextLine();
				//True=false;
				break;

			} else {
				System.out.println("Enter correct 8 digit Account Number");
				//True=true;

			}

		}

		while (True) {

			System.out.println("Enter Mobile Number: ");
			long mn = sc.nextLong();
			//smt.setLong(3, mn);
			
			if (Long.toString(mn).length() == 10) {
				//acc.setMobNo(mn);
				smt.setLong(3, mn);
				//True=false;
				break;

			} else {
				System.out.println("Enter 10 digit mobile number");
				//True=true;

			}

		}

		while (True) {
			System.out.println("Enter Adhar Number: ");
			long ad = sc.nextLong();

			if (Long.toString(ad).length() == 12) {
				// acc.setAdharNo(ad);
				smt.setLong(4, ad);
				//True=false;
				break;

			} else {
				System.out.println("Enter 12 digit adhar card number");
				//True=true;

			}

		}

		while (True) {
			System.out.println("Enter Gender: ");
			String g = sc.next();

			if (g.equals("Male") || g.equals("male") || g.equals("Female") || g.equals("female")) {

				// acc.setGender(g);
				smt.setString(5, g);
				True=false;
				break;

			} else {
				System.out.println("Enter gender male or female");
				//True=true;

			}

		}

		while (True) {
			System.out.println("Enter Age: ");
			int age = sc.nextInt();

			if (age >= 18) {

				// acc.setAge(age);
				smt.setInt(6, age);
				True=false;
				break;

			} else {
				System.out.println("Customer age is below 18 not applicable to create bank account");
				//True=true;

			}

		}

		while (True) {
			System.out.println("Enter Balance: ");
			double bal = sc.nextDouble();

			if (bal >= 500) {
				// acc.setBalance(bal);
				smt.setDouble(7, bal);
				System.out.println("Account create successfully...");
				// ac[count] = acc;
				// count++;
				True = false;
				
			} else {
				System.out.println("Minimum 500/- rupees required to create account");
				//True = true;
			}

		}
		smt.executeUpdate();
	}

	public void displayAllDetails() throws SQLException {

		boolean isAccountFound = true;

		System.out.println("Enter account no. to display details:: ");
		long accno = sc.nextLong();

		String sql = "select * from Customer WHERE accNo=?";
		con = DatabaseUtil.getConnection();
		PreparedStatement smt = con.prepareStatement(sql);
		smt.setLong(1, accno);
		ResultSet rs = smt.executeQuery();
		
		while (rs.next()) {
			System.out.println("Account Number: " + rs.getLong(1));
			System.out.println("Name: " + rs.getString(2));
			System.out.println("Mobile Number: " + rs.getLong(3));
			System.out.println("Adhar Number: " + rs.getLong(4));
			System.out.println("Age: " + rs.getString(5));
			System.out.println("Gender: " + rs.getString(6));
			System.out.println("Balance: " + rs.getDouble(7));

			isAccountFound = false;
			break;
		}

		
	}

	public void depositeMoney() throws SQLException {
		boolean depositeBal = true;
		double a = 0;
		double add = 0;

		String sql = "Select accNo,balance from Customer";
		// String update = "Update Customer SET balance=? WHERE accNo=?";

		System.out.println("Enter account no. to display balance details:: ");
		long accno = sc.nextLong();

		System.out.println("Enter deposit amount");
		double d = sc.nextDouble();

		con = DatabaseUtil.getConnection();
		Statement ac = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rsbal = ac.executeQuery(sql);
		while (rsbal.next()) {
			if (rsbal.getLong("accNo") == accno) {

				a = rsbal.getDouble("balance");
				System.out.println(a);
				add = a + d;
				rsbal.updateDouble("balance", add);
				rsbal.updateRow();
				System.out.println("Balance after deposite: " + rsbal.getDouble("balance"));

			}

		}

	}

	public void withdrawal() throws SQLException {
		double amt = 0;

		String sql = "Select accNo,balance from Customer";

		System.out.println("Enter Account number you want to withdrawer money : ");
		long acc_no = sc.nextLong();

		con = DatabaseUtil.getConnection();
		Statement ac = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rsbal = ac.executeQuery(sql);
		while (rsbal.next()) {
			if (rsbal.getLong("accNo") == acc_no) {

				System.out.println(rsbal.getDouble("balance"));
				amt = rsbal.getDouble("balance");

				System.out.println("Enter withdrawn amount: ");
				double bal = sc.nextDouble();
				double withdrawnbal = amt - bal;
				rsbal.updateDouble("balance", withdrawnbal);
				rsbal.updateRow();
				System.out.println("Remaining amount after withdrawer : " + rsbal.getDouble("balance"));
			}

		}

	}

	public void balanceCheck() throws SQLException {
		boolean balCheck = true;

		String sql = "Select accNo,balance from Customer";

		System.out.println("Enter account number you want to check balance: ");
		long acc_no = sc.nextLong();

		con = DatabaseUtil.getConnection();
		Statement ac = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rsbal = ac.executeQuery(sql);
		while (rsbal.next()) {
			if (rsbal.getLong("accNo") == acc_no) {
				double bal = rsbal.getDouble("balance");

				System.out.println("Balance: " +bal);
				balCheck = false;
			}

		}
	}
}
