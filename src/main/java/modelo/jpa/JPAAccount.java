package modelo.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.entidades.Account;


public class JPAAccount {

	public Account getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		//Seleccionar la cuenta que cumple con un id
		Account account = em.find(Account.class, id);
		return account;
	}
	
	@SuppressWarnings("unchecked")
	public List<Account> getAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		// read the existing entries and write to console
		Query q = em.createQuery("SELECT a FROM Account a");
		return q.getResultList();
	}

	public void updateBalance(int id, double amount) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
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
