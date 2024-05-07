/* pag 108
 * pasa un numero y di el numero de divisores primos que tiene
 */

import java.util.Scanner;

public class J63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		
		for(int i=num;i!=0;i--) {
			if(num%i==0) {
				esPrimo(i);
			}
		}			
	}

	static void esPrimo(int num) {
		
		int contadorPrimos=0;
		
		for(int i=num;i!=0;i--) {
			if(num%i==0) {
				contadorPrimos++;
			}
		}
		
		if(contadorPrimos==2) {
			System.out.println(num + " es primo");
		}
	}
}
