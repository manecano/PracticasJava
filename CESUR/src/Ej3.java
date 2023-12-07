//Escribe un programa en Java que muestre y cuente los números que son múltiplos de 2 o de 3 que hay entre 1 y 100. Utiliza las estructuras de control que creas convenientes.
public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=100;
		
		while (num!=1) {
			num--;
			
			
			if (num%2==0) {
				System.out.println(num + " múltiplo de 2");
			
			}
			if (num%3==0) {
				System.out.println(num + " múltiplo de 3");
			}
			
		}
		
	}

}
