/* diseña una función que calcule aN, donde a es real y n entero no negativo
 * realizar una version iterativa y otra recursiva*/
package java_mac;

import java.util.Scanner;

public class J65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1=sc.nextInt();
		System.out.println("Introduce el otro número");
		int num2=sc.nextInt();
		funcion(num1,num2);
		
	}
	
	static void funcion(int a, int n) {
	
	double calculo=Math.pow(a, n);
	System.out.println("Resultado: " + calculo);
	
}
	
}



