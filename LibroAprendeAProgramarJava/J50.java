/* pag91
 * pedir un numero y crear programa que diga cuantos numeros entre 1 y n hay que sean primos
 */
import javax.swing.*;
public class J50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		int esprimo=0;
		
		for(int i=num;i>0;i--) {
			int primo=0;
			for(int j=num;j>0;j--) {
				if(i%j==0) {
					primo++;	
				}	
			}
			if(primo==2) {
					esprimo++;
					System.out.println(i + " es primo");
					}
			
		}
		System.out.println("Hay un total de " + esprimo + " numeros primos");
	}

}
