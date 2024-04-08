
public class AvionEntrenamiento extends Avion{

	public AvionEntrenamiento() {
		super(10);
	}
	
	boolean tieneDobleMando;


	public void setter_doblemando(String dime_mando) {
	if (dime_mando.equalsIgnoreCase("Si")) {
		tieneDobleMando=true;
	}else {
		tieneDobleMando=false;
	}
	}
	public String getter_entrenamiento() {
		if(tieneDobleMando==true) {
			return super.mostrarAvion() +"\n"+"El avión de entrenamiento tiene doble mando.";
		}else {
			return super.mostrarAvion() +"\n"+"El avión de entrenamiento NO tiene doble mando.";	
			} 
	}
	
}
