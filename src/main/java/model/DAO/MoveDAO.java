package model.DAO;

import java.sql.Date;
import java.util.ArrayList;

import model.entidades.Account;
import model.entidades.Category;
import model.entidades.Move;
import model.entidades.Type;
import model.entidades.User;

public interface MoveDAO {
	public ArrayList<Move> getAllMovebyUser(User user);
	public ArrayList<Move> filtrar(Account account);
	public ArrayList<Move> filtrar(Category category, User user);
	public void insertMove(Move move);
	public Double getBalanceByType(Date date, Type categoryType);
}
