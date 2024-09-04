/* pág 180
 * 
 */
package Ejercicios;
import java.util.*;

public class J98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prefijo = "Javalín, javalón";
		String sufijo = "javalén, len, len";
		
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		
		if(entrada.startsWith(prefijo) && entrada.endsWith(sufijo)) {
			
			System.out.println("Es un puto jovenlandés");
			entrada = entrada.substring(prefijo.length());
			entrada = entrada.substring(0, entrada.length() - sufijo.length());
			
		}
		
		System.out.println("Te lo traduzco: " + entrada);
	}

}
