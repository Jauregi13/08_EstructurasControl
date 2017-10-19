import java.util.Scanner;

public class ContarDigitos {

	public static void main(String[] args) {
		System.out.println("Escribe un número entero:");
		
		Scanner lector = new Scanner (System.in);
		int numero = lector.nextInt();
		int suma = 0;
		String digito = Integer.toString(numero);
		for (int i=0; i < digito.length(); i++){
			int digito2 = Integer.parseInt(""+ digito.charAt(i));
			suma = suma + digito2;
		}
		System.out.println("la suma de los digitos del número es " +suma);

	}

}
