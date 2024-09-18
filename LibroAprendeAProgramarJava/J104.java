/* pág 186
 * Juego del ahorcado
 */
package Ejercicios;
import javax.swing.*; import java.util.*;

public class J104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra = JOptionPane.showInputDialog("Introduce la palabra");
		
		Scanner sc = new Scanner(System.in);
		
		String respuesta;
		
		char [] ahorcado = new char[palabra.length()];
		
		String copia = palabra;
		
		int contador = 0;
	
		for (int i=0;i<ahorcado.length;i++) {
			
			ahorcado[i] = '_';
			
		}
		
		
		System.out.println(Arrays.toString(ahorcado));
		
		while (contador < 7) {
			
			System.out.println("Turno " + (contador + 1) + ":");
			
			respuesta = sc.nextLine();
			
			for (int i=0;i<respuesta.length();i++) {
				
				for(int j=0;j<copia.length();j++) {
					
					if(respuesta.charAt(i) == copia.charAt(j)) {
						
						ahorcado[j] = copia.charAt(j); 
						//copia = copia.substring(0, j) + copia.substring(j + 1);
						
					}
					
				}
				
				System.out.println(Arrays.toString(ahorcado));
				
			}
			
			if(respuesta.equals(palabra) == false) {
				
				contador++;
				
			}else {
				
				System.out.println("CORRECTO !!!");
				break;
				
			}
			
			
		}
		
		if(contador == 7) {
			
			System.out.println("GAME OVER");
			
		}
		
	}

}
