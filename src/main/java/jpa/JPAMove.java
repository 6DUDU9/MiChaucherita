package jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Account;
import model.Category;
import model.Move;
import model.User;

public class JPAMove {
	
	private EntityManager entityManager = Persistence.createEntityManagerFactory("jpaMiChaucherita").createEntityManager();
	
//	Con este obtengo todos los movimientos (en lista) de un respectivo usuario 
	public ArrayList<Move> getAllMovebyUser(User user) {
	    String sentence = "SELECT m FROM Move m WHERE m.account IN (SELECT a FROM Account a WHERE a.user = :user)";
	    Query query = entityManager.createQuery(sentence);
	    query.setParameter("user", user);
	    return new ArrayList<>(query.getResultList());
	}

	public ArrayList<Move> filtrar(Account account) {
	    String sentence = "SELECT m FROM Move m WHERE m.account = :account";
	    Query query = entityManager.createQuery(sentence);
	    query.setParameter("account", account);
	    return new ArrayList<>(query.getResultList());
	}

	public ArrayList<Move> filtrar(Category category, User user) {
	    String sentence = "SELECT m FROM Move m WHERE m.account IN (SELECT a FROM Account a WHERE a.user = :user) AND m.category = :category ";
	    Query query = entityManager.createQuery(sentence);
	    query.setParameter("category", category);
	    query.setParameter("user", user);
	    return new ArrayList<>(query.getResultList());
	}
	public void insertMove(Move move) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();

//		INSERTAR
		em.getTransaction().begin();
		em.persist(move);
		em.getTransaction().commit();
		
	}
	

	
}
