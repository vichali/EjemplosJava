package ejemplosString;
/**
 * Fecha: 29/09/2009 00:33:01
 * @author Victor
 * StringEquals.java
 */

public class StringEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		/*
		 * Diferenciando operador lógico == y la función
		 * del método equals de la clase string	
		 * si modificamos str1 = str2 el resultado 
		 * dará que son del mismo objeto	
		 *   
		 */
				 String str1="El lenguaje Java";
				 
			     String str2=new String("El lenguaje JAVA");
			     
			     System.out.println(); 
//			     
//				if (str1 == str2) {
//					System.out.println("Los mismos objetos");
//				} else {
//					System.out.println("Distintos objetos");
//				}
//				
				
				
				if (!str1.equals(str2)) {
					System.out.println("El mismo contenido");
				} else {
					System.out.println("Distinto contenido");
				}      
				
			
	
				
		/*
		 * El uso de equalsIgnoreCase permite determinar si dos cadenas son
		 * iguales sin importar diferencias entre mayúsculas o minúsculas
		 */

		String str3 = "El LENGUAJE Java";
		String str4 = new String("El lenguaje Java");
		System.out.println();
		
		
		System.out.print("Con diferencia entre may y min, tenemos: ");
			if (str3.equalsIgnoreCase(str4)) {
				System.out.println("El mismo contenido");
			} else {
				System.out.println("Distinto contenido");
			}    		

			
	} // main

} // StringEquals
