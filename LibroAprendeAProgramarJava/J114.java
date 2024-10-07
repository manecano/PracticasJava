/* pág 226
 * Crea la clase Lista acogiendo una lista de números. Crea una serie de métodos en la clase
 */

package Ejercicios;

public class J114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J114_Lista array = new J114_Lista();
		
		int[] lista = {4,3,7,44,6,4};
		
		int tamañoInicial = lista.length;
		
		array.añadirLista(lista);
		
		array.buscarNum(6);
		
		array.eliminarElemento(14);
		
		array.buscarNum(6);
		
	}

}
