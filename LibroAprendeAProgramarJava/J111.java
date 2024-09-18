/* pág 219
 * Crea una clase SintonizadorFM
 * permite subir (up) o bajar la frecuencia (down)
 * permite mostrar la frecuencia en el momento (display)
 * EL RANGO DE FRECUENCIA DEBE OSCILAR ENTRE 80 Y 108. SI SE PASA DE PASA DE UNA, INICIA EN LA OTRA.
 * que inicie a 80
 */
package Ejercicios;
import javax.swing.*;

public class J111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sintonizadorFM s;
		s = new sintonizadorFM();
		
		String boton = "";
		
		s.display();
		
		while(!boton.equalsIgnoreCase("x")) {
			
			boton = JOptionPane.showInputDialog("+ subir - bajar x apagar");
			
			s.cambiarFrecuencia(boton);
			s.display();
			
		}
		
	}

}

class sintonizadorFM{
	
	double up = 0.5;
	double down = -0.5;
	double mhz = 80;
	double min = 80;
	double max = 108;
	
	sintonizadorFM(){
		
	}
	
	void cambiarFrecuencia(String change) {
		
		if(change.equalsIgnoreCase("+") || change.equalsIgnoreCase("up")) {
			
			mhz = mhz + up;
			
			if(mhz>max) {
				
				mhz = min;
				
			}
			
		}else if(change.equalsIgnoreCase("-") || change.equalsIgnoreCase("down")) {
			
			mhz = mhz + down;
			
			if(mhz<min) {
				
				mhz = max;
				
			}
			
		}
		
	}
	
	void display() {
		
		System.out.println("Cadena: " + mhz + " Mhz");
		
	}
	
	
}
