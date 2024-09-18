/* pág 183
 * 
 */
package Ejercicios;
import java.util.*;

public class J102_NW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		String frase2 = frase;
		int contador = 0;
		
		for(int i=0;i!=frase.length();i++) {
			
			for(int j=0;j<frase2.length();j++) {
				
				if(frase.charAt(i) == frase2.charAt(j))
					
					contador++;
					frase2 = frase2.substring(0,j) + frase2.substring(j+1);
					
			}
			
			if(frase.charAt(i) != ' ') {
				
				System.out.println(frase.charAt(i) + ": " + contador +" veces");
				
			}
			
			
			i = 0;
			contador = 0;
			frase2 = frase;
		}
		
		
	}
	
	

}
