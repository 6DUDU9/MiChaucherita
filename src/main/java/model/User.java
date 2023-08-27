package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
//	------------------ propiedades/Variables Privadas	-----------------------------------
	int id;
	String user;
	String password;
	
	// Lista para probar el Login con datos en memoria
	private static List<User> users = null;
	
//	------------------------ BUILDER ------------------------
	public User() {
		
	}
	public User(int id, String user, String password) {
		this.id = id;
		this.user = user;
		this.password = password;
	}
	
//	------------------------ SET && GET ------------------------ 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	------------------------ Methodes || Business Rules ------------------------	
	public List<User> getUsers(){
		if (users == null) {
			users = new ArrayList<>();
			
			users.add(new User(1, "Daniel", "daniel123"));
			users.add(new User(2, "David", "david123"));
			users.add(new User(3, "Jairo", "jairo123"));
			users.add(new User(4, "Dorian", "dorian123"));
		}
		return users;
	}
	
	public User authorize(String ctausuario, String password) {
		User authUser = null;
		List<User> listUsers = this.getUsers();
		for (User user : listUsers) {
			if (user.getUser().equals(ctausuario) && user.getPassword().equals(password)) {
				authUser = user;
				break;
			}
		}
		return authUser;
	}
	
}
