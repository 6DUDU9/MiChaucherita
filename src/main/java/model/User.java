package model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

<<<<<<< HEAD

@Entity
@Table(name = "User")
=======
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

>>>>>>> 872f1a69e0a9a5f31e35190f088ccd28759ed501
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
//	------------------ propiedades/Variables Privadas	-----------------------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "username")
    private String username;
	@Column(name = "password")
    private String password;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Account> accounts;
	
	// Lista para probar el Login con datos en memoria
	private static List<User> users = null;
	
//	------------------------ BUILDER ------------------------
	public User() {
		
	}

	public User(Integer id, String username, String password, List<Account> accounts) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.accounts = accounts;
	}

//	------------------------ SET && GET ------------------------ 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
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
