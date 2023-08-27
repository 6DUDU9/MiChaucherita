package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Category;
import model.Type;

public class JPACategory {

	
	public Category getById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
		//Seleccionar la categoria que cumple con un id
		
		Category category = em.find(Category.class, id);		
		return category;
	}
	@SuppressWarnings("unchecked")
	public List<Category> getCategoryList(Type type){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		// read the existing entries and write to console
		Query q = em.createQuery("SELECT c FROM Category c WHERE c.type= :type");
		q.setParameter("type", type);
		return q.getResultList();
	}
}