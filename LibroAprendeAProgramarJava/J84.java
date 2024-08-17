/* pág 151
 * Crear una tabla 5x5 y rellenarla de la siguiente forma:
 * la posición [n,m] debe contener n+m
 */
package Ejercicios;
import java.util.*;
public class J84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[][] matriz = new int[5][5];
		
		
		for(int i=0;i<5;i++) {
			
			for (int j=0;j<5;j++) {
				
				matriz[i][j]=i+j;
				
			}
			
			
		}
		
		System.out.println(Arrays.deepToString(matriz));
		
	}

}
