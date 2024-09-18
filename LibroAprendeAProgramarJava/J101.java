/* pág 182
 * construir un programa que solicite dos palabras 
 * y diga si son anagramas unas de otras
 */
package Ejercicios;
import java.util.*;

public class J101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dos palabras");
		
		String p1 = sc.nextLine();
		String p2 = sc.nextLine();
		
		esAnagrama(p1,p2);
		
		
	}
	
	static void esAnagrama(String p1, String p2) {
		
		int contador = 0;
		char sil1;
		char sil2;
		
			
			for (int i=0;i<p1.length();i++) {
			
			sil1 = p1.charAt(i);
			
			for(int j=0;j<p2.length();j++) {
				
				sil2 = p2.charAt(j);
				
				if(sil1 == sil2) {
					
					contador++;
					p2 = p2.substring(0, j) + p2.substring(j+1);
					
				}
				
			}
				
		}
		
		if(contador == p1.length()) {
			
			char cora = '\u2665';
			System.out.println("ES UN ANAGRAMAAAAA " + cora);
			
		}else {
			
			System.out.println("No es anagrama :(");
		
		}
		
	}

}
