package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Abrimos el escaner
		Scanner scan=new Scanner(System.in);
		
		//Creamos el objeto
		Operaciones ope=new Operaciones();
		
		//Pedimos los 2 numeros
		System.out.println("Dime 2 numeros: ");
		ope.num1=scan.nextInt();
		ope.num2=scan.nextInt();
		
		//Llamamos a la función suma
		System.out.println("La suma es "+ope.suma());
		
		//Llamamos a la función resta
		System.out.println("La resta es "+ope.resta());
		
		//Llamamos a la función multiplicación
		System.out.println("La mutiplicación es "+ope.multiplicación());
		
		//Llamamos a la función division
		System.out.printf("La división es %.2f",ope.division());
		
		//Cerramos el escaner
		scan.close();
	}

}
