package Ejercicios;
import java.util.*;
public class J118_PasoFronterizo {

	J118_PasoFronterizo(String nom, String dni){
		
		this.nombre = nom;
		this.dni = dni;
		personas.add(this);
		
	}
	
String nombre;
String dni;
static List<J118_PasoFronterizo> personas = new ArrayList<>();

	public void mostrarPersonas() {
		
		for(J118_PasoFronterizo persona : personas) {
			
			System.out.println("Pasajero: " + persona.nombre + " (" + persona.dni + ")");
			
		}
		
	}
	
	public void busquedaNombre(String nom) {
		
		for(J118_PasoFronterizo persona : personas) {
			
			if(persona.nombre.equalsIgnoreCase(nom)) {
				
				System.out.println("ENCONTRADO" + "\n" + persona.nombre + " (" + persona.dni + ")");
				
			}
			
		}
		
	}
	
	public void busquedaDNI(String dni) {
		
		for(J118_PasoFronterizo persona : personas) {
			
			if(persona.dni.equalsIgnoreCase(dni)) {
				
				System.out.println("ENCONTRADO" + "\n" + persona.nombre + " (" + persona.dni + ")");
				
			}
			
		}
		
	}
	
}
