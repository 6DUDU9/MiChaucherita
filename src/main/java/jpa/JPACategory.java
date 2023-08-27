package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Category;

public class JPACategory {

	
	public Category getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPersona");
		EntityManager em = emf.createEntityManager();
		
		//Seleccionar la categoria que cumple con un id
		
		Category category = em.find(Category.class, id);		
		return category;
	}
}