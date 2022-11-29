package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declaración de variables
				int cantNum, valMax, valMin;

				// Abrimos el escaner
				Scanner scan = new Scanner(System.in);

				// Pedimos la cantidad de numeros aleatorios que quiere generar
				System.out.print("¿Cuantos numeros aleatorios quieres generar?: ");
				cantNum = scan.nextInt();

				// Llamamos a la función con la cantidad como parametro
				NumerosAleatorios.numerosAleatorios(cantNum);

				// Pedimos cantidad y numero maximo
				System.out.print("¿Cuantos numeros quieres generar?: ");
				cantNum = scan.nextInt();
				System.out.print("¿Cual va a ser el numero maximo?: ");
				valMax = scan.nextInt();

				// Llamamos a la función con la cantidad y el valor maximo como parametro
				NumerosAleatorios.numerosAleatorios(cantNum, valMax);

				// Pedimos la cantidad, numero maximo y numero minimo
				System.out.print("¿Cuantos numeros quieres generar?: ");
				cantNum = scan.nextInt();
				System.out.print("¿Cual va a ser el numero maximo?: ");
				valMax = scan.nextInt();
				System.out.print("¿Cual va a ser el numero minimo?: ");
				valMin = scan.nextInt();

				// Llamamos a la función con la cantidad, el valor maximo y el valor minimo como
				// parametro
				NumerosAleatorios.numerosAleatorios(cantNum, valMax, valMin);

				// Cerramos el escaner
				scan.close();

	}

}
