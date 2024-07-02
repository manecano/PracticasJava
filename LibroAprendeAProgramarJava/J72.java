/*pág 114
 * función a la que se le pasan días, horas y minutos 
 * calcula los segundos
 */
package Ejercicios;
import java.util.*;

public class J72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("¿Cúantos días, horas y minutos has trabajado este mes?" + "\n" + "Días:");
		int dias=sc.nextInt();
		
		System.out.println("Horas");
		int horas=sc.nextInt();
		
		System.out.println("Minutos");
		int minutos=sc.nextInt();
		
		segundos(dias, horas, minutos);
		
	}

	static void segundos(int days, int hour, int min) {
		
		int dias=86400;
		dias=dias*days;
		
		int horas=3600;
		horas=horas*hour;
		
		int mins=60;
		mins=mins*min;
		
		int result=dias+horas+mins;
		
		System.out.println("\n"+"CÁLCULO:"+"\n"+"Días en segundos: " + dias + "\n"+"Horas en segundos: " + horas + "\n" +"Minutos en segundos: " + mins + "\n" + "\n"+ "TOTAL: " + result + " segundos");
	}
}
