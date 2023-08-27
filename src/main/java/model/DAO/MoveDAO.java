package model.DAO;

public class MoveDAO {
//	------------------------ Variables ------------------------
	final String SQL_SELECT_ALL = "SELECT * FROM Move;";
	final String SQL_SELECT_BY_ID = "SELECT * FROM Move WHERE id = ?";
	final String SQL_INSERT = "INSERT INTO Move (Name, password, esadmin) VALUES (?,?,?)";
	final String SQL_DELETE_BY_ID = "DELETE FROM Move WHERE id = ?";
	final String SQL_UPDATE = "UPDATE Move SET Name = ? , password = ?, esadmin = ? WHERE id= ?";
	final String SQL_AUTORIZAR = "SELECT * FROM Move WHERE Name = ? AND password = ?";
	
//	------------------------ Builder ------------------------
	
	public MoveDAO() {
		
	} 
//	------------------------ Methodes || Business Rules ------------------------
}
