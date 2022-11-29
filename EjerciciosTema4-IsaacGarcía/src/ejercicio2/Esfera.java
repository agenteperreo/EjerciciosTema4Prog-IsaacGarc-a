package ejercicio2;

public class Esfera {
	
	static int r;
	
	static double superficie() {
		//Devolvemos el resultado
		return (4*Math.PI*r*r);
	}
	
	static double volumen() {
		//Devolvemos el resultado
		return ((4*Math.PI/3)*r*r*r);
	}

}
