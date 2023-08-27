package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jpa.JPAAccount;
import jpa.JPACategory;
import jpa.JPAMove;
import model.Account;
import model.Category;
import model.Move;
import model.Spent;
import model.User;

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
		case "verPorTodosMovimientos":
			System.out.println("estamos en movimientos 1");
			this.verPorTodosMovimientos(request, response);
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

//	entonces si es inicio se va a este metodo, que SIEMPRE debe poner el Error throws
	private void inicio(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1.- Obtener datos que me env�an en la solicitud

		// 2.- Llamo al Modelo para obtener datos

		// 3.- Llamo a la Vista
		response.sendRedirect("jsp/login.jsp");
	}

	private void dashboard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 1.- Obtener datos que me env�an en la solicitud

		// 2.- Llamo al Modelo para obtener datos

		// 3.- Llamo a la Vista
		response.sendRedirect("jsp/dashboard.jsp");
	}

//	y especificamente con este metodo nos ahorramos el logoutController, aplicando asi la teoria del ruteador
	private void salir(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().invalidate();
		response.sendRedirect("jsp/login.jsp");
	}
	private void gasto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1.- Obtener datos que me env an en la solicitud
		Integer catId = Integer.parseInt(request.getParameter("categoria"));
		String descripcion = request.getParameter("descripcion");
		String fecha = request.getParameter("fecha");
		String monto = request.getParameter("monto");
		Integer cuentaId = Integer.parseInt(request.getParameter("cuenta"));

		// 2.- Llamo al Modelo para obtener datos
		LocalDate fechaFormatted = LocalDate.parse(fecha);
		String montoSinSigno = monto.replaceAll("[^\\d.]", "");

		// Convertir la cadena a un valor double
		double montoDouble = Double.parseDouble(montoSinSigno);

		JPAAccount jpaAccount = new JPAAccount();
		Account account = jpaAccount.getById(cuentaId);
		
		JPACategory jpaCategory = new JPACategory();
		Category category = jpaCategory.getById(catId);

		if (account.check(montoDouble)) {
			Spent spentMove = new Spent(0, fechaFormatted, montoDouble, descripcion, category, account);
			jpaAccount.updateBalance(cuentaId, -montoDouble);
			System.out.println("SE HIZO EL GASTO");
		} else {
			System.out.println("NO SE PUEDE REALIAR EL GASTO");
		}

		System.out.println("" + catId + descripcion + fecha + monto + cuentaId);
		// 3.- Llamo a la Vista
		request.getRequestDispatcher("jsp/dashboard.jsp").forward(request, response);
	}
	
//	si nos damos cuenta en esta seccion entraria lo que teniamos en el codigo doPost
	private void verPorTodosMovimientos(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 1.- Obtener datos que me env�an en la solicitud
		HttpSession session = request.getSession();
		User userLogeado = (User) session.getAttribute("UserLogeado");
		// 2.- Llamo al Modelo para obtener datos
		JPAMove jpaMove = new JPAMove();
		ArrayList<Move> movimientos = (ArrayList<Move>) jpaMove.getAllMovebyUser(userLogeado);

		// 3.- Llamo a la Vista enviando datos
		request.setAttribute("user", userLogeado);
		request.setAttribute("movimientos", movimientos);
		request.getRequestDispatcher("jsp/moves.jsp").forward(request, response);
	}

	private void verPorCuenta(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		/*
		// 1.- Obtener datos que me env�an en la solicitud
		HttpSession session = request.getSession();
		User userLogeado = (User) session.getAttribute("UserLogeado");
		int idAccount = Integer.parseInt(request.getParameter("idCuenta"));

//		Este metodo me ayuda a obtener por Id una cuenta 
		JPAAccount jpaAccount = new JPAAccount();
		Account account = (Accunt) jpaAccount.getById(idAccount);

		// 2.- Llamo al Modelo para obtener datos
		JPAMove jpaMove = new JPAMove();
		ArrayList<Move> movimientos = (ArrayList<Move>) jpaMove.filtrar(account);

		// 3.- Llamo a la Vista enviando datos
		request.setAttribute("user", userLogeado);
		request.setAttribute("movimientos", movimientos);
		request.getRequestDispatcher("jsp/moves.jsp").forward(request, response);
		*/
	}

	private void verPorCategoria(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		/*
		// 1.- Obtener datos que me env�an en la solicitud
		HttpSession session = request.getSession();
		User userLogeado = (User) session.getAttribute("UserLogeado");
		int idCategory = Integer.parseInt(request.getAttribute("idCategory"));
		
		JPACategory jpaCategory = new JPACategory();
		Category category = (Category) jpaCategory.getById(idCategory);

		// 2.- Llamo al Modelo para obtener datos
		JPAMove jpaMove = new JPAMove();
		ArrayList<Move> movimientos = (ArrayList<Move>) jpaMove.filtrar(category);

		// 3.- Llamo a la Vista enviando datos
		request.setAttribute("user", userLogeado);
		request.setAttribute("movimientos", movimientos);
		request.getRequestDispatcher("jsp/moves.jsp").forward(request, response);
		*/
	}

}
