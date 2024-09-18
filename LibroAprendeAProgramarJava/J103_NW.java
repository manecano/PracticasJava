/* pág 184
 * Crea un programa que pida una frase/palabra
 * Muestra un anagrama y pide al J2 que adivine
 */

package Ejercicios;
import java.util.*; import javax.swing.*;
public class J103_NW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra = JOptionPane.showInputDialog("Introduce una palabra, J1");
		
		String anagrama = "";
		
		char letraAnagrama;
		
		int random = (int)(Math.random()*100);
		
		for(int i=0;i<palabra.length();i++) {
			
			random = (int)(Math.random()*100);
			
			while(random>palabra.length()) {
				
				random = (int)(Math.random()*100);
				
			}
			
			letraAnagrama = palabra.charAt(random);
			
			anagrama = anagrama + letraAnagrama;
			
			palabra = palabra.substring(0, random) + palabra.substring(random + 1);
			
		}
		
			System.out.println(anagrama);
		
	}

}
