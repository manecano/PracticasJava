
public class AvionCombate extends Avion {

	public AvionCombate() {
		
		super(30);
	}
	
	boolean esFurtivo;


	public void setter_furtivo(String dime_furtivo) {
	if (dime_furtivo.equalsIgnoreCase("Si")) {
		esFurtivo=true;
	}else {
		esFurtivo=false;
	}
	}
	public String getter_combate() {
		if(esFurtivo==true) {
			return super.mostrarAvion() +"\n"+ "El avión de combate es furtivo.";
		}else {
			return super.mostrarAvion() +"\n"+ "El avión de combate no es furtivo.";	
			} 
	}
	
}
