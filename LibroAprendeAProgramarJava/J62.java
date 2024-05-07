/* pag108
 * diseña una funcion que nos diga si un numero es primo
 */
import java.util.*;
public class J62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		esPrimo(num);
		
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
		}else {
			System.out.println(num + " no es primo. Es divisible por " + contadorPrimos + " números");
		}
	}
}
