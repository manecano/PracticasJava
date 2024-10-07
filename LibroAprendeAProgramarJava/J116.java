/* pág 232
 * Crea la clase ColaTabla en la que se introduzcan elementos Integer 
 * se introducen elementos con el método encolar y se eliminan con el método desencolar
 * El elemento que se elimina con el método desencolar es el primer elemento de la tabla
 * Por lo que cuando se introduzcan elementos con encolar, irán al final de la tabla
 */

package Ejercicios;

public class J116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J116_ColaTabla j = new J116_ColaTabla();
		
		j.encolar(9);
		j.encolar(11);
		j.encolar(7);
		
		j.mostrarListaCola();
		
		j.desencolar();
		j.mostrarListaCola();
		
		j.desencolar();
		j.mostrarListaCola();
		j.desencolar();
		j.mostrarListaCola();
		j.desencolar();
		j.mostrarListaCola();
		
		j.encolar(99);
		
		j.mostrarListaCola();
		
	}

}
