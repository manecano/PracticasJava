import java.io.*;
import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"dirEjer2");
		directorio.mkdir();
		
		File fichero1=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"dirEjer2"+File.separator+"uno.txt");
		File fichero2=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"dirEjer2"+File.separator+"dos.txt");
		try {
			fichero1.createNewFile();
			fichero2.createNewFile();
			
			FileWriter archivo2=new FileWriter("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"dirEjer2"+File.separator+"dos.txt");
			BufferedWriter mibuffer=new BufferedWriter(archivo2);
			
			String nom=JOptionPane.showInputDialog("Introduce un nombre");
			archivo2.write(nom+"\n");
			while(!nom.equals("-")) {
				nom=JOptionPane.showInputDialog("Introduce un nombre");
				archivo2.write(nom+"\n");
			}
			
			archivo2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader lectura=new FileReader("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"dirEjer2"+File.separator+"dos.txt");
			int c=lectura.read();
			
			while(c!=-1) {
				c=lectura.read();
				char letra=(char)c;
				System.out.print(letra);
			}lectura.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
