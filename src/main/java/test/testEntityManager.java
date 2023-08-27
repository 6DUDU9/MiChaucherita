package test;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.JPAAccount;
import model.Account;
import model.Category;
import model.Type;
import model.User;


public class testEntityManager {

	public static void main(String[] args) {
		
		insertarCategorias();
		insertarCuentas();
		insertarUsuarios();
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

	private static void insertarUsuarios() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
		JPAAccount jpaAccount = new JPAAccount();
		List<Account> accounts = jpaAccount.getAll();
		
//		tener la entity a insertar
		User p1 = new User("Jairo","jairo123", accounts);
		User p2 = new User("David","david123", accounts);
		User p3 = new User("Daniel","daniel123", accounts);
		User p4 = new User("Dorian","dorian123", accounts);

		
//		INSERTAR
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();
		
	}
	private static void insertarCuentas() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
	
		
//		tener la entity a insertar
		Account account1 = new Account("Banco Pichincha", 465.0);
		Account account2 = new Account("Banco Bolivariano", 0.0);
		Account account3 = new Account("Efectivo", 120.0);

		
//		INSERTAR
		em.getTransaction().begin();
		em.persist(account1);
		em.persist(account2);
		em.persist(account3);
		em.getTransaction().commit();
		
	}
	
	private static void insertarCategorias() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaMiChaucherita");
		EntityManager em = emf.createEntityManager();
		
//		tener la entity a insertar
		Category cat1 = new Category("Auto", 0.0, Type.SPENT);
		Category cat2 = new Category("Casa", 0.0, Type.SPENT);
		Category cat3 = new Category("Comida", 0.0, Type.SPENT);
		Category cat4 = new Category("Deportes", 0.0, Type.SPENT);
		Category cat5 = new Category("Comunicaciones", 0.0, Type.SPENT);
		Category cat6 = new Category("Entretenimiento", 0.0, Type.SPENT);
		Category cat7 = new Category("Facturas", 0.0, Type.SPENT);
		Category cat8 = new Category("Higiene", 0.0, Type.SPENT);
		Category cat9 = new Category("Mascotas", 0.0, Type.SPENT);
		Category cat10 = new Category("Regalos", 0.0, Type.SPENT);
		Category cat11 = new Category("Restaurante", 0.0, Type.SPENT);
		Category cat12 = new Category("Ropa", 0.0, Type.SPENT);
		Category cat13 = new Category("Salud", 0.0, Type.SPENT);
		Category cat14 = new Category("Transporte", 0.0, Type.SPENT);
		
		Category cat15 = new Category("Ahorros", 0.0, Type.INCOME);
		Category cat16 = new Category("Deposito", 0.0, Type.INCOME);
		Category cat17 = new Category("Salario", 0.0, Type.INCOME);
		
//		INSERTAR
		em.getTransaction().begin();
		em.persist(cat1);
		em.persist(cat2);
		em.persist(cat3);
		em.persist(cat4);
		em.persist(cat5);
		em.persist(cat6);
		em.persist(cat7);
		em.persist(cat8);
		em.persist(cat9);
		em.persist(cat10);
		em.persist(cat11);
		em.persist(cat12);
		em.persist(cat13);
		em.persist(cat14);
		em.persist(cat15);
		em.persist(cat16);
		em.persist(cat17);
		em.getTransaction().commit();
		
	}

}