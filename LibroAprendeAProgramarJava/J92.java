/* pág 176
 * Introducir una frase palabra por palabra
 * La frase se termina introduciendo la palabra "fin"
 * Mostrar la frase al final
 */

package Ejercicios;
import java.util.*;
public class J92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase = "";
		
		String palabra = "";
		
		String fin = "fin";
		
		while(palabra.equals(fin)==false) {
			
			
			palabra = sc.nextLine();
			
			if(palabra.equals(fin)) {
				
				break;
				
			}
			
			frase = frase + " " + palabra;
			
		}
		
		System.out.println(frase);
		
	}

}
