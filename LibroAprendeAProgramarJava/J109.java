/* pág 215
 * Añadir un atributo que almacene el nombre del banco (único)
 * diseñar método que permita modificar el nombre del banco
 */
package Ejercicios;

public class J109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuentaCorriente c;
		c = new cuentaCorriente("Manuel Cano Martínez", "49569811G");
		
		c.limite = -100;
		
		c.ingresarDinero(250);
		
		c.sacarDinero(360);
		
		c.nombreBanco("Santander");
		
		c.infoCuenta();
		
		
	}
}	




	class cuentaCorriente {
	
		String nombre;
		String dni;
		int saldo;
		int limite;
		String banco;
		
		cuentaCorriente(String nombre, String dni){
			
			this.nombre = nombre;
			this.dni = dni;
			saldo = 0;
			limite = -50;
			banco = "Caja Rural";
			
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
		
		void nombreBanco(String sucursal){
			
			banco = sucursal;
			
		}
		
		void infoCuenta(){
			
			System.out.println("Titular: " + nombre);
			System.out.println("DNI: " + dni);
			System.out.println("Saldo: " + saldo);
			System.out.println("Banco: " + banco);
			
		}
		
	}
