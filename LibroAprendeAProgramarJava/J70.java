/* pág 114
 * crea la funcion numerospares(int x)
 * que muestre por consola los primeros x numeros pares
 */
package Ejercicios;
import java.util.*;

public class J70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int n=sc.nextInt();
		
		numerosPares(n);
		
	}

	static void numerosPares(int n) {
		
		for(int i=1;i!=n;i++) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
