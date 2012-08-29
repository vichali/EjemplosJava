package ejemplosString;
/**
 * Fecha: 09/09/2009 23:20:25
 * @author Victor
 * Strings.java
 */

public class Strings {
	

	public static void main(String[] args) {
			
/*
 * Java crea un objeto de la clase String automáticamente.
 * Java trata a un string como si fuera un array de caracteres.
 * Para crear un string explícitamente escribimos
 * String str=new String("un texto");
 * un string nulo se crea con 
 * String str=""  o con
 * String str=new String();
 * 
 */
		
		
		  String texto1 = "Proyecto Programar";
		  String texto2 = " 2009";
		  
		  int n = 5;
		  // SUBSTRING extracción de una parte de la cadena
		  // extrae los primero 8 caracteres
		  // las posiciones comienzan a contarse desde 0
		  // String str="El lenguaje Java";
		  // String subStr=str.substring(3, 11);
		  // mostrará lenguaje.
		  System.out.println((texto1.substring(0,8)));
		  
		  // Concatenación. Une las variables texto1 y n
		  System.out.println((texto1 +" " + n));
		  
		  // CONCAT concatenando mejor
		  System.out.println(texto1.concat(texto2));
		  
		  // STARTSWITH métdodo startswith, comienza con... (true o false) 
		  String comienza = "Proye";
		  // método startsWith
		  if (texto1.startsWith(comienza)) {
			  System.out.print("La variable \"texto1\" comienza con: " );
			  System.out.println(comienza);
		  }
		  
		  // ENDSWITH método endsWith termina con... (true o false)
		  System.out.println(texto1.endsWith("ar"));
		  
System.out.println();



		  String direcciones = "Las direcciones de internet son:\n";
		  direcciones += "www.proyectoprogramar.org\n";
		  direcciones += "www.proyectoprogramar.org/foro\n";
		  direcciones += "www.proyectoprogramar.org/campus\n";
		  direcciones += "www.proyectoprogramar.org/blog";
		  System.out.println(direcciones);
	
		  System.out.println();
		  System.out.println("Ahora en mayúsculas");
		  direcciones = direcciones.toUpperCase();
		  System.out.println(direcciones);
		  
		  System.out.println();
		  System.out.println("Ahora en Mayúsculas");
		  direcciones = direcciones.toLowerCase();
		  System.out.println(direcciones);

	} // main
} // Strings


