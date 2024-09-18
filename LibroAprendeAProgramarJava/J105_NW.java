/* pág 186
 * Diseña un programa que elimine los comentarios
 */
package Ejercicios;
import java.util.*;
public class J105_NW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		
		int start = entrada.indexOf("/*");
		int end = entrada.indexOf("*/");
		
		if(start != -1 && end != -1 && start < end) {
			
			entrada = entrada.substring(0, start) + entrada.substring(end + 2);
			System.out.println(entrada);
			
		}else {
			
			System.out.println("No hay comentarios");
			
		}
	}

}
