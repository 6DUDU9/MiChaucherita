package test;

import java.time.LocalDate;

import model.entidades.Account;
import model.entidades.Category;
import model.entidades.Move;
import model.entidades.Type;
import model.entidades.User;

public class mainTestf {

	public static void main(String[] args) {
		System.out.println("PRUEBA GITHUB I");
		
		User usuario = new User();
		
//		Cuenta money sin efectivo
		Account cuentaEfectivo = new Account("efectivo", 1000);
		Account cuentaPichincha = new Account( "pichincha", 1000);
		
//		Categoria
		Category categoriaI = new Category("PERSONAL", 19.2, Type.INCOME);
		Category categoriaS = new Category("Trabajo", 20.8, Type.SPENT);
		
//		relizar movimiento
		String dateString = "2023-08-20";
		String dateString1 = "2023-04-12";
		String dateString2 = "2023-03-22";
		LocalDate date = LocalDate.parse(dateString);
		
		//Move movimientoI = new Move( date, 100, "Gasto de coito", categoriaI , cuentaEfectivo );
		//Move movimiento2 = new Move( LocalDate.parse(dateString1), 100, "Gasto comida", categoriaI , cuentaEfectivo );
		//Move movimiento3 = new Move( LocalDate.parse(dateString2), 100, "Ingreso deuda", categoriaS , cuentaPichincha);
//		ver movimiento
		System.out.println("--------------------------------------");
		System.out.println(cuentaEfectivo.getAccountName());
		System.out.println("--------------------------------------");
		System.out.println("Movimiento de ingreso: ");
		//System.out.println(movimientoI.toString());
		
		
		System.out.println(date);
		
//		Escenario 1
		
		

	}

}
