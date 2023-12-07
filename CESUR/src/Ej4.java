/*Escribe un programa en Java que pida al usuario 3 números y un orden de ordenamiento, que puede ser ascendente o descendente, 
 * a continuación, según el orden indicado se mostrarán en pantalla dichos números. 
 * Ej.: si los números introducidos son 4,7,2 y se escoge orden ascendente (de menor a mayor) aparecen en pantalla en este orden 2,4,7, 
 * si el ordenamiento es descendente (de mayor a menor) se mostrarán en el siguiente 7, 4, 2. Utiliza estructuras de control adecuadas.  
 */
import java.util.*;
public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce 3 números");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		while (num1==num2) {
			System.out.println("No puede emplear el mismo número más de una vez. Introduzca de nuevo:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		}
		
		while (num1==num3) {
			System.out.println("No puede emplear el mismo número más de una vez. Introduzca de nuevo:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		} 
		
		while (num2==num1) {
			System.out.println("No puede emplear el mismo número más de una vez. Introduzca de nuevo:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		}
		
		while (num2==num3) {
			System.out.println("No puede emplear el mismo número más de una vez. Introduzca de nuevo:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		} 
		
		while (num3==num1) {
			System.out.println("No puede emplear el mismo número más de una vez. Introduzca de nuevo:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		} 
		
		while (num3==num2) {
			System.out.println("No puede emplear el mismo número más de una vez. Introduzca de nuevo:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		} 
		
		System.out.println("¿Cómo los quieres ordenar? Pulse 1 en caso ascendente. Pulse 2 en caso descendente.");
		int orden=sc.nextInt();
		
		while (orden<1) {
			System.out.println("El número no es correcto.");
			System.out.println("¿Cómo los quieres ordenar? Pulse 1 en caso ascendente. Pulse 2 en caso descendente.");
			orden=sc.nextInt();
		}
			
		while (orden>2) {
			System.out.println("El número no es correcto.");
			System.out.println("¿Cómo los quieres ordenar? Pulse 1 en caso ascendente. Pulse 2 en caso descendente.");
			orden=sc.nextInt();
		}
		
		if (orden==2) {
			if (num1>num2 && num2>num3) {
				System.out.println("In that order: " + num1 + " " + num2 + " " + num3);
			}
			else if (num1>num3 && num3>num2) {
				System.out.println("In that order: " + num1 + " " + num3 + " " + num2);
			}
			else if (num2>num1 && num1>num3) {
				System.out.println("In that order: " + num2 + " " + num1 + " " + num3);
			}
			else if (num2>num3 && num3>num1) {
				System.out.println("In that order: " + num2 + " " + num3 + " " + num1);
			}
			else if (num3>num1 && num1>num2) {
				System.out.println("In that order: " + num3 + " " + num1 + " " + num2);
			}
			else if (num3>num2 && num2>num1) {
				System.out.println("In that order: " + num3 + " " + num2 + " " + num1);
			}
					
		}
		
		if (orden==1) {
			if (num1>num2 && num2>num3) {
				System.out.println("In that order: " + num3 + " " + num2 + " " + num1);
			}
			else if (num1>num3 && num3>num2) {
				System.out.println("In that order: " + num2 + " " + num3 + " " + num1);
			}
			else if (num2>num1 && num1>num3) {
				System.out.println("In that order: " + num3 + " " + num1 + " " + num2);
			}
			else if (num2>num3 && num3>num1) {
				System.out.println("In that order: " + num1 + " " + num3 + " " + num2);
			}
			else if (num3>num1 && num1>num2) {
				System.out.println("In that order: " + num2 + " " + num1 + " " + num3);
			}
			else if (num3>num2 && num2>num1) {
				System.out.println("In that order: " + num1 + " " + num2 + " " + num3);
			}
					
		}
	}

}
