/**
 * 
 */
package uf2178;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el año de compra de tu vehículo: ");
		int año = entrada.nextInt();
		
		Funciones.vehiculoAfectadoAirbag(año);
		
		int costes[] = new int[6];
		
		System.out.println("Introduce los costes:");
		Funciones.pedir_vector(costes);
		
		Funciones.calcularCosteTotal(costes);
		System.out.println("Los costes son: ");
		Funciones.mostrar_vector(costes);
		
		
		
		
		
		
		
		
		
	}

}
