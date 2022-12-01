package Ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num, potencia;
		double num1;
		
		//Abrimos el escaner
		Scanner scan=new Scanner(System.in);
		
		//Pedimos el numero para la suma
		System.out.print("Dime un numero: ");
		num=scan.nextInt();
		
		//Mostramos el resultado de función sumatorio
		System.out.printf("La suma desde 1 hasta %d es %d\n",num,FuncioneRecursivas.sumatorio(num));
		
		//Pedimos el numero y la potencia
		System.out.print("Dime un numero: ");
		num1=scan.nextDouble();
		System.out.print("¿A que numero quieres elevarlo?: ");
		potencia=scan.nextInt();
		
		//Mostramos el resultado de función potencia
		System.out.printf("La potencia de %.2f a %d es %.2f\n",num1,potencia,FuncioneRecursivas.potencia(num1, potencia));
		
		//Pedimos un numero para la serie Fibonacci
		System.out.print("Dime un numero y te digo el numero fibonacci: ");
		num=scan.nextInt();
		
		// Si el numero es menor que 0
		if(num<0) {
			//Muestra un error 
			System.err.println("ERROR: Numero incorrecto, debe ser mayor que 0");
		} else {
			//Mostramos el resultado de función serieFibonacci
		System.out.printf("El numero Fibonacci de %d es %d",num,FuncioneRecursivas.serieFibonacci(num));
		}
		
		//Cerramos el escaner
		scan.close();

	}

}
