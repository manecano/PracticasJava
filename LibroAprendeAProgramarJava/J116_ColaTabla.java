package Ejercicios;

import java.util.Arrays;

public class J116_ColaTabla {
	
	J116_ColaTabla(){
		
		this.lista = new int[0];
	}
	
int[] lista;

	public void encolar(int num){
				
		int [] listaNueva = Arrays.copyOf(lista, lista.length + 1);
		listaNueva[listaNueva.length - 1] = num;
		lista = listaNueva;
		
	}
	
	public void desencolar(){
		
		if(lista.length != 0) {
			
			int [] listaNueva = new int [lista.length - 1];
			int j = 0;
			
			for(int i=1;i<lista.length;i++) {
				
				listaNueva[j] = lista[i];
				j++;
				
			}
			
			lista = listaNueva;
			
		}else {
			
			System.out.println("No hay datos en la lista");
			
		}
		
		
	}
	
	public void mostrarListaCola(){
		
		System.out.println(Arrays.toString(lista));
		
		
	}
	

}
