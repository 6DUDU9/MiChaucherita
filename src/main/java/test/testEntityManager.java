package test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Account;
import model.Category;
import model.User;


public class testEntityManager {

	public static void main(String[] args) {
		
		insertar();
		/*
		leer();
		actualizar();
		eliminar();
		consultarJPQL();
		consultarJPQLNativa();
		
		consultarJPQLNamed();
		*/
		
	}

	private static void consultarJPQLNamed() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
		
		Query queryNamed =em.createNamedQuery("consultaEspecifica");
		
//		PARAMETROS inyectados
		queryNamed.setParameter("nombre", "DAvid");
		queryNamed.setParameter("clave", "david69");
		
//		Devuelve solo 1 resultado CUIDADO
//		Persona personaAutorizada = (Persona) queryNamed.getSingleResult();
//		System.out.println(personaAutorizada);
		
	}

	private static void consultarJPQLNativa() {
		/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
//		aplicamos la sentencia JPQL Nativa
		String SQLNativo = "select * from Persona where nombre='Huge' and id='6'";
//		Aqui especificamos que es nativo, ademas especificamos que clase de entity va a devolver
		Query queryN =em.createNativeQuery(SQLNativo, Persona.class);
//		especificamso si queremos un single o un list
		Persona p = (Persona) queryN.getSingleResult();
		System.out.println(p);
		*/
	}

	private static void consultarJPQL() {
		/*
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
//		aplicamos la sentencia JPQL
		String sentenciaJPQL = "select p from Persona p";
		Query query1 =em.createQuery(sentenciaJPQL);
		
//		PARAMETROS
		List<Persona> personas = query1.getResultList();
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
//		Para los parametros ponemos :atributo que son los parametros que inyectamos
		String sentenciaEcf = "select p from Persona p where p.nombre= :nombre and p.clave=:clave";
		Query query2 =em.createQuery(sentenciaEcf);
		
//		PARAMETROS inyectados
		query2.setParameter("nombre", "DAvid");
		query2.setParameter("clave", "david69");
		
//		Devuelve solo 1 resultado CUIDADO
		Persona personaAutorizada = (Persona) query2.getSingleResult();
		System.out.println(personaAutorizada);
*/
		
	}

	private static void eliminar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
//		buscamos al entity que se va a ELIMINAR
//		Persona personaBuscada = em.find(Persona.class, 2);
		
//		ELIMINAMOS
		em.getTransaction().begin();
//		em.remove(personaBuscada);
		em.getTransaction().commit();
	}

	private static void actualizar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
//		buscamos al entity a actualizar 
//		Persona personaBuscada = em.find(Persona.class, 1);
//		personaBuscada.setClave("david69");
//		ACTUALIZAMOS
		em.getTransaction().begin();
//		em.merge(personaBuscada);
		em.getTransaction().commit();
	}

	private static void leer() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
		//leer la persona con id 1
//		Persona personaBuscada = em.find(Persona.class, 1);
//		System.out.println(personaBuscada);
		
	}

	private static void insertar() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
		
		List<Account> accounts = null;
		
//		tener la entity a insertar
		User p1 = new User(1,"DAvid","12345",accounts);

		
//		INSERTAR
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
	}

}