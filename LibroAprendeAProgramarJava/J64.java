/* pag 110
 * crea una funcion que analice si dos numeros son amigos
 * amigos: la suma de sus divisores propios son iguales
 */
import java.util.*;
public class J64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1=sc.nextInt();
		System.out.println("Introduce otro número");
		int num2=sc.nextInt();
		numerosAmigos(num1, num2);
	}

	static void numerosAmigos(int a, int b) {
		
		int suma1=0;
		int suma2=0;
		
		for(int i=a-1;i>0;i--) {
			
			if(a%i==0) {
				suma1=i+suma1;
			}
		}

		for(int j=b-1;j>0;j--) {
			
			if(b%j==0) {
				suma2=j+suma2;
			}
		}
		
		if(suma1==b && suma2==a) {
			System.out.println("SON AMIGOS !!!! " + "\n" + "Total n1: " + suma1 + "\n" + "Total n2: " + suma2);
		}else {
			System.out.println("No son amigos :( " + "\n" + "Total n1: " + suma1 + "\n" + "Total n2: " + suma2);
		}
	}
}
