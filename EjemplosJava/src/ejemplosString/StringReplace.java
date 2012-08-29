package ejemplosString;
/**
 * Fecha: 29/09/2009 00:42:16
 * @author Victor
 * StringReplace.java
 */

public class StringReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/* 
		 * replace permite reemplazar una cadena o caracter por otra
		 * los m�todos replaceAll y replaceFirs permiten trabajar con expresiones 
		 * regulares, una expresi�n regular es una cadena de texto que indica
		 * una serie de patrones.
		 * replaceFirs reemplazar� la primer ocurrencia
		 * 
		 */
				System.out.println();
				String txt4 = "Proyecto Programar";
				
				System.out.println(txt4.replace("P", "p"));
				System.out.println(txt4.replace("gra", "GRA"));
				
				System.out.println(txt4.replaceAll("[e|a]", "i"));
				
				System.out.println(txt4.replaceFirst("ro", "RO"));
				System.out.println(txt4.replaceFirst("[p|a]", "RO"));
				
		
	}

}







