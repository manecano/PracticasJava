/* pag87
 * introducir la altura de diferentes arboles en cm, hasta que se introduzca -1
 * asigna etiquetas a los arboles comenzando en 0
 */
import javax.swing.*;
public class J44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arbol=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm del arbol"));
		int i=0;
		
		while(arbol>0) {
			i++;
			System.out.println("Etiqueta " + i + ": " + arbol);
			
			arbol=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm del arbol"));
		}
	}

}
