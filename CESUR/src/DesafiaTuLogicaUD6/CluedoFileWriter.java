import java.util.*;
import java.io.*;
import javax.swing.*;
public class CluedoFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File game=new File("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"cluedo.txt");
		try {
			game.createNewFile();
			FileWriter escritura=new FileWriter("C:"+File.separator+"Users"+File.separator+"Mane"+File.separator+"Desktop"+File.separator+"cluedo.txt");
			
			String fin;
		do{
		String[] personaje={"Amapola","Celeste","Prado","Mora","Rubio","Blanco"};
		String[] armas={"bate", "pistola", "candelabro", "cuchillo", "cuerda", "hacha", "pesa", "veneno", "trofeo"};
		String[] habitacion={"casa de invitados", "teatro", "spa", "observatorio", "comedor", "terraza", "salón", "cocina", "vestíbulo"};
	
		String bienv="BIENVENIDOS AL CLUEDO DEL TEMA 6 DE PROGRAMACIÓN" + "\n" + "Este programa se encarga de barajar las cartas de forma aleatoria. Son las siguientes:";
		for(int i=0;i<bienv.length();i++) {
			escritura.write(bienv.charAt(i));
		}
		System.out.println(bienv);
		
		String pers="\n" + "PERSONAJES:";
		for(int i=0;i<pers.length();i++) {
			escritura.write(pers.charAt(i));}
		System.out.println(pers);
		
		for(int i=0;i<personaje.length;i++) {
			escritura.write(personaje[i].charAt(i));
			System.out.println(personaje[i]);
		}
		
		String weap="\n" + "ARMAS:";
		for(int i=0;i<weap.length();i++) {
			escritura.write(weap.charAt(i));}
		System.out.println(weap);
		for(int i=0;i<armas.length;i++) {
			escritura.write(armas[i].charAt(i));
			System.out.println(armas[i]);
		}
		
		String room="\n" + "HABITACIÓN:";
		for(int i=0;i<room.length();i++) {
			escritura.write(room.charAt(i));}
		System.out.println(room);
		for(int i=0;i<habitacion.length;i++) {
			escritura.write(habitacion[i].charAt(i));
			System.out.println(habitacion[i]);
		}
		
		String ans=JOptionPane.showInputDialog("¿Quiere añadir algo más?");
		for(int i=0;i<ans.length();i++) {
			escritura.write(ans.charAt(i));}
		
		while(ans.equalsIgnoreCase("si")) {
			String menu="\n" + "Este es el menú:" + "\n" + "1.Personaje" + "\n" + "2.Arma" + "\n" + "3.Habitación" + "\n" + "4.Salir";
			for(int i=0;i<menu.length();i++) {
			escritura.write(menu.charAt(i));}
			System.out.println(menu);
			int chs=Integer.parseInt(JOptionPane.showInputDialog("Indica opción"));
/**/			escritura.write(chs);
			
		switch(chs){
		case 1:
			int num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos personajes quiere introducir?"));
			personaje=actualizarArray(personaje,num);
			for(int i=personaje.length-num;i<personaje.length;i++) {
				String dato=JOptionPane.showInputDialog("Introduce nombre de personaje");
				personaje[i]=dato;
			}
			System.out.println("\n"+"PERSONAJES ACTUALIZADOS:"+"\n"+Arrays.toString(personaje));
			
			ans=JOptionPane.showInputDialog("¿Quiere añadir algo más?");
			break;
		case 2:
			num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas armas quiere introducir?"));
			armas=actualizarArray(armas,num);
			for(int i=armas.length-num;i<armas.length;i++) {
				String dato=JOptionPane.showInputDialog("Introduce nombre de arma");
				armas[i]=dato;
			}
			System.out.println("\n"+"ARMAS ACTUALIZADAS:"+"\n"+Arrays.toString(armas));
		
			ans=JOptionPane.showInputDialog("¿Quiere añadir algo más?");
			break;
		case 3:
			num=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas habitaciones quiere introducir?"));
			habitacion=actualizarArray(habitacion,num);
			for(int i=habitacion.length-num;i<habitacion.length;i++) {
				String dato=JOptionPane.showInputDialog("Introduce nombre de habitacion");
				habitacion[i]=dato;
			}
			System.out.println("\n"+"HABITACIONES ACTUALIZADAS:"+"\n"+Arrays.toString(habitacion));
			
			ans=JOptionPane.showInputDialog("¿Quiere añadir algo más?");
			break;
		case 4:
			ans="no";
			break;
		}
		}
		System.out.println("\n"+"Genial, sigamos");
		
		
/*random pers*/	
		int random1=(int)(Math.random()*100);	
		while(random1>personaje.length) {
		random1=(int)(Math.random()*100);
		}
				
/*random arma*/
		int random2=(int)(Math.random()*100);
		while(random2>armas.length) {
		random2=(int)(Math.random()*100);
		}
				
/*random habitación*/
		int random3=(int)(Math.random()*100);
		while(random3>habitacion.length) {
		random3=(int)(Math.random()*100);
		}
		
		int rhora=(int)(Math.random()*100);
		while(rhora>23) {rhora=(int)(Math.random()*100);}
		if(rhora==0) {rhora=00;}
	
		int rmin=(int)(Math.random()*100);
		while(rmin>59) {rhora=(int)(Math.random()*100);}
		if(rmin==0) {rmin=00;}
	
		String clave=JOptionPane.showInputDialog("Para ver la escena del crimen debes acertar este acertijo: ¿Sabe usted que es lo que quiero?");
		if(clave.equalsIgnoreCase("Un ron pomelo")) {
			
			System.out.println("\n"+"ASESINO:"+personaje[random1]);
			System.out.println("\n"+"ARMA:"+armas[random2]);
			System.out.println("\n"+"HABITACIÓN:"+habitacion[random3]);
			System.out.println("\n"+"HORA: "+rhora+":"+rmin);
		}else {
			System.out.println("\n"+"Has fallado, te jodes como Herodes");
		}

		fin=JOptionPane.showInputDialog("¿Quieres crear una nueva combinación para el juego?");
		}while(fin.equalsIgnoreCase("si"));
			
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
/* pasa la información de todas las combinaciones de cartas realizadas durante la
sesión a nuestro fichero de texto (indicado al principio), pero además se
introducirá (en la cabecera del fichero) la fecha del momento de cierre.
c. Mostramos un mensaje de despedida y finalizamos la ejecución del
programa. (se acaba la sesión)*/

public static String[] actualizarArray(String[] arrayAntiguo, int num) {
	
	String[] arrayNuevo=new String[arrayAntiguo.length+num];
	System.arraycopy(arrayAntiguo, 0, arrayNuevo, 0, arrayAntiguo.length);
	return arrayNuevo;
	}}