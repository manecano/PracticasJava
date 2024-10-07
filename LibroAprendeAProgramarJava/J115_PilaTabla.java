package Ejercicios;

import java.util.Arrays;

public class J115_PilaTabla {

	J115_PilaTabla(){
		
		this.lista = new int[0];
		
	}
	
int[] lista;

public void apilar(int añadir) {
	
	int[] arrayNuevo = Arrays.copyOf(lista, lista.length + 1);
	
	arrayNuevo[arrayNuevo.length - 1] = añadir;
	
	this.lista = arrayNuevo;
	
	System.out.println("Número apilado: " + añadir);
	
}

public void desapilar() {
	
	if(lista.length != 0) {
		
		int[] nuevoArray = Arrays.copyOf(lista, lista.length - 1);
		
		this.lista = nuevoArray; 
		
		System.out.println("Número desapilado correctamente");
		
	}else {
		
		System.out.println("La pila está vacia");
		
	}
	
	
	
}

public int[] mostrarLista() {
	
	System.out.println(Arrays.toString(lista));
	return lista;
	
}

}
