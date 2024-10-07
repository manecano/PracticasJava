/* pág 229
 * Implementa la clase PilaTabla
 * Introduce números con el método apilar
 * elimina el último apilado con el método desapilar
 */

package Ejercicios;
import java.util.*;

public class J115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] array = {};
		
		J115_PilaTabla p = new J115_PilaTabla();
		
		p.apilar(9);
		p.apilar(55);
		p.apilar(93);
		p.apilar(2);
		p.apilar(1);
		p.apilar(77);
		p.apilar(5);
		p.apilar(2);
		
		p.mostrarLista();
		
		p.desapilar();
		
		p.mostrarLista();
		
		
		
		
		
	}

}
