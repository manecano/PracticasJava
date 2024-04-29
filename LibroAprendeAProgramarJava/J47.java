/*pag89
 *pedir 5 calificaciones y decir si hay algun suspenso 
 */
import javax.swing.*;
public class J46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota=0;
		int contador=0;
		while(contador<6) {
			nota=Double.parseDouble(JOptionPane.showInputDialog("Introduce nota"));
			if(nota<5) {
				System.out.println("El alumno Pepito López, que ha sacado un " + nota + " está suspenso.");
			}
			contador++;
		}
	}

}
