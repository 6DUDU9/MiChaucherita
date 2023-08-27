package model;

import java.time.LocalDate;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "move")
public class Move implements Serializable {
	
	private static final long serialVersionUID = 1L;
//	------------------ propiedades/Variables Privadas	-----------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "description")
	private String description;
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "account")
	private Account account;
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "category")
	private Category category;
	
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


	@Override
	public String toString() {
		return "Category=" + category.getCategoryName() + "\n"+ "amount=" + amount + ", description=" + description+", date=" + date  
				+ ", account=" + account + "]";
	}

	

}
