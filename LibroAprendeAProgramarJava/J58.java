/* pag106 
 * crea una funcion que calcule el area(1) o el volumen de un cilindro(2). Hemos de pasarle el radio y la altura 
 */
import java.util.*;
public class J58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Que quieres calcular, el area(1) o el volumen(2)?");
		int num=sc.nextInt();
		System.out.println("Vale, pues dime el radio");
		int radio=sc.nextInt();
		System.out.println("Ahora la altura");
		int alt=sc.nextInt();
		
		cilindro(num, radio, alt);
	}

	static void cilindro(int eleccion, int radio, int altura) {
		
		if(eleccion==1) {
			double piPorDos=Math.PI*2;
			System.out.println("Área = " + 2 + "π" + "*" + radio + "*" + "(" + altura + "+" + radio + ")");
			System.out.println("Área = " + piPorDos*radio*(altura + radio));
		}else {
			System.out.println("Volumen =  π" + "*" + radio + "²" + "*" + altura);
			System.out.println("Volumen = " + Math.PI*(Math.pow(radio, 2)*altura));
		}
	}
}
