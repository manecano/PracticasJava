/* pag105
 * funcion a la que se le pasen dos enteros y muestre todos los numeros comprendidos entre ellos
 */
import java.util.*;
public class J57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Di un número");
		int uno=sc.nextInt();
		System.out.println("Di otro número");
		int dos=sc.nextInt();
		rangoEntreNumeros(uno, dos);
	}

	static void rangoEntreNumeros(int a, int b) {
		
		if(a>b) {
			for(int i=b+1;i<a;i++) {
				System.out.println(i);
			}
		}else {
			for(int i=a+1;i<b;i++) {
				System.out.println(i);
		}
		
	}
}
}