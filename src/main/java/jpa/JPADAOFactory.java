package jpa;

import model.DAO.AccountDAO;
import model.DAO.CategoryDAO;
import model.DAO.DAOFactory;
import model.DAO.MoveDAO;
import model.DAO.UserDAO;

public class JPADAOFactory extends DAOFactory {
	@Override
	public UserDAO getUserDAO() {
		return new UserDAO();
	}
	@Override
	public AccountDAO getAccountDAO() {
		return new AccountDAO();
	}
	@Override
	public CategoryDAO getCategoryDAO() {
		return new CategoryDAO();
	}
	@Override
	public MoveDAO getMoveDAO() {
		return new MoveDAO();
	}
}