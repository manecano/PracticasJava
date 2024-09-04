/* pág 179
 * Comprueba si una cadena dada es palíndroma (se lee igual de atrás a adelante)
 */
package Ejercicios;
import java.util.Scanner;

public class J97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadena");
		
		String cadena = sc.nextLine();
		
		String cadenaAlreves = cadenaAlReves(cadena);
		
		System.out.println(cadenaAlreves);
		
		String frase1 = eliminaEspacios(cadena);
		frase1 = frase1.toLowerCase();
		String frase2 = eliminaEspacios(cadenaAlreves);
		frase2 = frase2.toLowerCase();
		
		int contador = 0;
		
		for(int i=0;i<frase1.length();i++) {
			
			if(frase1.charAt(i)==frase2.charAt(i)) {
				
				contador++;
				
			}
			
		}
		
		if(contador==frase1.length()) {
			
			System.out.println("Es palíndroma " + '\u2661');
			
		}else {
			
			System.out.println("No es palíndroma :(");
			
		}
		
	}
	
	static String cadenaAlReves(String c) {
		
		int longitud = c.length() - 1;
		
		String palabra = "";
		
		for(int i=longitud;i>-1;i--) {
			
			palabra = palabra + c.charAt(i);
		}
		
		return palabra;
	}
	
	static String eliminaEspacios(String c) {
		
		String frase = "";
		
		for(int i=0;i<c.length();i++) {
			
			char caracter = c.charAt(i);
			
			if(caracter != ' ') {
				
				frase = frase + caracter;
				
			}
			
		}
		
		return frase;
		
	}

}