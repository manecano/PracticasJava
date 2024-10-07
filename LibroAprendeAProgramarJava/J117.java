/* pág 235
 * Crea la clase Conjunto (en los conjuntos no puede haber elementos repetidos)
 * Con los siguientes métodos: 2 constructores: 1 por defecto que cree la tabla con capacidad 10 num | otro que se le pasa como argumento el tamaño inicial de la tabla
 * obtener el numero de elementos insertados en el conjunto
 * insertar numero en el conjunto (si ya estaba, no se inserta)
 * añadir al conjunto los elementos de otro que se pasa como parametro
 * eliminar un elemento que se pasa como parámetro. Si no estaba, no se hace nada
 * eliminar del conjunto los elementos de otro que se pasa como parámetro
 * decir si un elemento que se pasa como parámetro pertenece o no al conjunto
 * representar el conjunto con una cadena de caracteres 
 */

package Ejercicios;

public class J117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J117_Conjunto c = new J117_Conjunto(0);
		
		c.insertarNum(9);
		
		int[] array = {2,3,9,69};
		
		c.añadirConjunto(array);
		
		c.eliminarElemento(2);
		
		c.mostrarLista();
		
		c.pertenece(1);
		
		c.obtenerNumElementos();
		
		
	}

}
