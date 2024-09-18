/* pág 221
 * crear clase Bombilla con variable privada que indique si una bombilla está encendida o apagada
 * crear método que nos diga el estado de una bombilla concreta
 * poner interruptor general (si salta el automático, todas las bombillas se apagan) para devolver las bombillas al estado en el que se encontraban
 * cada bombilla se enciende y apaga individualmente. Solo responde que está encendida si su interruptor está activado y hay luz general
 */

package Ejercicios;

public class J112_Repasar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombilla b1;
		
		b1 = new Bombilla(false);
		b1.estadoBombilla();
		b1 = new Bombilla(true);
		b1.estadoBombilla();
		
		b1.seFueLaLuz(true);
		b1.estadoBombilla();
		b1.seFueLaLuz(false);
		b1.estadoBombilla();
		
		
	}

}

class Bombilla{
	
	Bombilla(boolean onOff){
		
		this.onOff = onOff;
		
	}
	
private boolean onOff;
boolean seguridad = onOff;


	public String estadoBombilla() {
		
		String estado = "";
		
		if(onOff == true) {
			
			estado = "La bombilla está encendida";
		
			
		}else if (onOff == false){
			
			estado = "La bombilla está apagada";
			
		}
		
		System.out.println(estado);
		return estado;
		
	}
	
	 void seFueLaLuz(boolean corto) {
		
		if(corto == true) {
			
			onOff = false;
			
		}else if (corto == false){
			
			onOff = seguridad;
			
		}
		
	}
	
	
}
