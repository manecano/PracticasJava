/* pag 112
 * crea una calculadora 
 */
package java_mac;
import javax.swing.*;
import java.util.Scanner;

public class J66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));
		
		System.out.println("¿Qué operación desea realizar entre ellos?" + "\n" + "1: suma" + "\n" + "2: resta" + "\n" + "3: multiplicación" + "\n" + "4: división");
		Scanner sc = new Scanner(System.in);
		int calculo=sc.nextInt();
		calculadora(calculo, num1, num2);
	}

	static void calculadora(int calculo, int num1, int num2) {
		
		int resultado=0;
		
		
		switch (calculo) {
		
		case 1:
			resultado=num1+num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado); 
			break;
		
		case 2:
			resultado=num1-num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado); 
			break;
		
		case 3:
			resultado=num1*num2;
			System.out.println(num1 + " * " + num2 + " = " + resultado); 
			break;
		
		case 4:
			resultado=num1/num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado); 
			break;
		
		default:
			System.out.println("No válido");
		}
	}
}
