/* pag92
 * programa que pida un numero de 3 cifras y muestre guarismo a guarismo 
 */
import java.util.*;
public class J51_imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero de 3 cifras");
		int num=sc.nextInt();
		
		String cadena=String.valueOf(num);
		
		for(int i=0;i<cadena.length();i++) {
			System.out.println(cadena.charAt(i));
		}
	}

}
