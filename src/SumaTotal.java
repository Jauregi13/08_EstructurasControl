import java.util.Scanner;

public class SumaTotal {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		int total = 0;
		for (int leerNum = 0; leerNum < 10; leerNum++){
			System.out.println("Introduce el numero " + (leerNum+1) +":");
			int numero = lector.nextInt();
			total = total + numero;
		}
		System.out.println("Esta es la suma total de todos los numeros: " +total);

	}

}
