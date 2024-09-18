/* pág 181
 * 
 */
package Ejercicios;
import java.util.*;

public class J99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char[] c1 = {'e','i','k','m','p','q','r','s','t','u','v'};
		char[] c2 = {'p','v','i','u','m','t','e','r','k','q','s'};
		
		System.out.println("Introduce una palabra");
		String entrada = sc.nextLine();
		
		String frase = "";
		
		for(int i=0;i<entrada.length();i++) {
			
			char letra = entrada.charAt(i);
			
			char cambio = codifica(c1, c2, letra);
			frase = frase + cambio;
			
		}
		
		System.out.println(frase);
		
	}
	
	static char codifica(char conj1[], char conj2[], char c) {
		
		for(int i=0;i<conj1.length;i++) {
			
			if(conj1[i] == c) {
				
				
				c = conj2[i];
				break;
				
			}
			
		}
		
		return c;
		
	}

}
