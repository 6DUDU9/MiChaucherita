package model.DAO;

public class UserDAO {
//	------------------------ Variables ------------------------
	final String SQL_SELECT_ALL = "SELECT * FROM User;";
	final String SQL_SELECT_BY_ID = "SELECT * FROM User WHERE id = ?";
	final String SQL_INSERT = "INSERT INTO User (id, user, password) VALUES (?,?,?)";
	final String SQL_DELETE_BY_ID = "DELETE FROM User WHERE id = ?";
	
//	------------------------ Builder ------------------------
	
	public UserDAO() {
		
	} 
//	------------------------ Methodes || Business Rules ------------------------
}
