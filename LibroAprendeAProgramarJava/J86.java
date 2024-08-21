/* pág 152
 * Función que tome como parámetros dos tablas:
 * La primera 6 números de un décimo de lotería
 * La segunda los 6 números de la combinación ganadora
 * Devuelve el número de aciertos
 */
package Ejercicios;

import java.util.Arrays;

public class J86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] decimo = new int[6];
		int[] ganador = new int[6];
		
		for(int i=0;i<decimo.length;i++) {
			
			int num = (int)(Math.random()*10);
			decimo[i]=num;
			
		}
		
		for(int i=0;i<ganador.length;i++) {
			
			int num = (int)(Math.random()*10);
			ganador[i]=num;
			
		}
		
		System.out.println(Arrays.toString(decimo));
		System.out.println(Arrays.toString(ganador));
		
		aciertosLoteria(decimo, ganador);
	}
	
	public static void aciertosLoteria(int[] boleto1, int[] boleto2) {
		
		int contador=0;
		
		for(int i=0;i<boleto1.length;i++) {
			
			if(boleto1[i]==boleto2[i]) {
				
				contador++;
				
			}
			
		}
		
		if(contador==boleto1.length) {
			
			System.out.println(" ¡¡¡¡¡¡¡¡¡¡¡ HA GANADO LA LOTERÍA !!!!!!!!!!!!!!");
			
		}else {
			
			System.out.println("Tiene un total de " + contador + " aciertos en su combinación");
		}
		
		
	}

}
