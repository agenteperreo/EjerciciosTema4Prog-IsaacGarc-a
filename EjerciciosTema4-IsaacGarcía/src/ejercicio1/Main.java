package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declaración de variables
		int num;
		
		//Creamos el objeto numero
		Numeros numero=new Numeros();
		
		//Abrimos el escaner
		Scanner scan=new Scanner(System.in);
		
		//Pedimos un numero
		System.out.print("Dime un numero: ");
		num=scan.nextInt();
		
		//Llamamos a la funcion esPrimo y mostramos
		System.out.println((numero.esPrimo(num) ? "Es primo" : "No es primo"));
		
		//Llamamos a la funcion esCapicua y mostramos
		System.out.println((numero.esCapicua(num) ? "Es capicua" : "No es Capicua"));
		
		//Cerramos el escaner
		scan.close();

	}

}
