/* pág 174
 * Introduce por teclado dos palabras e indica cual es mas corta
 */
package Ejercicios;
import java.util.*;

public class J90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String palabra1 = sc.nextLine();
		String palabra2 = sc.nextLine();
		
		if(palabra1.length()>palabra2.length()) {
			
			System.out.println(palabra2 + " es mas corta");
			
		}else {
			
			System.out.println(palabra1 + " es mas corta");
			
		}
				
		
	}

}
