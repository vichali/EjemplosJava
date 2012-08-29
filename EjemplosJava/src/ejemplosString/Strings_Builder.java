package ejemplosString;
/**
 * Fecha: 11/09/2009 01:44:24
 * @author Victor
 * Strings_Builder.java
 */

public class Strings_Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
	// uso de la clase StringBuilder, presente desde java 1.5
	// que nos permite crear objetos dinámicos
	// StringBuffer es similar
	// más en http://java.sun.com/j2se/1.5.0/docs/api/java/lang/StringBuilder.html
		
	  StringBuilder str = new StringBuilder();
	  
  /*
   * Append agrega texto al final de la cadena
   * cargando dinámicamente nuevo valor a la posición de
   * memoria de la variable.
   *  
   */
	    
	  System.out.println("0123456789012345678901234567890");
	  str.append("Métodos y usos ");
	  str.append("de StringBuilder");
	  
	  System.out.println(str);

	  
   /* 
    * El método delete borra 
    * desde pos, hasta
    * str.delete(desde, hasta)
    * 
    */
	  System.out.println();
	  System.out.println("Ejemplo del uso del método delete:");
	  System.out.println(str.delete(0,8));
	  
   /*
    * El método insert, inserta dentro de la cadena
    * una nueva cadena de texto a partir de la posición dada
    *   
    */
	// inserta texto en una pos determinada
	  System.out.println();
	  str.insert(15, "-INSERT-");
	  
   /*
    * El método substring extrae parte o toda una cadena
    * a partir de un índice
    * indicando desde, hasta
    * 
    */
	  	  
	  System.out.println(str);
	  System.out.println(str.substring(10,18));
	
   /*
    * El método CharAT sobre un arguménto o parámetro entero
    * que devuelve el caractér que se encuentre en la posición 
    * indicada
    *   
    */
	  
	  System.out.println();
	  System.out.println("0123456789012345678901234567890");
	  System.out.println(str);
	  System.out.println(str.charAt(16));
	  
	 
	 /*
	  * El uso del método reverse permite invertir el orden
	  * de la cadena indicada como argumento
	  * 
	  */
	  
	  StringBuilder str2 = new StringBuilder();
	  System.out.println(str2);
	  System.out.println(str2.append("Invertir una cadena"));
	  System.out.println(str2.reverse());

	 /*
	  * Si se quiere obtener la posición de la primera ocurrencia
	  * de una letra o subcadena, se usa la función indexOf.
	  * String txt3="Proyecto Programar";
	  *  
	  */
	  
	  System.out.println();
	  System.out.println("0123456789012345678901234567890");
	  System.out.print(str2.delete(0, str2.length()));
	  System.out.println(str2.append("Esta es una nueva cadena de texto"));
	  // encuentra una coincidencia a partir de una cadena
	  System.out.println("\"una\" se encuentra en la pos " + str2.indexOf("una"));
	  // encuentra a partir de una pos
	  System.out.println(str2.indexOf("e",13));
	  
	  
	  /*
	   * lastIndexOf permite buscar una subcadena en una cadena
	   * a partir de la útima ocurrencia
	   * 
	   */
	  
	  System.out.println("\nlastIndexOf");
	  System.out.println("0123456789012345678901234567890");
	  System.out.println(str2);
	  System.out.println(str2.lastIndexOf("e"));
	  
	  
	  
	  /*
	   * setCharAt 
	   * El método setCharAt recibe dos parámetros: un entero y un carácter 
	   * Su tarea es asignar el carácter en la posición especificada por el entero
	   * 
	   */
	  System.out.println();
	  System.out.println("0123456789012345678901234567890");
	  System.out.println(str2);
	  str2.setCharAt(29,'o');
	  System.out.println(str2);
	  
	  
	  
	  
	  
	  
	  
	/*
	 * diferencia usando string y stringBuffer o stringBuilder  
	 */
	  
	  /*
	  String cadena = new String("Cuenta: ");
	  for (int i=0; i<100; i++) {
	     cadena += " " + i + " ";
	     System.out.println(cadena);
	  }
	  
	  System.out.println();
	  StringBuffer cadena2 = new StringBuffer("Cuenta: ");
	  for (int x=0; x<100; x++) {
	     cadena2.append(" " + x + " ");
	     System.out.println(cadena2);
	  }
     */
	  
/*
 * Para convertir un string en número decimal (double) se requieren dos pasos:
 * convertir el string en un objeto de la clase envolvente Double, 
 * mediante la función miembro estática valueOf, y a continuación convertir 
 * el objeto de la clase Double en un tipo primitivo double mediante la 
 * función doubleValue
 * 

	String str="12.35 ";
	double numero=Double.valueOf(str).doubleValue();

Se puede hacer el mismo procedimiento para convertir un string a número entero

	String str="12";
	int numero=Integer.valueOf(str).intValue();
	
 */

	}

}
