/* pag92
 * E(n, m) = n! / (m! * (n - m)!)
 * Para calcular el número situado en la fila 3 y la columna 2, se utiliza la siguiente fórmula:
	E(3, 2) = 3! / (2! * (3 - 2)!) = 3 * 2 * 1 / (2 * 1) = 3
 */
import javax.swing.*;
public class J55_sinresolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
		int fact_fila=0;
		int fact_column=0;
		int fact_parent=0;
		int parentesis_fila_menos_column=0;
		
		for(int i=0;i!=num;i++) {  //contamos las filas
			fact_fila=i;
			for(int j=0;j!=i;j++) {  //contamos las columnas (que serán las mismas que el nº fila en la que se encuentra)
				fact_column=j;
				for(int b=i;b>1;) {    //FACTORIAL FILA //puede que ese b=i de error al terminar el for y siempre se convierta en i sin hacer el --?
					
					fact_fila=fact_fila*(b-1);
					b--;
				}if(fact_fila==0) {
					fact_fila=1;}
				
				fact_column=j;
				for(int c=j;c>1;) {				//FACTORIAL COLUMNA
					fact_column=fact_column*(c-1);
					c--;
				}if(fact_column==0) {
					fact_column=1;}
				
				parentesis_fila_menos_column=i-j;
				for(int d=parentesis_fila_menos_column;d>1;) {
					parentesis_fila_menos_column=parentesis_fila_menos_column*(d-1);
					d--;
				}if(parentesis_fila_menos_column==0) {
					parentesis_fila_menos_column=1;}
			}
			
			int fact_def=fact_fila/(fact_column*parentesis_fila_menos_column);
			if(fact_def==0) {
				fact_def=1;}
		
			System.out.println(fact_def);
		}
	}

}
