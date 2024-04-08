import java.util.*;
import java.io.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileWriter escritura=new FileWriter("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"tres.dat");
		
		atrincame[] misPersonas=new atrincame[3];
		misPersonas[0]=new atrincame("Mane",1998, 8, 14);
		misPersonas[1]=new atrincame("Rocío",1998, 3, 31);
		misPersonas[2]=new atrincame("Macarena",2007, 11, 22);
			
			for(int i=0;i<3;i++) {
				escritura.write(misPersonas[i].dimeDatos());
			}
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader lectura=new FileReader("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"tres.dat");
			
			int c=lectura.read();						
			while(c!=-1) {
				c=lectura.read();
				char letras=(char)c;
				System.out.print(letras);
			}
			lectura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
class atrincame{
	public atrincame(String nombre, int ano, int mes, int dia) {
		
		this.nombre=nombre;	
		GregorianCalendar fecha=new GregorianCalendar(ano, mes-1, dia);
		this.fecha=fecha.getTime();
	}
	
	String nombre;
	Date fecha;
	
	public String dimeDatos() {
		return "\n"+"Datos del usuario" + "\n" + "Nombre: " + nombre + "\n" + "Fecha de nacimiento: " + fecha + "\n";
	}
}
