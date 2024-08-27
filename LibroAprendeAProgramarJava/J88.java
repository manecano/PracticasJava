/* pág 153
 * App que recoja el sueldo de los habitantes de un municipio. Para finalizar la entrada de datos, introduciremos -1
 * Al terminar, mostrar todos los sueldos de forma decreciente, el sueldo máximo y el mínimo y la media de los sueldos.
 */
package Ejercicios;
import java.util.*;

public class J88 {
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> listaSueldos = new ArrayList<>();
        
        System.out.println("Introduce el sueldo de los habitantes. Finaliza con -1");
        
        int sueldo = sc.nextInt();
        
        while(sueldo != -1) {
            listaSueldos.add(sueldo);
            sueldo = sc.nextInt();
        }
        
        // Ordenar la lista de sueldos en orden decreciente
        Collections.sort(listaSueldos, Collections.reverseOrder());
        
        // Mostrar la lista de sueldos ordenada
        System.out.println("Sueldos ordenados de forma decreciente: " + listaSueldos);
        
        // Obtener el máximo y el mínimo
        int maxSueldo = Collections.max(listaSueldos);
        System.out.println("Sueldo máximo: " + maxSueldo);
        
        int minSueldo = Collections.min(listaSueldos);
        System.out.println("Sueldo mínimo: " + minSueldo);
        
        //Obtener la media de los sueldos
        int suma = 0;
        for(int s:listaSueldos) {
        	suma+=s;
        }
        
        int media = suma / listaSueldos.size();
        
        System.out.println("Media de los sueldos: " + media);
    }
}