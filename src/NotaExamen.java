import java.util.Scanner;

public class NotaExamen {

	public static void main(String[] args) {
		System.out.println("Escribe la nota de tu examen:");
		
		Scanner lector = new Scanner(System.in);
		
		int nota = lector.nextInt();
		
		if (nota < 5){
			System.out.println("Reprueba");
		}
		else if (nota >= 5 && nota < 7){
			System.out.println("Aprobado");
		}
		else if (nota >= 7 && nota < 9){
			System.out.println("Notable");
		}
		else if (nota >= 9 && nota < 10){
			System.out.println("Sobresaliente");
		}
		else if (nota == 10){
			System.out.println("Excelente");
		}
		else {
			System.out.println("La nota introducida es incorrecta");
		}

	}

}
