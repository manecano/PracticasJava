/* pag92 
 * pide la hora y luego pide cuantos segundos desea incrementar
 */
import java.util.*;
public class J52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Dime los segundos");
		int seg=sc.nextInt();
		System.out.println("Dime los minutos");
		int min=sc.nextInt();
		System.out.println("Dime la hora");
		int hor=sc.nextInt();
		System.out.println("Dime cuantos segundos quieres incrementar");
		int incre=sc.nextInt();
		int incremen=seg+incre;
		int i=0;
		
		for(i=seg;i<incremen;i++) {
			if(i==60) {
				min++;
				i=i-60;
				incremen=incremen-60;
			}
		}
		
		while(min>=60) {
			min=min-60;
			hor++;
		}
		while(hor>=24){
			hor=hor-24;
		}

		System.out.println("\n" + "hora: " + hor + " min:" + min + " seg: " + i);
	}

}
