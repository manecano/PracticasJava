/* pág 186
 * diseña una agenda
 */
package Ejercicios;
import java.util.*;
public class J106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String[][] agenda = new String[20][2];
		
		int respuesta = sc.nextInt();
		
		int contador = 0;
		
		int trampita = 0;
		
		String nombre; String tlf;
		
		while(respuesta == 1 || respuesta == 2) {
		
		switch(respuesta) {
		
		case 1:
				
				System.out.println("Nombre y tlf:");
				nombre = sc.nextLine(); tlf = sc.nextLine();
				agenda[contador][trampita] = nombre; 
				agenda[contador][trampita + 1] = tlf;
			
			contador++;
			trampita = 0;
			
			if(contador == 20) {
				
				break;
				
			}
		
		case 2:
			
			System.out.println("¿De quién quieres saber el tlf?");
			nombre = sc.nextLine();
			
			for(int i=0;i<agenda.length;i++) {
				
				for(int j=0;j<2;j++) {
					
					if(nombre.equals(agenda[i][j])) {
						
						System.out.println(agenda[i][j+1]);
						
					}else {
						
						System.out.println("Ese nombre no está en la agenda");
						
					}
					
				}
				
			}
		}
		
	}
	}
}
