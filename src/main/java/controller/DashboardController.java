package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.entidades.Account;
import model.entidades.Category;
import model.entidades.Move;
import model.entidades.Type;
import model.entidades.User;
import modelo.jpa.JPAAccount;
import modelo.jpa.JPACategory;
import modelo.jpa.JPAMove;

@WebServlet("/DashboardController")
public class DashboardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DashboardController() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Siempre se Redirecciona
		System.out.println("YA entro por get");
		this.ruteador(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		Siempre se Redirecciona
		System.out.println("YA entro por post");
		this.ruteador(request, response);

	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String ruta = (request.getParameter("ruta") == null) ? "inicio" : request.getParameter("ruta");

		switch (ruta) {
		case "inicio":
			System.out.println("estamos en inicio");
			this.inicio(request, response);
			break;
		case "dashboard":
			System.out.println("estamos en dashboard");
			this.dashboard(request, response);
			break;
//			C.U: Ver Movmientos
		case "verPorTodosMovimientos":
			System.out.println("estamos en movimientos 1");
			this.verPorTodosMovimientos(request, response);
			break;
		case "verPorCuenta":
			System.out.println("estamos en ver movimientos por Cuenta");
			this.verPorCuenta(request, response);
			break;
		case "gasto":
			System.out.println("estamos en gasto");
			this.gasto(request, response);
			break;
		case "ingreso":
			System.out.println("estamos en ingreso");
			this.ingreso(request, response);
			break;
		case "transferencia":
			this.transferencia(request, response);
			break;
		case "salir":
			this.salir(request, response);
			break;
		case "error":
			break;
		default:
			break;
		}
	}

	private void transferencia(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.- Obtener datos que me envï¿½an en la solicitud
		String descripcion = request.getParameter("descripcion");
		String fecha = request.getParameter("fecha");
		String monto = request.getParameter("monto");
		Integer cuentaIdOrigen = Integer.parseInt(request.getParameter("origen"));
		Integer cuentaIdDestino = Integer.parseInt(request.getParameter("destino"));
		// 2.- Llamo al Modelo para obtener datos
		Date fechaFormatted = Date.valueOf(fecha);
		String montoSinSigno = monto.replaceAll("[^\\d.]", "");
		// Convertir la cadena a un valor double
		double montoDouble = Double.parseDouble(montoSinSigno);

		JPACategory jpaCategory = new JPACategory();
		JPAAccount jpaAccount = new JPAAccount();

		List<Category> categories = jpaCategory.getCategoryList(Type.TRANSFER);
		Category category = categories.get(0);
		Account accountO = jpaAccount.getById(cuentaIdOrigen);
		Account accountD = jpaAccount.getById(cuentaIdDestino);

		if (accountO.check(montoDouble)) {
			JPAMove jpaMove = new JPAMove();
			// Se resta el dinero de la cuenta de origen
			Move spentMove = new Move(fechaFormatted, montoDouble, descripcion, category, accountO);
			jpaMove.insertMove(spentMove);
			jpaAccount.updateBalance(cuentaIdOrigen, -montoDouble);
			// Se aumenta el dinero en la cuenta de destino
			Move incomeMove = new Move(fechaFormatted, montoDouble, descripcion, category, accountD);
			jpaMove.insertMove(incomeMove);
			jpaAccount.updateBalance(cuentaIdDestino, montoDouble);

		} else {
			System.out.println("NO SE PUEDE REALIAR LA TRANSFERENCIA");
		}

		// 3.- Llamo a la Vista
		response.sendRedirect("DashboardController?ruta=dashboard");
	}

	// entonces si es inicio se va a este metodo, que SIEMPRE debe poner el Error
	// throws
	private void inicio(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1.- Obtener datos que me envï¿½an en la solicitud

		// 2.- Llamo al Modelo para obtener datos

		// 3.- Llamo a la Vista
		response.sendRedirect("jsp/login.jsp");
	}

	private void dashboard(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 1.- Obtener datos que me envï¿½an en la solicitud
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("ctaUser");
		String nameUser = user.getUsername();
		session.setAttribute("nameUser", nameUser);
		java.util.Date utilDate = new java.util.Date();

		// 2.- Llamo al Modelo para obtener datos
		JPAAccount jpaAccount = new JPAAccount();
		List<Account> accounts = jpaAccount.getAll();

		JPACategory jpaCategory = new JPACategory();
		List<Category> categoriesSpent = jpaCategory.getCategoryList(Type.SPENT);
		List<Category> categoriesIncome = jpaCategory.getCategoryList(Type.INCOME);

		JPAMove jpaMove = new JPAMove();
		Date date = new Date(utilDate.getTime());
		Double income = jpaMove.getBalanceByType(date, Type.INCOME);
		Double discharge = jpaMove.getBalanceByType(date, Type.SPENT);
		Double balance = income - discharge;

		request.setAttribute("categoriasG", categoriesSpent);
		request.setAttribute("categoriasI", categoriesIncome);
		request.setAttribute("cuentas", accounts);
		request.setAttribute("balance", balance);
		request.setAttribute("income", income);
		request.setAttribute("discharge", discharge);

		// 3.- Llamo a la Vista
		request.getRequestDispatcher("jsp/dashboard.jsp").forward(request, response);
	}

//	y especificamente con este metodo nos ahorramos el logoutController, aplicando asi la teoria del ruteador
	private void salir(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().invalidate();
		response.sendRedirect("jsp/login.jsp");
	}

	private void gasto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Integer catId = Integer.parseInt(request.getParameter("categoria"));
		String descripcion = request.getParameter("descripcion");
		String fecha = request.getParameter("fecha");
		String monto = request.getParameter("monto");
		Integer cuentaId = Integer.parseInt(request.getParameter("cuenta"));

		// 2.- Llamo al Modelo para obtener datos
		Date fechaFormatted = Date.valueOf(fecha);
		String montoSinSigno = monto.replaceAll("[^\\d.]", "");

		// Convertir la cadena a un valor double
		double montoDouble = Double.parseDouble(montoSinSigno);

		JPAAccount jpaAccount = new JPAAccount();
		Account account = jpaAccount.getById(cuentaId);

		JPACategory jpaCategory = new JPACategory();
		Category category = jpaCategory.getById(catId);

		if (account.check(montoDouble)) {
			JPAMove jpaMove = new JPAMove();
			Move spentMove = new Move(fechaFormatted, montoDouble, descripcion, category, account);
			jpaMove.insertMove(spentMove);
			jpaAccount.updateBalance(cuentaId, -montoDouble);
			jpaCategory.updateValue(catId, montoDouble);
		} else {
			System.out.println("NO SE PUEDE REALIAR EL GASTO");
		}

		System.out.println("" + catId + descripcion + fecha + montoDouble + cuentaId);
		// 3.- Llamo a la Vista
		response.sendRedirect("DashboardController?ruta=dashboard");
	}

	private void ingreso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer catId = Integer.parseInt(request.getParameter("categoria"));
		String descripcion = request.getParameter("descripcion");
		String fecha = request.getParameter("fecha");
		String monto = request.getParameter("monto");
		Integer cuentaId = Integer.parseInt(request.getParameter("cuenta"));

		// 2.- Llamo al Modelo para obtener datos
		Date fechaFormatted = Date.valueOf(fecha);
		String montoSinSigno = monto.replaceAll("[^\\d.]", "");

		// Convertir la cadena a un valor double
		double montoDouble = Double.parseDouble(montoSinSigno);

		JPAAccount jpaAccount = new JPAAccount();
		Account account = jpaAccount.getById(cuentaId);

		JPACategory jpaCategory = new JPACategory();
		Category category = jpaCategory.getById(catId);

		JPAMove jpaMove = new JPAMove();
		Move incomeMove = new Move(fechaFormatted, montoDouble, descripcion, category, account);
		jpaMove.insertMove(incomeMove);
		jpaAccount.updateBalance(cuentaId, montoDouble);
		jpaCategory.updateValue(catId, montoDouble);

		System.out.println("" + catId + descripcion + fecha + montoDouble + cuentaId);
		// 3.- Llamo a la Vista
		response.sendRedirect("DashboardController?ruta=dashboard");

	}

//	----------------------------------- VER MOVIMIENTOS ---------------------------------------------------
	private void verPorTodosMovimientos(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 1.- Obtener datos que me envï¿½an en la solicitud
		HttpSession session = request.getSession();
		User userLogeado = (User) session.getAttribute("UserLogeado");
		// 2.- Llamo al Modelo para obtener datos
		JPAMove jpaMove = new JPAMove();
		ArrayList<Move> movimientos = (ArrayList<Move>) jpaMove.getAllMovebyUser(userLogeado);

		JPAAccount jpaAccount = new JPAAccount();
		List<Account> accounts = jpaAccount.getAll();
		// 3.- Llamo a la Vista enviando datos
		request.setAttribute("movimientos", movimientos);
		request.setAttribute("cuentas", accounts);
		request.getRequestDispatcher("jsp/moves.jsp").forward(request, response);
	}

	private void verPorCuenta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 1.- Obtener datos que me env�an en la solicitud
		HttpSession session = request.getSession();
		User userLogeado = (User) session.getAttribute("UserLogeado");
		int cuentaID = Integer.parseInt(request.getParameter("cuentaID"));
		// Este metodo me ayuda a obtener por Id una cuenta
		JPAAccount jpaAccount = new JPAAccount();
		Account account = (Account) jpaAccount.getById(cuentaID);
		System.out.println(account.getAccountName());

		// 2.- Llamo al Modelo para obtener datos
		JPAMove jpaMove = new JPAMove();
		ArrayList<Move> movimientos = (ArrayList<Move>) jpaMove.filtrar(account);

		// 3.- Llamo a la Vista enviando datos
		request.setAttribute("user", userLogeado);
		request.setAttribute("accountName", account.getAccountName());
		request.setAttribute("movimientos", movimientos);
		request.getRequestDispatcher("jsp/moves.jsp").forward(request, response);
	}

	private void verPorCategoria(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		/*
		 * // 1.- Obtener datos que me envï¿½an en la solicitud HttpSession session =
		 * request.getSession(); User userLogeado = (User)
		 * session.getAttribute("UserLogeado"); int idCategory =
		 * Integer.parseInt(request.getAttribute("idCategory"));
		 * 
		 * JPACategory jpaCategory = new JPACategory(); Category category = (Category)
		 * jpaCategory.getById(idCategory);
		 * 
		 * // 2.- Llamo al Modelo para obtener datos JPAMove jpaMove = new JPAMove();
		 * ArrayList<Move> movimientos = (ArrayList<Move>) jpaMove.filtrar(category);
		 * 
		 * // 3.- Llamo a la Vista enviando datos request.setAttribute("user",
		 * userLogeado); request.setAttribute("movimientos", movimientos);
		 * request.getRequestDispatcher("jsp/moves.jsp").forward(request, response);
		 */
	}

}
