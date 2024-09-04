/* pág 179
 * programa que solicite una frase y una palabra
 * buscará cuantas veces aparece la frase en la palabra
 */
package Ejercicios;
import java.util.*;

public class J96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String cadena = sc.nextLine();
		
		System.out.println("\n" + "A continuación, introduce una palabra");
		String palabra = sc.nextLine();
		
		int duplicado = cadena.indexOf(palabra);
		
		int contador = 0;
		
		while(duplicado != -1) {
				
				contador++;
				duplicado = cadena.indexOf(palabra, duplicado + 1);
		}
		
		System.out.println("La palabra aparece " + contador + " veces");
	}
}