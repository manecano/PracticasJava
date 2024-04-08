import java.io.*;
import javax.swing.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero=new File ("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"tres.dat");  /*creación file */	
		
		try {								/*creación fichero */
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileWriter escritura=new FileWriter("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"tres.dat");
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));      /*creación escritura en fichero */	
			escritura.write(num);
			
			while(num>-1) {
				num=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número"));    /*creación bucle números positivos */	
				escritura.write(num);
			}
			
			escritura.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader lectura=new FileReader("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"tres.dat");
			
			int c=lectura.read();						/*creación lectura de archivo*/
			while(c!=-1) {
				c=lectura.read();
				System.out.println(c);
			}
			lectura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
