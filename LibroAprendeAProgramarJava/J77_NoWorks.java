/* pág 140
 * programa que inicie con una tabla con nuestros numeros favoritos
 * pedir al usuario un elemento del índice que será eliminado
 * continuar hasta que el indice introducido sea negativo o no haya más elementos que borrar
 */
import java.util.*;
public class J77_NoWorks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] listaFav={14, 4, 8};
		int tamaño=listaFav.length;
		
		System.out.println("¿Qué posición de la lista desea eliminar?");
		Scanner sc=new Scanner(System.in);
		int psc=sc.nextInt();
		
		while(psc>-1 && psc<tamaño) {
			
			tamaño--;
			
			System.out.println("Así quedaría la lista:");
			
			for(int i=listaFav[tamaño];i!=0;i--) {
				
				System.out.println(listaFav[tamaño]);
			}
			
			System.out.println("¿Qué posición de la lista desea eliminar?");
			
			psc=sc.nextInt();
			
		}System.out.println("Ese elemento no existe/No hay más elementos en la lista");
		
	}
	
		
	}
