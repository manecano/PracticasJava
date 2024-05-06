/* pag107 
 * crea una función que mediante un boleano, indique si el parametro que se le pasa es una vocal o no
 */
import java.util.*;
public class J61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una letra");
		String letra=sc.next();
		identificadorVocales(letra);
	}

	static void identificadorVocales(String letra) {
		
		boolean boleano=true; 
		
		if(letra.equalsIgnoreCase("a")) {
			System.out.println(boleano);
		}
		
		else if(letra.equalsIgnoreCase("e")) {
			System.out.println(boleano);
		}
		
		else if(letra.equalsIgnoreCase("i")) {
			System.out.println(boleano);
		}
		
		else if(letra.equalsIgnoreCase("o")) {
			System.out.println(boleano);
		}
		
		else if(letra.equalsIgnoreCase("u")) {
			System.out.println(boleano);
		}
		
		else{
			boleano=false;
			System.out.println(boleano);
		}
	}
}
