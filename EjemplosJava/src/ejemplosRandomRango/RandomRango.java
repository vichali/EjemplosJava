package ejemplosRandomRango;
import java.util.Random;

public class RandomRango {

		Random unNumero = new Random();
		
		public void cargaVector() {

			// definimos el rango del n�mero a obtener
			int minimo=20;
			int maximo=25;
			// se genera el random
			int v = unNumero.nextInt(10);
			
			// Valor entre m�nimo y m�ximo ambos inclu�dos
			int valor = unNumero.nextInt(maximo - minimo+1)+minimo; 
			
			System.out.println(valor);
			
			
		}
		
}
