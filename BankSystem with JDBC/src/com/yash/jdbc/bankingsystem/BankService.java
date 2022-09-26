package com.yash.jdbc.bankingsystem;

import java.sql.SQLException;

public interface BankService {

	public void createAccount() throws Exception;
	public void displayAllDetails() throws Exception;
	public void depositeMoney() throws Exception;
	public void withdrawal() throws SQLException;
	public void balanceCheck() throws SQLException;
}
