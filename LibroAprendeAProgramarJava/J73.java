/*pag 114
 * funcion a la que se le pasan dos grupos de horas y minutos 
 * devuelve la diferencia de minutos entre los dos grupos
 */
package Ejercicios;
import java.util.*;
public class J73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hora grupo 1");
		int hora1=sc.nextInt();
		
		System.out.println("Minutos grupo 1");
		int min1=sc.nextInt();
		
		System.out.println("Hora grupo 2");
		int hora2=sc.nextInt();
		
		System.out.println("Minutos grupo 2");
		int min2=sc.nextInt();
		
		diferenciaMin(hora1,min1,hora2,min2);
		
	}

	static int diferenciaMin(int h1, int m1, int h2, int m2) {
		
		int grupo1=h1*60;
		grupo1=grupo1+m1;
		
		int grupo2=h2*60;
		grupo2=grupo2+m2;
		
		int diferencia=0;
		
		if(grupo1>grupo2) {
			diferencia=grupo1-grupo2;
			System.out.println("La diferencia entre ambos es de: " + diferencia + " minutos");
			return diferencia;
			
		}else {
			diferencia=grupo2-grupo1;
			System.out.println("La diferencia entre ambos es de: " + diferencia + " minutos");
			return diferencia;
		}
	}
}
