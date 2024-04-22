/* pag87
 * programa que muestre el producto de los 10 primeros numeros impares
 */
public class J42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=1;
		for(int i=0;i<20;i++) {
			if(i%2!=0) {
				System.out.println(i);
				contador=i*contador;
			}
		}
		System.out.println("El producto: " + contador);
	}

}
