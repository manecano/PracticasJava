/* pág 138
 * programa que solicite 5 numeros decimales
 * a continuacion, mostrar los 5 numeros en el mismo orden
 */
package Ejercicios;
import java.util.*;

public class J74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce cinco números decimales a continuación:");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		double num3=sc.nextDouble();
		double num4=sc.nextDouble();
		double num5=sc.nextDouble();
		
		double[] lista=new double[5]; 
		
		lista[0]=num1;
		lista[1]=num2;
		lista[2]=num3;
		lista[3]=num4;
		lista[4]=num5;
		
/*		for(double numeros:lista) {
			System.out.println(numeros);
		}									*/
		
		for(int i=0;i<5;i++) {
			System.out.println(lista[i]);
		}
	}

}
