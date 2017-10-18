import java.util.Scanner;

public class CantDigi {

	public static void main(String[] args) {
		System.out.println("Escribe un número:");
		
		Scanner lector = new Scanner (System.in);
		int numero = lector.nextInt();
		
		int contador = 0;
		int i = 0;
		String digito = Integer.toString(numero);
		while (i < digito.length()){
			contador ++;
			i++;
		}
		System.out.println("Este número tiene " +contador +" digito(s)");

	}

}
