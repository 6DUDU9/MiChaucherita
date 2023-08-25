package model;

import java.time.LocalDate;

public class Move {
//	------------------ propiedades/Variables Privadas	-----------------------------------
	private int id;
	LocalDate date;
	private double amount;
	private String description;
	private Category category;
	private Account account;
	
//	------------------------ BUILDER ------------------------
	public  Move() {
		
	}

	public Move(int id, LocalDate date, double balance, String description, Category category, Account account) {
		this.id = id;
		this.date = date;
		this.amount = balance;
		this.description = description;
		this.category = category;
		this.account = account;
	}

//	------------------------ SET && GET ------------------------ 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getBalance() {
		return amount;
	}

	public void setBalance(double balance) {
		this.amount = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

//	------------------------ Methodes || Business Rules ------------------------
	public void ingresar() {
		
	}

	@Override
	public String toString() {
		return "Category=" + category.getCategoryName() + "\n"+ "amount=" + amount + ", description=" + description+", date=" + date  
				+ ", account=" + account + "]";
	}

	

}
