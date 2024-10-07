/* pág 238
 * diseña la clase Calendario (año, mes y dia)
 * métodos:
 * Calendario(año, mes y dia) siempre que la fecha sea correcta
 * void incrementarDia(int cantidad): incrementa dias
 * void incrementarMes
 * void incrementarAño
 * void mostrar();
 * boolean iguales(Calendario otraFecha);
 */
package Ejercicios;

import java.util.Date;
import java.util.GregorianCalendar;

public class J119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J119_Calendario c1 = new J119_Calendario(2024, 10, 01);
		
		c1.incremDias(3);
		c1.incremMes(1);
		c1.incremAño(1);
		
		c1.mostrar();
		
		GregorianCalendar fecha = new GregorianCalendar(2025, 11, 04);
		
		c1.iguales(fecha);
		
	}

}
