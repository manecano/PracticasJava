/* pág 175
 * Acierta la contraseña
 * Jugador 1 introduce contraseña. Jugador 2 teclea hasta que acierte.
 * Pistas: indica si la palabra es mayor o menor
 */

package Ejercicios;
import javax.swing.*; import java.util.*;

public class J91_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contra = JOptionPane.showInputDialog("Introduce la contraseña");
		
		Scanner sc = new Scanner(System.in);
		
		String respuesta = "";
		
		System.out.println("Introduce la contraseña");
		
		while(contra.equals(respuesta)==false) {
			
			respuesta = sc.nextLine();
			
			if(contra.length()>respuesta.length()) {
				
				System.out.println("La contraseña es más larga");
				
			}else if(contra.length()<respuesta.length()) {
				
				System.out.println("La contraseña es más corta");
				
			}else if(contra.equals(respuesta)) {
				
				break;
				
			}else {
				
				System.out.println("La contraseña tiene el mismo número de caracteres, prueba de nuevo");
				
			}
			
		}
		
		System.out.println("ENHORABUENAAAA!!!!! " + "\n" + "La respuesta es: " + contra );
	}
	
}
