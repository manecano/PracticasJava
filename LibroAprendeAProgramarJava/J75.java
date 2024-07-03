/* pág
 * programa que solicite al usuario cuantos numeros desea introducir 
 * se introducirá esa cantidad de numeros enteros
 * por ultimo se mostrarán en orden inverso
 */
package Ejercicios;
import java.util.*;
public class J75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuántos números desea introudcir?");
		int num=sc.nextInt();
		System.out.println("Perfecto, introdúzcalos a partir de este mensaje:");
		
		int[] lista=new int[num];
		
		for(int i=0;i<num;i++) {
			lista[i]=sc.nextInt();
		}
		
		System.out.println("\n" + "De una, aquí van ordenados a la inversa:");
		
		for(int i=num-1;i>-1;i--) {
			System.out.println(lista[i]);
		}
	}

}
