/* pág 178
 * diseñar función a la que se le pase una cadena de caracteres 
 * y la devuelva invertida
 */
package Ejercicios;
import java.util.*;

public class J95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		
		String cadena = sc.nextLine();
		
		System.out.println(cadenaAlReves(cadena));
		
	}
	
	static String cadenaAlReves(String c) {
		
		int longitud = c.length() - 1;
		
		String palabra = "";
		
		for(int i=longitud;i>-1;i--) {
			
			palabra = palabra + c.charAt(i);
		}
		
		return palabra;
	}

}