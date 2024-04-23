/* pag87
 * pide un numero y calcula su factorial
 */
import java.util.*;
public class J43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num=sc.nextInt();
		int producto=1;
		
		for(int i=num;i>0;i--) {
			producto=i*producto;
		}
		System.out.println(producto);
	}

}
