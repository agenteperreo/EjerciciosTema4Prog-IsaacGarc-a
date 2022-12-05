package ejercicio4;

public class Operaciones {
	
	//Creación de variables globales
	int num1, num2;
	
	int suma() {
		
		//Devolvemos la suma
		return num1+num2;
	}
	
	int resta() {
		
		//Devolvemos la resta
		return num1-num2;
	}
	
	int multiplicación() {
		
		//Devolvemos la multiplicación
		return num1*num2;
	}
	
	double division() {
		double res=0;
		
		if(num2!=0) {
			res=(double)num1/num2;
		} else {	
			System.err.println("ERROR: No se puede dividir entre 0");
		}
		
		//Devolvemos la división con decimales
		return res;
	}

}
