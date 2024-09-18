/* pág 225
 * Escribir un programa que lea una hora cualquiera y un número (n)
 * El programa mostrará la hora introducida y las n siguientes horas sumando un segundo a cada una
 */

package Ejercicios;

public class J113_Hora {
	
	J113_Hora(int hora, int minuto, int seg, int plus){
		
		this.hora = hora;
		this.minuto = minuto;
		this.seg = seg;
		this.plus = plus;
		
	}
	
int hora;
int minuto;
int seg;
int plus;

J113_Hora objeto;

	public void conversor(J113_Hora objeto) {
		
		for(int i = 0;i<plus;i++) {
			
			hora++; seg++;
			
			if(seg>59) {
				
				seg = 0;
				minuto++;
				
			}else if(minuto>59) {
				
				minuto = 0;
				hora++;
				
			}else if(hora>23) {
				
				hora = 00;
				
			}
			
		}
	}
	
	public int imprimir(){
		
		System.out.println("Hora: " + hora);
		System.out.println("Minutos: " + minuto);
		System.out.println("Segundos: " + seg);
		return hora;
		
		
	}	
		
	
	
}