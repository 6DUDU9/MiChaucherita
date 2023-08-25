package model;

import java.util.List;

public class Account {
//	------------------------ Variables Privadas	------------------------------
	private int id;
	private String accountName;
	private double balance;
	private User user; 
//	------------------------ prueba
	private List<Account> Account;
	
	
//	------------------------ BUILDER ------------------------
	public  Account() {
	}
	
	public Account(int id, String accountName, double balance) {

		this.id = id;
		this.accountName = accountName;
		this.balance = balance;
	}
	
//	------------------------ SET && GET ------------------------ 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
//	------------------------ prueba
	
	
//	------------------------ Methodes || Business Rules ------------------------	
}
