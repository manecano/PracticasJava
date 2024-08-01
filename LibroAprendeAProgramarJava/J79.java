/* pág 142
 * Programa que gestione un campeonato de programación. Se introduce la puntuación de 5 programadores
 * La app muestra las puntuaciones ordenadas. Cuando finalizan se unen COMO MÁXIMO 3 participantes más.
 * Se muestran sus puntos con el resto
 * La forma de especificar que no intervienen más participantes es -1 en puntuación 
 */
package Ejercicios;
import javax.swing.*;
import java.util.*;

public class J79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] campeonato=new int[8];
		
		for(int i=0;i<5;i++) {
			
				int nota=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la puntuación del programador " + (i+1) + "?"));
			
				campeonato[i]=nota;
			
			}	
		Arrays.sort(campeonato, 0, 5);
		System.out.println(Arrays.toString(campeonato));
		
		System.out.println("\n" + "Ahora le toca el turno a los exhibicionistas");
		int notaEx=0;
		int x=5;
		int j=1;
		
		
		while(notaEx!=-1 && x<8) {
			
			notaEx=Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la puntuación del exhibicionista " + j + "?"));
			
			if(notaEx!=-1) {
				campeonato[x]=notaEx;
				x++;
			}
			
			
			j++;
		}
		
		Arrays.sort(campeonato);
		System.out.println(Arrays.toString(campeonato));
		
			
		
	}
}