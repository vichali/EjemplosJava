package ejemplosString;

/**
 * Fecha: 29/09/2009 00:38:07
 * @author Victor
 * StringIndexOf.java
 */

public class StringIndexOf {
	
	public static void main(String[] args) {
	/*
	 * Si se quiere obtener la posici�n de la primera ocurrencia
	 * de la letra g, se usa la funci�n indexOf.
	 * String txt3="Proyecto Programar";
	 * int pos=txt3.indexOf("g");
	 * otra versi�n es con un substring como
	 * int pos=txt3.indexOf("grama");
	 * con igual resultado 
	 */
			System.out.println();
			String txt3 = "Proyecto Programar";
			int pos = txt3.indexOf("g");
			System.out.print("La ocurrencia es en la posici�n: ");
			System.out.println(pos);
			// El segundo argumento le dice a la funci�n indexOf 
			// que empiece a buscar la primera ocurrencia 
			// de la letra r a partir de la posici�n pos+1		
			pos=txt3.indexOf("r", pos+1);
			System.out.print("La ocurrencia es en la posici�n: ");
			System.out.println(pos);
	}

}
