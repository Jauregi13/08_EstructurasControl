
public class Multiplo5 {

	public static void main(String[] args) {
		System.out.println("Estos son los múltiplos de 5 del 1 al 100:");
		int numero = 1;
		for (int i = 5; i<=100; i++){
			if (i % 5 == 0){
				System.out.println(numero + ". " + i);
				numero ++;
			}
			
		}

	}

}
