package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Account")
public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
//	------------------------ Variables Privadas	------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "account_name")
	private String accountName;
	@Column(name = "balance")
	private Double balance;
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "user")
	private User user;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	private List<Move> moves;
	
//	------------------------ BUILDER ------------------------
	public  Account() {
	}
	public Account(String accountName, double balance) {
		
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	
//	------------------------ Methodes || Business Rules ------------------------	
	public Boolean check(Double amount) {
		if (amount > this.balance) {
			return false;
		}
		return true;
	}
}
