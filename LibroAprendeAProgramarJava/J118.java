/* Clase Paso de frontera en la que se introduce nombre y dni de la persona
 * Métodos: 
 * mostrar todas las personas y su info
 * Búsqueda por nombre y se muestra toda la info del mismo
 * búsqueda por dni y se muestra su info
 * Salir
 */
package Ejercicios;

public class J118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J118_PasoFronterizo pf = new J118_PasoFronterizo("Manuel", "49569811G");
		J118_PasoFronterizo pf1 = new J118_PasoFronterizo("Jesus", "49569811J");
		
		pf.mostrarPersonas();
		pf.busquedaDNI("49569811G");
		pf.busquedaNombre("Jesus");
	}

}
