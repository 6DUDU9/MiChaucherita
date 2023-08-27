package model.DAO;

public class CategoryDAO {
//	------------------------ Variables ------------------------
	final String SQL_SELECT_ALL = "SELECT * FROM Category;";
	final String SQL_SELECT_BY_ID = "SELECT * FROM Category WHERE id = ?";
	final String SQL_INSERT = "INSERT INTO Category (Name, password, esadmin) VALUES (?,?,?)";
	final String SQL_DELETE_BY_ID = "DELETE FROM Category WHERE id = ?";
	final String SQL_UPDATE = "UPDATE Category SET Name = ? , password = ?, esadmin = ? WHERE id= ?";
	final String SQL_AUTORIZAR = "SELECT * FROM Category WHERE Name = ? AND password = ?";
	
//	------------------------ Builder ------------------------
	
	public CategoryDAO() {
		
	} 
//	------------------------ Methodes || Business Rules ------------------------
}
