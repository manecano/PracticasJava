/* pag92
 * pide al usuario un numero e implementa por pantalla "eco" tantas veces
 */
import javax.swing.*;
public class J53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=Integer.parseInt(JOptionPane.showInputDialog("Introuce un número"));
		for(int i=0;i<num;i++) {
			System.out.println("eco...");
		}
	}

}
