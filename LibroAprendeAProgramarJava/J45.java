/* pag88
 * app que pida introducir un numero del 1 al 10
 * muestra la tabla de multiplicar de dicho numero
 */
import java.util.*;
public class J44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 10");
		int num=sc.nextInt();
		
		while(num>10||num<1) {
			System.out.println("Introduce un número en el rango seleccionado");
			num=sc.nextInt();
		}
		
		for(int i=0;i<11;i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
	}

}
