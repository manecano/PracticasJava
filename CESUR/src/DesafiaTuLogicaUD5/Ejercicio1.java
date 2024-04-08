/*Pido al usuario que introduzca el nombre de dos ficheros
 *El nombre debe tener longitud >=3 
 *Obtén la ruta del directorio y muéstrala en consola
 *Construye la ruta del primer fichero*/
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*A)*/		String nom1=JOptionPane.showInputDialog("Introduce el nombre del fichero1");
			while(nom1.length()<3) {
				nom1=JOptionPane.showInputDialog("El nombre debe tener 3 o más caracteres");}
			/*System.out.println("El nombre del fichero " + nom1 + " es válido.");*/
			
		String nom2=JOptionPane.showInputDialog("Introduce el nombre del fichero2");
			while(nom2.length()<3) {
				nom2=JOptionPane.showInputDialog("El nombre debe tener 3 o más caracteres");} 
			/*System.out.println("El nombre del fichero " + nom2 + " es válido.");*/
			
/*B)*/	/*File fichero1=new File("prueba");
		System.out.println(fichero1.getAbsolutePath());
		System.out.println(fichero1.exists());*/
		
/*C)*/	File fichero1=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+nom1);

/*G)*/	if(fichero1.exists()) {
		
		System.out.println(fichero1.getName());
		System.out.println(fichero1.getAbsolutePath());
		System.out.println(fichero1.getParentFile());
		System.out.println(fichero1.getTotalSpace());
		if(fichero1.isDirectory()==true) {System.out.println("Es un directorio");}else {
		System.out.println("Es un fichero");}
		System.out.println("Permiso de lectura: " + fichero1.setReadable(true));
		System.out.println("Permiso de escritura: " + fichero1.setWritable(true));
		System.out.println("Permiso de ejecución: " + fichero1.setExecutable(true));
		System.out.println("¿Está oculto? " + fichero1.isHidden());} else {
		
		System.out.println("La ruta no existe");	
		}
		
		/*System.out.println(fichero1.getAbsolutePath());
		System.out.println(fichero1.exists());*/
		
		File fichero2=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+nom2);
		/*System.out.println(fichero2.getAbsolutePath());
		System.out.println(fichero2.exists());*/
		
/*D)*/	if(fichero1.exists()==true) {
			/*System.out.println("No se puede crear este fichero porque ya existe");*/
		}else {try {
/*E)*/		fichero1.createNewFile();
			FileWriter	escritura = new FileWriter("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+nom1);
			for(int i=0;i<11;i++) {
			escritura.write(String.valueOf(i + "\n"));}
			escritura.close();
			
			
			
/*F*/		/*FileReader leer=new FileReader("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+nom1);
			int c=leer.read();
			while(c!=-1) {
				c=leer.read();
				char convert=(char)c;
				System.out.println(convert);}
			leer.close();*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
		if(fichero2.exists()==true) {
			/*System.out.println("No se puede crear este fichero porque ya existe");*/
		}else {try {
			fichero2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
/*H)*/	String f1="C:\\Users\\Mane\\Desktop\\"+nom1;
		Path fuente = Paths.get(f1);
		String f2="C:\\Users\\Mane\\Desktop\\"+nom2;
		Path destino = Paths.get(f2);
		try {
			Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*I*/	File borrar=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+nom1);
		borrar.delete();
		
		
		
		
	}

}