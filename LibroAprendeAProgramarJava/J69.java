/* pag 114
 * funcion que calcule la superficie y volumen de una esfera
 */
package Ejercicios;
import javax.swing.*;

public class J69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radio=Integer.parseInt(JOptionPane.showInputDialog("Dime el radio, pixita"));
		superficie(radio);
		volumen(radio);
	}

	static void superficie(int radio){
		
		/* 4 pi * radio al cuadrado */
		double sup=(4*Math.PI)*(Math.pow(radio, 2));
		System.out.println("Esto da la superficie, maki: " + sup);
	}
	
	static void volumen(int radio){
		
		/* 4/3 pi * radio al cubo */
		double vol=(4/3*Math.PI)*(Math.pow(radio, 3));
		System.out.println("Esto da el volumen, crack: " + vol);
	}
}
