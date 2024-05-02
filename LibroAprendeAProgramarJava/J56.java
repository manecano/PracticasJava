/* pag105 
 * diseña función eco() y pasale un parametro n para que muestre el mensaje n veces
 */
import java.util.*;
public class J56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número");
		int n=sc.nextInt();
		eco(n);
		
		
	}

		
		static void eco(int t) {
			
			for(int i=0;i<t;i++) {
				System.out.println("Eco...");
			}
			
		}
}
