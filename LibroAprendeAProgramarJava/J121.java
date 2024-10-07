/* pág 252
 * clase Hora
 * métodos: Hora(hora, minuto)
 * inc(): incrementa la hora en un minuto
 * setMinutos(valor): asigna un valor a minutos
 * setHora(valor): asigna un valor a hora
 * toString(): representación del reloj
 */

package Ejercicios;

public class J121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J121_Hora h = new J121_Hora(23,59);
		
		h.inc();
		
		h.toString();
		
		h.setHora(22);
		h.setMinutos(33);
		h.inc();
		
		h.toString();
		
	}

}
