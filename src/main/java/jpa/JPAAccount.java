package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Account;

public class JPAAccount {

	
	
	public Account getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPersona");
		EntityManager em = emf.createEntityManager();
		
		//Seleccionar la cuenta que cumple con un id
		
		Account account = em.find(Account.class, id);
			
		return account;
	}

	public void updateBalance(int id, double amount) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPersona");
		EntityManager em = emf.createEntityManager();
		
		//Leo la persona con id 1
		Account account = em.find(Account.class, id);
		double balance = account.getBalance();
		account.setBalance(balance + amount);
		
		em.getTransaction().begin();
		em.merge(account);
		em.getTransaction().commit();
	}
}
