/* pág 143
 * Lee una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar ordenados
 * Hacerlo con dos tablas
 * Fusionar las dos tablas en una tercera y mostrar los 12 números ordenados
 */

package Ejercicios;
import java.util.*;

public class J80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tabla1 = {(int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100)};
		
		/*for(int i=0;i<tabla1.length;i++) {
			System.out.println(tabla1[i]);
		}*/
		
		Arrays.sort(tabla1);
		System.out.println("Tabla 1: " + Arrays.toString(tabla1));
		
		int[] tabla2 = {(int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100)};
		
		Arrays.sort(tabla2);
		System.out.println("Tabla 2: " + Arrays.toString(tabla2));
		
		int[] combi = new int[tabla1.length + tabla2.length];
		
		System.arraycopy(tabla1, 0, combi, 0, tabla1.length);
		System.arraycopy(tabla2, 0, combi, tabla1.length, tabla1.length);
		
		Arrays.sort(combi);
		System.out.println("Tabla unida: " + Arrays.toString(combi));
		
		
	}

}
