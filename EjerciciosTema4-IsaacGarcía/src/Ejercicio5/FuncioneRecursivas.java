package Ejercicio5;

public class FuncioneRecursivas {
	
	static int sumatorio(int numero) {
		
		//Declaración de variables
		int suma=0;
		
		//Si el numero es 0
		if(numero==0) {
			//La suma es 0
			suma=0;
		} else {
			//si no la suma es numero + sumatorio(numero-1)
			suma=numero + sumatorio(numero-1);
		}
		
		//Devolvemos la variables
		return suma;
	}
	
	static double potencia(double a, int n) {
		//Declaración de variables
		double res;
		
		//Funcion Recursiva
		if(n==0) {
			res=1;
		} else {
			res=a*potencia(a, (n-1));
		}
		
		//Devolvemos el resultado
		return res;
		
	}
	
	static int serieFibonacci(int n) {
		//Declaración de variables
		int res;
		
		// Si n es 1, el resultado es 1
		if(n==1) {
			res = 1;
		// Si n es 0, el resultado es 1	
		} else if(n==0) {
			res = 1;
		// Si no calculamos el resultado con la formula de Fibonacci
		} else {
			res = serieFibonacci(n-1)+serieFibonacci(n-2);
		}
		
		//Devolvemos el resultado
		return res;
		
	}

}
