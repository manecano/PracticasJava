/* pag 113
 * calcular factorial de un número
 */
package java_mac;

import java.util.*;
public class J67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		factorial(num);
		
	}

	static void factorial(int num) {
		
		int fact=num;
		
		for(int i=num-1;i>1;) {
			
			
			
			fact=fact*i;
			
			i--;
			
			
		}
		
		System.out.println("El factorial de " + num + " es: " + fact ); 
	}
}