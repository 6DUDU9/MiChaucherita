package modelo.jpa;

import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.DAO.MoveDAO;
import model.entidades.Account;
import model.entidades.Category;
import model.entidades.Move;
import model.entidades.Type;
import model.entidades.User;

public class JPAMoveDAO extends JPAGenericDAO<Move, Integer> implements MoveDAO{

	public JPAMoveDAO() {
		super(Move.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Move> getAllMovebyUser(User user) {
		String sentence = "SELECT m FROM Move m WHERE m.account IN (SELECT a FROM Account a WHERE a.user = :user)";
	    Query query = em.createQuery(sentence);
	    query.setParameter("user", user);
	    return new ArrayList<>(query.getResultList());
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Move> filtrar(Account account) {
		String sentence = "SELECT m FROM Move m WHERE m.account = :account";
	    Query query = em.createQuery(sentence);
	    query.setParameter("account", account);
	    return new ArrayList<>(query.getResultList());
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Move> filtrar(Category category, User user) {
		String sentence = "SELECT m FROM Move m WHERE m.account IN (SELECT a FROM Account a WHERE a.user = :user) AND m.category = :category ";
	    Query query = em.createQuery(sentence);
	    query.setParameter("category", category);
	    query.setParameter("user", user);
	    return new ArrayList<>(query.getResultList());
	}

	@Override
	public Double getBalanceByType(Date date, Type categoryType) {
        try {
            String jpql = "SELECT SUM(m.amount) FROM Move m " +
                          "WHERE FUNCTION('YEAR', m.date) = FUNCTION('YEAR', :date) " +
                          "AND FUNCTION('MONTH', m.date) = FUNCTION('MONTH', :date) " +
                          "AND m.category.type = :categoryType";

            TypedQuery<Double> query = em.createQuery(jpql, Double.class);
            query.setParameter("date", date);
            query.setParameter("categoryType", categoryType);

            Double income = query.getSingleResult();

            return income != null ? income : 0.0;
        } finally {
            em.close();
        }
	}

}
