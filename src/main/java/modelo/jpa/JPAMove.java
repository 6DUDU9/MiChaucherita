package modelo.jpa;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.entidades.Account;
import model.entidades.Category;
import model.entidades.Move;
import model.entidades.Type;
import model.entidades.User;

public class JPAMove {

	private EntityManager entityManager = Persistence.createEntityManagerFactory("jpaMiChaucherita")
			.createEntityManager();

//	Con este obtengo todos los movimientos (en lista) de un respectivo usuario 
	@SuppressWarnings("unchecked")
	public ArrayList<Move> getAllMovebyUser(Date date, User user) {
		String sentence = "SELECT m FROM Move m WHERE m.account IN (SELECT a FROM Account a WHERE a.user = :user) "
				+ "AND FUNCTION('YEAR', m.date) = FUNCTION('YEAR', :date) "
				+ "AND FUNCTION('MONTH', m.date) = FUNCTION('MONTH', :date) ";

		Query query = entityManager.createQuery(sentence);
		query.setParameter("user", user);
		query.setParameter("date", date);

		return new ArrayList<>(query.getResultList());
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Move> filtrar(Date date, Account account) {
		String sentence = "SELECT m FROM Move m WHERE m.account = :account "
				+ "AND FUNCTION('YEAR', m.date) = FUNCTION('YEAR', :date) "
				+ "AND FUNCTION('MONTH', m.date) = FUNCTION('MONTH', :date) ";

		Query query = entityManager.createQuery(sentence);
		query.setParameter("account", account);
		query.setParameter("date", date);

		return new ArrayList<>(query.getResultList());
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Move> filtrar(Date date, Category category) {
		String sentence = "SELECT m FROM Move m WHERE m.category = :category "
				+ "AND FUNCTION('YEAR', m.date) = FUNCTION('YEAR', :date) "
				+ "AND FUNCTION('MONTH', m.date) = FUNCTION('MONTH', :date) ";

		Query query = entityManager.createQuery(sentence);
		query.setParameter("category", category);
		query.setParameter("date", date);

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

	public Double getBalanceByType(Type categoryType) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		try {
			String jpql = "SELECT SUM(m.amount) FROM Move m "
					+ "WHERE  m.category.type = :categoryType";

			TypedQuery<Double> query = em.createQuery(jpql, Double.class);
			query.setParameter("categoryType", categoryType);

			Double income = query.getSingleResult();

			return income != null ? income : 0.0;
		} finally {
			em.close();
		}
	}

}
