/* pág 149
 * Leer y almacenar una tabla de enteros a partir de la que se construirán dos tablas más: una pares y otras impares
 */
package Ejercicios;
import java.lang.reflect.Array;
import java.util.*;

public class J82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lista = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe 6 números:");
		
		for(int i=0;i<lista.length;i++) {
			
			int num = sc.nextInt();
			lista[i]=num;
			
		}
		
		 ArrayList<Integer> paresList = new ArrayList<>();
	     ArrayList<Integer> imparesList = new ArrayList<>();
		
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i]%2==0) {
				
				paresList.add(lista[i]);
				
			}
			else {
				
				imparesList.add(lista[i]);
			}
		}
		
		int[] pares = paresList.stream().mapToInt(i -> i).toArray();
        int[] impares = imparesList.stream().mapToInt(i -> i).toArray();
		
		System.out.println("Pares:" + "\n" + Arrays.toString(pares));
		System.out.println("\n" + "Impares:" + "\n" + Arrays.toString(impares));
		
	}

	

}
