package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * M�todo de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * M�todo para mostrar por pantalla el vector pasado como par�metro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	public static void vehiculoAfectadoAirbag(int a�o) {
		String mensaje="";
		if (a�o<2000) {
			mensaje="No hay veh�culos afectados";
		} else if ( a�o<2005) {
			mensaje="Los veh�culos  de marca Seat y Opel afectados";
		} else if(a�o<2015) {
			mensaje= "Los veh�culos de marca Renault est�n afectados";
		} else {
			mensaje= "Retirada del carnet y de 3 a 6 meses de c�rcel";
		}
		System.out.printf("En el a�o %.2f con respecto al problema del airbag %s\n",a�o,mensaje);
	}
	
	public static void calcularCosteTotal(int costes[]) {
		for (int i = 0; i < costes.length; i++) {
			costes[i]=(costes[i]+costes[i]);
		}
		
		
	}
	
	

}
