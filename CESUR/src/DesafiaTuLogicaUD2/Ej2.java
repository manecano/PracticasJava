//Escribe un programa en Java que pida un número por teclado hasta que éste sea positivo. A continuación, muestra los primeros 20 números sucesivos a dicho número.
import java.util.*;
public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba un número");
		int num=sc.nextInt();
		
		while(num<0) {
			System.out.println("Introduce un número positivo");
			num=sc.nextInt();
		}
		
		int result=num+21;
		
		while(num!=result) {
		num++;
			System.out.println(num);
		}
		
		
	}

}
