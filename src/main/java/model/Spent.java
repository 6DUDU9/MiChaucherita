package model;


import java.time.LocalDate;

public class Spent extends Move{
	
	private static final long serialVersionUID = 1L;

	public Spent(int id, LocalDate date, double balance, String description, Category category, Account account) {
		super(id, date, balance, description, category, account);
	}
	
}
