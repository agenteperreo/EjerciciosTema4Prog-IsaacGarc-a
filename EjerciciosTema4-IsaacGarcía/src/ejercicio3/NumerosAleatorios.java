package ejercicio3;

public class NumerosAleatorios {

	static void numerosAleatorios(int a) {

		// Generamos a numeros aleatorios
		for (int i = 0; i < a; i++) {
			System.out.println((int) (Math.random()+0.5));
		}

	}

	static void numerosAleatorios(int a, int b) {

		// Generamos a numeros aleatorios entre 0 y b
		for (int i = 0; i < a; i++) {
			System.out.println((int) (Math.random() * b));
		}

	}

	static void numerosAleatorios(int a, int b, int c) {

		// Generamos a numeros aleatorios entre b y c
		for (int i = 0; i < a; i++) {
			System.out.println((int) (Math.random()*b-c+1)+c);
		}

	}
	
}
