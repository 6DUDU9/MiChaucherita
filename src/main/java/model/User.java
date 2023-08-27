package model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "User")
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
	
	
}
