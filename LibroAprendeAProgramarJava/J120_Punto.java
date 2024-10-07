package Ejercicios;

public class J120_Punto {

	J120_Punto(double x, double y){
		
		this.x = x;
		this.y = y;
		
	}
	
double x;
double y;
double desplazado;
double c;

	public void desplaza(double dx) {
		
		this.x = x + dx;
		desplazado = this.x;
		
	}
	
	public double distanciaEuclidea(J120_Punto otro) {
		
		double a = Math.pow(otro.x, 2) - Math.pow(x, 1);
		double b = Math.pow(otro.y, 2) - Math.pow(y, 1);
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
		
	}
	
	public void mostrar() {
		
		System.out.println("x desplazada = " + desplazado);
		System.out.println("distancia euclídea = " + c);
		
	}
	
}
