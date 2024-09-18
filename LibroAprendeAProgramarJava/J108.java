/* pág 214
 * Modificar la clase CuentaCorriente:
 * saldo y limite no sean visibles para otras clases
 * nombre sea publico para cualquier clase
 * dni solo sea visible para clases vecinas
 */
package Ejercicios;

public class J108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuentecitaCorriente c;
		c = new cuentecitaCorriente("Manuel Cano Martínez", "49569811G");
		
		c.limite = -100;
		
		c.ingresarDinero(250);
		
		c.sacarDinero(360);
		
		c.infoCuenta();
		
		
	}
}	

	public class cuentecitaCorriente {
	
		String nombre;
		public String dni;
		private int saldo;
		private int limite;
		
		cuentecitaCorriente(String nombre, String dni){
			
			this.nombre = nombre;
			this.dni = dni;
			saldo = 0;
			limite = -50;
			
	}
		
		boolean sacarDinero(int dinero) {
			
			boolean factible;
			
			if(saldo-dinero >= limite) {
				
				saldo = saldo - dinero;
				
				System.out.println("Operación realizada con éxito");
				
				factible = true;
				
			}else {
				
				saldo = saldo;
				
				System.out.println("No ha sido posible completar la operación");
				
				factible = false;
				
			}
			
			return factible;
			
		}
		
		void ingresarDinero(int dinero) {
			
			saldo += dinero;
			
		}
		
		void infoCuenta(){
			
			System.out.println("Titular: " + nombre);
			System.out.println("DNI: " + dni);
			System.out.println("Saldo: " + saldo);
			
		}
		
	}