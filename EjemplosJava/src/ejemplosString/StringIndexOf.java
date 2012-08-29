package ejemplosString;

/**
 * Fecha: 29/09/2009 00:38:07
 * @author Victor
 * StringIndexOf.java
 */

public class StringIndexOf {
	
	public static void main(String[] args) {
	/*
	 * Si se quiere obtener la posición de la primera ocurrencia
	 * de la letra g, se usa la función indexOf.
	 * String txt3="Proyecto Programar";
	 * int pos=txt3.indexOf("g");
	 * otra versión es con un substring como
	 * int pos=txt3.indexOf("grama");
	 * con igual resultado 
	 */
			System.out.println();
			String txt3 = "Proyecto Programar";
			int pos = txt3.indexOf("g");
			System.out.print("La ocurrencia es en la posición: ");
			System.out.println(pos);
			// El segundo argumento le dice a la función indexOf 
			// que empiece a buscar la primera ocurrencia 
			// de la letra r a partir de la posición pos+1		
			pos=txt3.indexOf("r", pos+1);
			System.out.print("La ocurrencia es en la posición: ");
			System.out.println(pos);
	}

}
