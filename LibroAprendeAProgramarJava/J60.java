/* pag107
 * lo mismo que el anterior pero con tres numeros
 */
import java.util.*;
public class J60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();

		numeroMayor(num1,num2,num3);
	}

	static void numeroMayor(int a, int b, int c) {
		
		if(a==b && a==c){
			System.out.println(a + ", " + b + " y " + c + " son el mismo número");}
		
		else if(a==b && a>c){
			System.out.println(a + " y " + b + " son iguales y son mayores que " + c );}
		
		else if(a==b && a<c){
			System.out.println(c + " es mayor. " + a + " y " + b + " son iguales.");}
		
		else if(a==c && a>b){
			System.out.println(a + " y " + c + " son iguales y son mayores que " + b );}
		
		else if(a==c && a<b){
			System.out.println(b + " es mayor. " + a + " y " + c + " son iguales.");}
		
		else if(b==c && b>a){
				System.out.println(b + " y " + c + " son iguales y son mayores que " + a );}
			
		else if(b==c && b<a){
				System.out.println(a + " es mayor. " + b + " y " + c + " son iguales.");}
		
		else if(a>b && a>c) {
			System.out.println("El mayor es: " + a);}
		
		else if(b>a && b>c) {
			System.out.println("El mayor es: " + b);}
		
		else if(c>a && c>b) {
			System.out.println("El mayor es: " + c);}
	}
}
