/* pag90
 * dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados(4) y suspensos
 */
import javax.swing.*;
public class J48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int contador=0;
		int aprobado=0;
		int cond=0;
		int susp=0;
		
		while(contador<6) {
			int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota"));
			
			if(nota>5) {aprobado++;}
			else if(nota==4) {cond++;}
			else {susp++;}
			
			contador++;
		}
		System.out.println("Hay " + aprobado + " aprobados" + "\n" + "Hay " + cond + " condicionados" + "\n" + "Hay " + susp + " suspensos");
	}

}
