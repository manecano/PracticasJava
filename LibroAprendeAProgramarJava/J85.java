/* pág 151
 * Crear una función maximo() que calcule el máximo de una tabla
 */
package Ejercicios;

import java.util.Arrays;

public class J85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] tabla = new int [5][5];
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				tabla[i][j]=(int)(Math.random()*100);
			}
		}
		
		System.out.println(Arrays.deepToString(tabla));
		maxMatriz(tabla);
	}



	public static void maxMatriz(int[][] matriz) {
	
	int max=0;
	int max2=0;
	
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<5;j++) {
				
				max=0;
				
				max=matriz[i][j];
			
				if(max>max2) {
					max2=max;
				}
			}
		}
		
		System.out.println("El max es: " + max2);

	}
}