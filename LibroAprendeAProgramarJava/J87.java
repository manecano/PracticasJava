/* pág 152
 * Función rellenaPares() a la que se pasa una tabla como parámetro.
 * La función va a devolver una tabla con los pares de la anterior y el número de impares desechados
 */
package Ejercicios;
import java.util.*;

public class J87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] tabla = new int[8];
		
		for(int i=0;i<tabla.length;i++) {
			
			int numero = (int)(Math.random()*10);
			tabla[i]=numero;
			
		}
		
		System.out.println(Arrays.toString(tabla));
		rellenaPares(tabla);
		
	}
	
static void rellenaPares(int[] array) {
	
	ArrayList<Integer> lista = new ArrayList<>();
	int contadorImpares = 0;
	
	for(int i=0;i<array.length;i++) {
		
		if(array[i]%2==0) {
			
			lista.add(array[i]);
			
		}else {
			
			contadorImpares++;
			
		}
		
	}
	
	int i=lista.size();
	Integer[] pares = lista.toArray(new Integer[i]);
	
	System.out.println("\n" + "Pares:" + "\n" + Arrays.toString(pares));
	System.out.println("\n" + "Impares desechados: " + contadorImpares);
}

}
