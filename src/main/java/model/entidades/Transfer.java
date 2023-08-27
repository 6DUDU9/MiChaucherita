package model.entidades;

public class Transfer {
//	------------------------ Variables Privadas	------------------------------
	
	private Account actOrigin;
	private Account actDestiny;
	private double amount;
	
	
//	------------------------ BUILDER ------------------------
	public Transfer() {
		
	}
	
	public Transfer(Account actOrigin, Account actDestiny, double amount) {
		super();
		this.actOrigin = actOrigin;
		this.actDestiny = actDestiny;
		this.amount = amount;
	}
	
//	------------------------ GETTERS AND SETTERS ------------------------ 

	public Account getActOrigin() {
		return actOrigin;
	}

	public void setActOrigin(Account actOrigin) {
		this.actOrigin = actOrigin;
	}

	public Account getActDestiny() {
		return actDestiny;
	}

	public void setActDestiny(Account actDestiny) {
		this.actDestiny = actDestiny;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
//	------------------------ Methodes || Business Rules ------------------------	
	
}
