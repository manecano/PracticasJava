/* pag92
 * pedimos un numero y mostramos su raiz cuadrada
 * si no es exacta, el resto del anterior numero
 */
import java.util.*;
public class J54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero y muestro su raiz cuadrada");
		int num=sc.nextInt();
		int result=1;
		
		for(int i=1;result<num;) {
			
			System.out.println(i + "²" + "=" + result); 
			i++;
			result=i*i;
			if(result==num) {
			System.out.println("La raiz cuadrada es: " + i);
			}else if(result>num) {
			i=i-1;
			int nuevo_result=i*i;
			int resto=num-nuevo_result;
			
			System.out.println("√"+num+"="+i+" con resto de "+resto);
			}
			
		}
			
		
	}

}
