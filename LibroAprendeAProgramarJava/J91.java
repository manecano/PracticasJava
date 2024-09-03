/* pág 175
 * Acierta la contraseña
 * Jugador 1 introduce contraseña. Jugador 2 teclea hasta que acierte.
 * Pistas: número de caracteres y primer y último carácter
 */
package Ejercicios;
import javax.swing.*; import java.util.*;
public class J91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contra = JOptionPane.showInputDialog("Introduce la contraseña");
		
		String[] contraseña = new String[contra.length()];
		
		for(int i=0;i<contra.length();i++) {
			
			if(i==0) {
				
				contraseña[i] = String.valueOf(contra.charAt(i));
				
			}else if(i==contra.length()-1) {
				
				contraseña[i] = String.valueOf(contra.charAt(i));
				
			}else {
				
				contraseña[i] = "_";
				
			}
			
		}
		
		System.out.println(Arrays.toString(contraseña));
		
		String respuesta = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(contra.equals(respuesta)==false) {
			
			respuesta = sc.nextLine();
			
		}
		
		System.out.println("ENHORABUENAAAA!!!!! " + "\n" + "La respuesta es: " + contra );
	}
	
}