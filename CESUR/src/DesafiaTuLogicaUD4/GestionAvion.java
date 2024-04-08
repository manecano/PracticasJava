
public class GestionAvion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*1*/	AvionEntrenamiento entrenamiento=new AvionEntrenamiento();
		entrenamiento.setter_doblemando("no");
		System.out.println(entrenamiento.getter_entrenamiento()+"\n");
		
		
		
/*2*/	AvionCombate combate1=new AvionCombate();
		combate1.setter_furtivo("si");
		Piloto piloto1=new Piloto("Pete Maverick", 10000, "capitán");
		System.out.println(combate1.getter_combate() +"\n"+ piloto1.mostrarPiloto()+"\n");
		
/*3*/	AvionCombate combate2=new AvionCombate();
		combate2.setter_furtivo("no");
		Piloto piloto2=new Piloto("Natasha Phoenix", 3000, "teniente");
		System.out.println(combate2.getter_combate() +"\n"+ piloto2.mostrarPiloto()+"\n");
	
		
		
/*4*/	AvionEntrenamiento entrenamiento1=new AvionEntrenamiento();
		entrenamiento1.setter_doblemando("si");
		Piloto piloto3=new Piloto("Manuel Cano", 5200, "primer oficial");
		System.out.println(entrenamiento1.getter_entrenamiento()+"\n"+ piloto3.mostrarPiloto()+"\n");
		
/*5*/	AvionEntrenamiento entrenamiento2=new AvionEntrenamiento();
		entrenamiento2.setter_doblemando("no");
		Piloto piloto4=new Piloto("Rocío Picos", 200, "piloto en prácticas");
		System.out.println(entrenamiento2.getter_entrenamiento()+"\n"+ piloto4.mostrarPiloto()+"\n");
	
	
	}

}
