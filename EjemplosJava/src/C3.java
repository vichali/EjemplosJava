import java.util.Scanner;

public class C3 {

	/**
	 * Demo clase Scanner para el ingreso de datos
	 * netxInt(), nextLine(), nextFloat, Double
	 * 
	 */

	
	public static void main(String[] args)  {
		
		String nombre; int DNI;
		Scanner datos = new Scanner(System.in);
		
//		Scanner datos = new Scanner(System.in).useDelimiter("\n");
//		datos.useDelimiter("\n")

		System.out.print("Ingrese su nombre: ");
		nombre = datos.next();
		
		System.out.print("Ingrese su DNI: ");
		DNI = datos.nextInt();
		
		System.out.println();
		System.out.println("Ingresaste nombre " + nombre);
		System.out.println("Ingresaste DNI " + DNI);
		System.out.println();		
		
	}
}



