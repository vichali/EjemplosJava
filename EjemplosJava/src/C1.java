public class C1 {

	/*
	 * Caracteres de Escape
	 * \n -----> Nueva Linea.
	 * \t -----> Tabulador.
	 * \\ -----> El caracter barra inversa ( \ ).
	 * \' -----> El caracter prima simple ( ' ).
	 * \" -----> El caracter prima doble o bi-prima ( " ).
	 */

	/**
	 * 	@author Victor
	 */
	
	public static void main(String[] args)  {
		int a,b;
		a=20;
		b=30;
		
		// También podemos mostrar la forma:
		// String msj = "El resultado de la suma es: ";
		// System.out.println(msj + total);
		// String es una clase, no un tipo primitivo de dato
		
		// \t produce una tabulación en la salida de los datos
		System.out.print("El total es:\t ");
		System.out.print(a + b);
		// \n produce una nueva línea 
		System.out.print("\nEl total es: ");
		System.out.print(a + b);
		
				
	}
}



