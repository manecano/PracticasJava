/* pág 217
 * Diseña la clase banco. Interesa guardar su nombre, capital y dirección
 * Siempre tiene que tener un nombre
 * Si no se especifica: capital por defecto de 5.2 millones
 * El capital y la dirección son modificables
 */
package Ejercicios;

public class J110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		banco b;
		b = new banco("Caja Rural", "Calle Jardinillo 8");
		
		b.dimeCapital(30000000);
		b.dimeDireccion("Bahia Sound");
		b.infoBanco();
	}

}

class banco{
	
	final String nombre;
	int capital;
	String direccion;
	
	banco(String nombre, String direccion){
		
	this.nombre = nombre;
	capital = 5200000;
	this.direccion = direccion;
		
		
	}
	
	void dimeCapital(int capi) {
		
		this.capital = capi;
		
	}
	
	void dimeDireccion(String dire) {
		
		this.direccion = dire;
		
	}
	
	void infoBanco(){
		
		System.out.println("Banco: " + nombre);
		System.out.println("Capital: " + capital);
		System.out.println("Dirección: " + direccion);
		
	}	
}
