/* pág 147
 * App para gestionar las notas de un centro
 * Cada clase tiene 5 alumnos. Se pide las notas del primer, segundo y tercer trimestre de un grupo.
 * Mostramos la nota media del grupo en cada trimestre y la media del alumno
 */
package Ejercicios;
import java.util.*;
import javax.swing.*;

public class J81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] primerTrimestre = new int[5];
		
		for (int i=0;i<primerTrimestre.length;i++) {
			
			int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota del alumno (1º EVA)"));
			primerTrimestre[i]=nota;
			
		}
		
		int[] segundoTrimestre = new int[5];
		
		for (int i=0;i<segundoTrimestre.length;i++) {
			
			int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota del alumno (2º EVA)"));
			segundoTrimestre[i]=nota;
			
		}
		
		int[] tercerTrimestre = new int[5];
		
		for (int i=0;i<tercerTrimestre.length;i++) {
			
			int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota del alumno (3º EVA)"));
			tercerTrimestre[i]=nota;
			
		}
		
		System.out.println("Media de la 1ª Evaluación:");
		mediaGrupo(primerTrimestre);
		
		System.out.println("\n" + "Media de la 2ª Evaluación:");
		mediaGrupo(segundoTrimestre);
		
		System.out.println("\n" + "Media de la 3ª Evaluación:");
		mediaGrupo(tercerTrimestre);
		
		System.out.println("\n");
		mediaAlumno(primerTrimestre, segundoTrimestre, tercerTrimestre);
		

	}
	
	public static void mediaGrupo(int[] trimestre) {
		
		int suma=0;
		
		for(int i=0;i<trimestre.length;i++) {
		
			suma+=trimestre[i];
			
		}
		int media=suma/trimestre.length;
		
		System.out.println(media); 
	}
	
	public static void mediaAlumno(int[] trimestre1, int[] trimestre2, int[] trimestre3) {
		
		int alumno=0;
		int media=0;
		
		for(int i=0;i<trimestre1.length;i++) {
			
			alumno=trimestre1[i]+trimestre2[i]+trimestre3[i];
			media=alumno/3;
			System.out.println("Media del alumno " + (i+1) + ": " + media);
		}
		
	}

}
