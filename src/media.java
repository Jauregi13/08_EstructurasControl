import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		int total = 0;
		int leerNum;
		for (leerNum = 1; leerNum <= 10; leerNum++){
			System.out.println("Introduce el numero " + leerNum +":");
			int numero = lector.nextInt();
			total = total + numero;
		}
		float media = total / (leerNum-1);
		System.out.println("Esta es la media de todos los numeros: " +media);

	}

}
