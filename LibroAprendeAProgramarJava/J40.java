/* pag 86 
 * pide los valores max y min de un rango. Solicita un numero. Si este no se encuentra dentro del rango, pidelo hasta que se encuentre dentro
 */
import javax.swing.*;
import java.util.*;
public class J40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo del rango"));
		int min=Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo del rango"));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un valor");
		int num=sc.nextInt();
		
		while(num<min || num>max) {
			System.out.println("Ese número se encuentra fuera del rango");
			System.out.println("Introduce otro valor");
			num=sc.nextInt();
		}
		System.out.println("ENHORABUENA, ESE NÚMERO ESTÁ DENTRO DEL RANGO");
	}

}
