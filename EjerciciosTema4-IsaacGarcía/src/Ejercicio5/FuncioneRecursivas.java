package Ejercicio5;

public class FuncioneRecursivas {
	
	static int sumatorio(int numero) {
		
		//Declaración de variables
		int suma=0;
		
		//Sumamos i hasta que llegue al valor del numero
		for(int i=1; i<=numero; i++) {
			suma+=i;
		}
		
		//Devolvemos la variables
		return suma;
	}
	
	static double potencia(double a, int n) {
		//Devolvemos el resultado
		return (int)Math.pow(a, n);
		
	}
	
	static int serieFibonacci(int n) {
		return (n-1)+(n-2);
	}

}
