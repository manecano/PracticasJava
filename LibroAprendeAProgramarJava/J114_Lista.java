package Ejercicios;

public class J114_Lista {

private int[] tabla;
	
	

	public J114_Lista() {
		
		this.tabla = new int[10];
		
	}
	
	public J114_Lista(int tamañoInicial) {
		
		this.tabla = new int[tamañoInicial];
		
	}
	
	public void tamañoLista() {
		
		int tamaño = tabla.length;
		System.out.println("Elementos en la lista: " + tamaño);
		
	}
	
	public void insertarFinal(int elemento) {
		
		int tamañoNuevo = tabla.length + 1;
		this.tabla = new int[tamañoNuevo];
		tabla[tabla.length] = elemento;
		
	}
	
	public void insertarPrincipio(int elemento) {
		
		int tamañoNuevo = tabla.length + 1;
		this.tabla = new int[tamañoNuevo];
		
		for(int i=tabla.length-1;i>-1;i--) {
			
			tabla[i] = tabla[i+1];
			
		}
		
		tabla[0] = elemento;
		
	}
	
	public void insertarEnLugar(int elemento, int index) {
		
		int tamañoNuevo = tabla.length + 1;
		this.tabla = new int[tamañoNuevo];
		
		for(int i=tabla.length-1;i>index-1;i--) {
			
			tabla[i] = tabla[i+1];
			
		}
		
		tabla[index] = elemento;
	}
	
	public void añadirLista(int lista[]) {
		
		int contador = 0;
		int tamañoLista2 = lista.length;
		int tamañoLista1 = tabla.length;
		
		int tamañoNuevo = tabla.length + tamañoLista2;
		this.tabla = new int[tamañoNuevo];
		
		for(int i=tamañoLista1;i<tabla.length;i++) {
			
			tabla[i] = lista[contador];
			contador++;
			
		}
		
	}
	
	public void eliminarElemento(int index) {
		
		int tabla1[] = new int[index-1];
		
		for(int i=0;i<index-1;i++) {
			
			tabla[i] = tabla1[i];
			
		}
		
		int tabla2[] = new int[index+1];
		
		for(int i=0;i<tabla.length;i++) {
			
			tabla[i] = tabla2[i];
			
		}
		
		int tamañoNuevo = tabla.length-1;
		
		this.tabla = new int[tamañoNuevo];
		
		for(int i=0;i<tabla1.length;i++) {
			
			tabla[i] = tabla1[i];
			
		}
		
		int contador = tabla1.length + 1;
		
		for(int i=0;i<tabla2.length;i++) {
			
			tabla[contador] = tabla2[i];
			
			contador++;
		}
		
		
		for(int i=0;i<tabla.length;i++) {
			
			System.out.println(tabla[i]);
			
		}
		
	}
	
	public void obtenerElemento(int index) {
		
		System.out.println(tabla[index]);
		
	}
	
	public void buscarNum(int num) {
		
		boolean palanca = false;
		
		for(int i=0;i<tabla.length;i++) {
			
			if(num == tabla[i]) {
				
				System.out.println("Se encuentra en el index " + i);
				palanca = true;
				break;
				
			}	
			
		}
		
		if(palanca == false) {
			
			System.out.println("-1");
			
		}
		
		
	}

}
