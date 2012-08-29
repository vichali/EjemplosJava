package ejemplosString;
/**
 * Fecha: 18/09/2009 23:36:04
 * @author Victor
 * UsoCharAt.java
 */

public class UsoCharAt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s = "texto de prueba";
		char c = 'e';
		int cont = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i) == c)  {
				 cont++;
			} // if
			
		} // for
	
		
		//
		
	} // main

} // class
