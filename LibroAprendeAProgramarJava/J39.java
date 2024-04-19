/* pag85
 * introduce un numero y que en consola se muestre hasta el mismo 
 */
import java.util.*;
public class J39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numerito");
		int num=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println(i);
		}
		
	}

}
