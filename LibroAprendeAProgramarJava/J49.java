/* pag90
 * pedir un numero y dibujar un triangulo rectangulo
 */ 
import java.util.*;
public class J49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número para construir un triángulo");
		int num=sc.nextInt();
		
		
		for(int i=num;i>0;i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
