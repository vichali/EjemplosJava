package ejemplosString;
/**
 * Fecha: 29/09/2009 00:31:12
 * @author Victor
 * StringCompare.java
 */

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  
		/*
		 * comapareTo devuelve un entero menor que cero si el objeto string 
		 * es menor (en orden alfabético) que el string dado, cero si son iguales, 
		 * y mayor que cero si el objeto string es mayor que el string dado.
		 * 
		 * String str="Proyecto Programar";
		 * int resultado=str.compareTo("Aniversario");
		 * La variable entera resultado tomará un valor mayor que cero, 
		 * ya que Proyecto Programar está después de Aniversario en orden alfabético.
		 * La variable entera resultado tomará un valor menor que cero, 
		 * si txt1 está antes que txt2 en orden alfabético.	 
		 * Si txt1 y txt2, la variable resultado tomará el valor de 0. 
		 */
				  
				  System.out.println();	  
				  String txt1 = "Proyecto Programar", txt2 = "Aniversario" ; 
				  System.out.print("Si son iguales devuelve 0: ");
				  
				  System.out.println(txt1.compareTo(txt2));
				  
				  

	}

}
