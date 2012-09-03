package ejemplosRandomRango;
import java.util.Random;

public class RandomRango {

		Random unNumero = new Random();
		
		public void cargaVector() {

			// definimos el rango del número a obtener
			int minimo=20;
			int maximo=25;
			// se genera el random
			int v = unNumero.nextInt(10);
			
			// Valor entre mínimo y máximo ambos incluídos
			int valor = unNumero.nextInt(maximo - minimo+1)+minimo; 
			
			System.out.println(valor);
			
			
		}
		
}
