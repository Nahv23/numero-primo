import java.util.Scanner;

// Ejemplo de Num Primos: 997, 77739509, 1777973

public class Start {
	static Scanner reader = new Scanner(System.in);

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1 || num == 2 || num == 3)
			return true;
		if (num == 1)
			return true;
		if (num % 2 == 0 || num % 3 == 0 || num % 10 == 5)
			return false;

		// Por el teorema que dice que es suficiente con comprobar con los numeros hasta la raiz cuadrada del numero
		long sqrtN = (long) Math.sqrt(num) + 1; 
		for (long i = 7L; i <= sqrtN; i += 2) {
			if (num % (i) == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int number;

		try {
			System.out.println("Introduce un numero");
			number = reader.nextInt();

			if (isPrime(number)) {
				System.out.println("El numero " + number + " es primo");
			} else {
				System.out.println("El numero " + number + " no es primo");
			}

		} finally {
			reader.close();
		}

	}

}
