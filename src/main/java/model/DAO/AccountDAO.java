package model.DAO;


public class AccountDAO {
//	------------------------ Variables ------------------------
	final String SQL_SELECT_ALL = "SELECT * FROM Account;";
	final String SQL_SELECT_BY_ID = "SELECT * FROM Account WHERE id = ?";
	final String SQL_INSERT = "INSERT INTO Account (Name, password, esadmin) VALUES (?,?,?)";
	final String SQL_DELETE_BY_ID = "DELETE FROM Account WHERE id = ?";
	final String SQL_UPDATE = "UPDATE Account SET Name = ? , password = ?, esadmin = ? WHERE id= ?";
	final String SQL_AUTORIZAR = "SELECT * FROM Account WHERE Name = ? AND password = ?";
	
//	------------------------ Builder ------------------------
	
	public AccountDAO() {
		
	} 
//	------------------------ Methodes || Business Rules ------------------------
}
