/* pág 176
 * App que pida al usuario que introduzca una frase y diga cuantos espacios en blanco hay
 */
package Ejercicios;
import java.util.*;
public class J93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		
		String frase = sc.nextLine();
		
		char esp = ' ';
		
		int cont = 0;
		
		for(int i=0;i<frase.length();i++) {
			
			if(frase.charAt(i)==esp) {
				
				cont++;
				
			}
			
		}
		
		System.out.println("En la frase hay " + cont + " espacios.");
		
	}

}