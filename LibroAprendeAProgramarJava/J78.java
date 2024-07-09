/* pág 141
 * 
 */
import java.util.*;
public class J78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random=(int)(Math.random()*10);
		
		while(random>5) {
			random=(int)(Math.random()*10);
		}
		
		int random2=(int)(Math.random()*10);
		
		while(random2>5) {
			random2=(int)(Math.random()*10);
		}
		
		int[] camara={random, random2};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el código 1");
		int cod1=sc.nextInt();
		
		while(cod1!=camara[0]) {
			
			if(cod1>camara[0]) {
			
				System.out.println("Incorrecto, prueba un número más bajo");
				cod1=sc.nextInt();
			}
			
			else {
				
				System.out.println("Incorrecto, prueba un número más alto");
				cod1=sc.nextInt();
			}
			
		System.out.println("Correcto! Ahora prueba con el código 2");
		
		int cod2=sc.nextInt();
		
		while(cod2!=camara[1]) {
			
			if(cod2>camara[1]) {
			
				System.out.println("Incorrecto, prueba un número más bajo");
				cod2=sc.nextInt();
			}
			
			else {
				
				System.out.println("Incorrecto, prueba un número más alto");
				cod2=sc.nextInt();
			}
			
		}
		
		System.out.println("EUREKAAAAA");
		
	}

}
}
