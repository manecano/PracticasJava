/* pág 150 
 * Programa que solicite elementos de una matriz 4x4.
 * La app debe decidir si es una matriz mágica (suma de sus filas es igual Y suma de columnas tb)
 */
import java.util.Arrays;

import javax.swing.*;
public class J83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = new int [4][4];
		int [] sumatorio = new int[4];
		
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<4;j++) {
				
				int element=Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
				matriz[i][j]=element;
				
			}
		}
		
		int suma=0;
		
		for(int i=0;i<4;i++) {
			
			suma=0;
			
			for(int j=0;j<4;j++) {
				
				suma+=matriz[i][j];
				
			}
			
		sumatorio[i]=suma;
			
		}
		
		System.out.println(Arrays.deepToString(matriz));
		
		if(sumatorio[0]==sumatorio[1] && sumatorio[1]==sumatorio[2] && sumatorio[2]==sumatorio[3]) {
			
			System.out.println("MATRIZ PERFECTA:");
			for(int i=0;i<4;i++) {
				System.out.println(sumatorio[i]);
			}
		}
	}

}
