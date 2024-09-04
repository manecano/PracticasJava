/* pág 177
 * Pedir el nombre y apellido
 * Mostrarlo sin vocales
 */

package Ejercicios;
import java.util.*;
public class J94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre y apellidos");
		
		String nom = sc.nextLine();
		
		char c;
		
		String nombre = " ";
		
		for(int i=0;i<nom.length();i++){
			
			c = nom.charAt(i);
			
			if(!esVocal(c)) {
				
				nombre = nombre + c;
				
			}
			
		}
		
		System.out.println(nombre);
		
		
	}
	
	static boolean esVocal(char c) {
		
		boolean result;
		
		String vocales = "aeiouáéíóú";
		
		c = Character.toLowerCase(c);
		
		if(vocales.indexOf(c) == -1) {
			
			result = false;
			
		}else {
			
			result = true;
			
		}
		
		return result;
		
	}

}
