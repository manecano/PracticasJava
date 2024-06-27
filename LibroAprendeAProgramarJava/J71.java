/* pág 114
 * implementa la función static double distancia(double x1, double y1, double x2, double y2
 * raíz (x1-x2)2 + (y1-y2)2
 */
package Ejercicios;
import javax.swing.*;

public class J71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1=Double.parseDouble(JOptionPane.showInputDialog("Introduce x1"));
		double x2=Double.parseDouble(JOptionPane.showInputDialog("Introduce x2"));
		double y1=Double.parseDouble(JOptionPane.showInputDialog("Introduce y1"));
		double y2=Double.parseDouble(JOptionPane.showInputDialog("Introduce y2"));
		
		distancia(x1, y1, x2, y2);
		
		
	}

	static double distancia(double x1, double y1, double x2, double y2) {
		
		System.out.println("√(x1-x2)²+(y1-y2)²");
		
		double par1=x1-x2;
		double par2=y1-y2;
		
		System.out.println("√(" + par1 + ")²+(" + par2 + ")²");
		
		double cua1=Math.pow(par1, 2);
		double cua2=Math.pow(par2, 2);
		
		System.out.println("√" + cua1 + " + " + cua2);
		
		double parent=cua1+cua2;
		
		System.out.println("√" + parent);
		
		double resultado=Math.sqrt(parent);
		
		System.out.println(resultado);
		return resultado;
		
	}
}
