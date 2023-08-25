package model;

public class User {
//	------------------ propiedades/Variables Privadas	-----------------------------------
	int id;
	String user;
	String password;
	
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
	
	
}
