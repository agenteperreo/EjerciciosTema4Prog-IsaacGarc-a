package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declración de variables
		double superficie, volumen;
		
		//Abrimos el escaner
		Scanner scan=new Scanner(System.in);
		
		//Pedimos el radio
		System.out.print("Dime el radio de la esfera en cm: ");
		Esfera.r=scan.nextInt();
		
		//Llamamos a la funcion superficei y la guaradamos
		superficie=Esfera.superficie();
		
		//Llamamos a la funcion volumen y la guaradamos
		volumen=Esfera.volumen();
		
		//Mostramos los resultado
		System.out.printf("La superficie de la esfera es %.2f y el volumen es %.2f",superficie,volumen);
		
		//Cerramos el escaner
		scan.close();
		

	}

}
