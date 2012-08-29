package ejemplosString;
import java.util.ArrayList;
import java.util.Vector;


/**
 * Fecha: 04/10/2009 04:19:38
 * @author Victor
 * Vectores.java
 */

public class Vectores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int contar[];
	//   String sectores[] = new String[4];
					
		String sectores[] = {"Administración","Producción","Fábrica","Depósito"};
		
		for (String sec : sectores) {
			System.out.println(sec);
		}
		
		System.out.println();
		System.out.println(sectores[2]);
		System.out.println();
		
		for(int x=0; x< sectores.length;x++){
			System.out.println(sectores[x]);
		}

			

	} // fin main

} // vectores
