/* pág 239
 * Clase Punto con componente x y componente y
 * Métodos: punto(double x, double y)
 * void desplaza (double dx): desplaza la componente x la cantidad dx
 * double distanciaEuclidea(Punto otro): calcula y devuelve la distancia euclidea entre el punto invocante y el punto otro
 * void muestra()
 */

package Ejercicios;

public class J120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		J120_Punto p = new J120_Punto(3.5, 8.3);
		J120_Punto p2 = new J120_Punto(5.5, 12.3);
		
		p.desplaza(3.5);
		p.distanciaEuclidea(p2);
		
		p.mostrar();
		
	}

}
