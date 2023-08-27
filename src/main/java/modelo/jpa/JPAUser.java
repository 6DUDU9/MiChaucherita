package modelo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.entidades.User;

public class JPAUser {
	public User authorize(String username, String password) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();

		String sentenciaJPQL = "SELECT u FROM User u WHERE u.username= :username AND u.password= :password";

		Query query1 = em.createQuery(sentenciaJPQL);
		// Parametros
		query1.setParameter("username", username);
		query1.setParameter("password", password);
		User authUser = null;
		try {
			authUser = (User) query1.getSingleResult();
			System.out.println("USUARIO ENCONTRADO");
		} catch (Exception e) {
			System.out.println("No encontrado");
		}
		
		return authUser;
	}
}
