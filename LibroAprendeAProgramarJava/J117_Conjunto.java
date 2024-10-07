package Ejercicios;

import java.util.Arrays;

public class J117_Conjunto {
	
	J117_Conjunto(){
		
		this.lista = new int[10];
		
	}
	
int[] lista; 

	J117_Conjunto(int tamaño) {
		
		this.lista = new int[tamaño];
	}
	
	public int obtenerNumElementos(){
		
		int tamaño = lista.length;
		System.out.println("La lista tiene " + tamaño + " elementos");
		return tamaño;
		
	}
	
	public void insertarNum(int num) {
		
		int contador = 0;
		
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i] == num) {
				
				contador++;
				
			}
			
		}
		
		if(contador == 0) {
			
			int[] copiaArray = Arrays.copyOf(lista, lista.length + 1);
			copiaArray[lista.length] = num;
			lista = copiaArray;
			
		}else {
			
			System.out.println("El número ya se encontraba en la lista");
			
		}
		
	}
	
	public void añadirConjunto(int[] conjuntoNuevo){
		
		int[] arrayNuevo = new int[lista.length + conjuntoNuevo.length];
		
		System.arraycopy(lista, 0, arrayNuevo, 0, lista.length);
		
		System.arraycopy(conjuntoNuevo, 0, arrayNuevo, lista.length, conjuntoNuevo.length);
		
		lista = arrayNuevo;
		
	}	
	
	public void eliminarElemento(int elemento) {
	    // Primero, contar cuántos elementos hay que eliminar
	    int contador = 0;
	    
	    for (int i = 0; i < lista.length; i++) {
	        if (lista[i] == elemento) {
	            contador++;
	        }
	    }
	    
	    // Si no hay elementos que eliminar, salir
	    if (contador == 0) {
	        System.out.println("El elemento no está en la lista.");
	        return;
	    }
	    
	    // Crear un nuevo array con el tamaño reducido
	    int[] arrayNuevo = new int[lista.length - contador];
	    int j = 0;  // Índice para el nuevo array
	    
	    for (int i = 0; i < lista.length; i++) {
	        if (lista[i] != elemento) {
	            arrayNuevo[j] = lista[i];
	            j++;
	        }
	    }
	    
	    // Actualizar el array 'lista'
	    lista = arrayNuevo;
	}
	
	public void pertenece(int elemento) {
		
		boolean pertenece = false;
		
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i] == elemento) {
				
				pertenece = true;
				break;
				
			}
		}
		
		if (pertenece) {
			
			System.out.println("Pertenece al conjunto");
			
		}else {
			
			System.out.println("NO pertenece al conjunto");
			
		}
	
	}
	
	public void mostrarLista() {
		
		System.out.println(Arrays.toString(lista));
		
	}
	
}
