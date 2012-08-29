public class C2 {

	/**
	 * @param args
	 * @return 
	 */
	
	private int resultados;
	
	public void sumo() {
		int valor1 = 20;
		int valor2 = 45;
		resultados = valor1 + valor2;
		System.out.println("El resulta de la suma: "+ resultados);
	}
	
	public int resto() {
		int valor3 = 400;
		int valor4 = 100;
		resultados = valor3 - valor4;
	  return resultados;
	}
	
	
	public static void main(String[] args) {
		C2 resultado = new C2();
		resultado.sumo();
		
		String msj2 = "El resultado de la resta es: ";
		System.out.println(msj2 + resultado.resto());
		
	}
}



