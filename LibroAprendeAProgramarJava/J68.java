/* pag 113
 * crea una función que elabore la serie fibonacci
 */

package Ejercicios;
import java.util.*;

public class J68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("¿De que número quieres el fibonacci?");
		int num=sc.nextInt();
		fibonacci(num);
		
		
	}

	static void fibonacci(int num) {
		
		int fibo1=num-1;
		int fibo2=num-2;
		int resultado=fibo1+fibo2;
		
		if(num==0 || num==1) {
			resultado=1;
		}
		
		System.out.println("Ahí lo lleva: " + resultado);
		
	}
}
