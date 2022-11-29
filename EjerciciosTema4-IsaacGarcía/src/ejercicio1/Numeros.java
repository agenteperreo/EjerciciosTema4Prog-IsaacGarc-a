package ejercicio1;

public class Numeros {

	boolean esPrimo(int a) {
		// Creamos la variable para saber si es primo
		boolean esPrimo = true;

		// Recorremos los números desde 2 hasta número-1
		for (int i = 2; i < a; i++) {
			// Si el número es divisible por i deja de ser primo
			if (a % i == 0) {
				esPrimo = false;
				break;
			}
		}

		// Devovlemos la variable al main()
		return esPrimo;
	}

	boolean esCapicua(int a) {
		
		//Declaración de variables
		boolean capicua = false;
		int reves;
		int cifras = 0;
		int resto;
		
		// Equivalemos el numero a la variable reves
		reves = a;
		// Mientras reves no sea 0
		while (reves != 0) {
			// Descomponemos el número
			resto = reves % 10;
			cifras = cifras * 10 + resto;
			reves = reves / 10;
		}

		// Si el numero normal es igual al numero al reves es capicua
		if (a == cifras) {
			capicua=true;
		}
		
		//Devolvemos la variable
		return capicua;
	}

}
