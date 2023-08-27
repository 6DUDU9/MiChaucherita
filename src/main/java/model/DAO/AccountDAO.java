package model.DAO;

import java.util.List;

import model.entidades.Account;

public interface AccountDAO {
	
	public Account getById(int id);
	public List<Account> getAll();
	public void updateBalance(int id, double amount);
	
}

