package test;

import java.time.LocalDate;

import model.Account;
import model.Category;
import model.Move;

public class mainTestf {

	public static void main(String[] args) {
		System.out.println("PRUEBA GITHUB I");
		
//		Cuenta money sin efectivo
		Account cuentaEfectivo = new Account(1, "efectivo", 1000);
		Account cuentaPichincha = new Account(2, "pichincha", 1000);
		
//		Categoria
		Category categoriaI = new Category(1,"PERSONAL", 19.2);
		Category categoriaS = new Category(2,"Trabajo", 20.8);
		
//		relizar movimiento
		String dateString = "2023-08-20";
		String dateString1 = "2023-04-12";
		String dateString2 = "2023-03-22";
		LocalDate date = LocalDate.parse(dateString);
		
		Move movimientoI = new Move(1, date, 100, "Gasto de coito", categoriaI , cuentaEfectivo );
		Move movimiento2 = new Move(2, LocalDate.parse(dateString1), 100, "Gasto comida", categoriaI , cuentaEfectivo );
		Move movimiento3 = new Move(3, LocalDate.parse(dateString2), 100, "Ingreso deuda", categoriaS , cuentaPichincha);
//		ver movimiento
		System.out.println("--------------------------------------");
		System.out.println(cuentaEfectivo.getAccountName());
		System.out.println("--------------------------------------");
		System.out.println("Movimiento de ingreso: ");
		System.out.println(movimientoI.toString());
		
		
		System.out.println(date);
		
//		Escenario 1
		
		

	}

}
