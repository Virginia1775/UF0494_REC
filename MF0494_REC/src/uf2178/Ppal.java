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
		
		System.out.println("Introduce el a�o de compra de tu veh�culo: ");
		int a�o = entrada.nextInt();
		
		Funciones.vehiculoAfectadoAirbag(a�o);
		
		int costes[] = new int[6];
		
		System.out.println("Introduce los costes:");
		Funciones.pedir_vector(costes);
		
		Funciones.calcularCosteTotal(costes);
		System.out.println("Los costes son: ");
		Funciones.mostrar_vector(costes);
		
		
		
		
		
		
		
		
		
	}

}
