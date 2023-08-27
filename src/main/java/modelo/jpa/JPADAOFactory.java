package modelo.jpa;

import model.DAO.AccountDAO;
import model.DAO.CategoryDAO;
import model.DAO.DAOFactory;
import model.DAO.MoveDAO;
import model.DAO.UserDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public UserDAO getUserDAO() {
		return new JPAUserDAO();
	}

	/*@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return new JPAAccountDAO();
	}

	@Override
	public CategoryDAO getCategoryDAO() {
		// TODO Auto-generated method stub
		return new JPAUserDAO();
	}

	@Override
	public MoveDAO getMoveDAO() {
		// TODO Auto-generated method stub
		return new JPAUserDAO();
	}*/

}