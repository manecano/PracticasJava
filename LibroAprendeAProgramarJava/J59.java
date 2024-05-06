/* pag 106
 * diseñar funcion que reciba dos numeros enteros y muestre el mayor de los dos
 */
import java.util.*;
public class J59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Dime dos números");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		numMayor(num1,num2);
	}

	static void numMayor(int uno, int dos) {
		
		if(uno==dos) {
			System.out.println("Son iguales, chaval!!!");
		}else if(uno>dos) {
			System.out.println("El mayor es: " + uno);
		}else{
			System.out.println("El mayor es: " + dos);
		}
	}
}
