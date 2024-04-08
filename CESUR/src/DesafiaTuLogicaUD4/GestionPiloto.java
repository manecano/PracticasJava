
public class GestionPiloto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piloto piloto1=new Piloto("Pete Maverick", 10000, "capitán");
		Piloto piloto2=new Piloto("Natasha Phoenix", 3000, "teniente");
		Piloto piloto3=new Piloto("Bradley Rooster", 3500, "teniente");
		Piloto piloto4=new Piloto("Manuel Cano", 5200, "primer oficial");
		Piloto piloto5=new Piloto("Rocío Picos", 200, "piloto en prácticas");
		
		System.out.println(piloto1.mostrarPiloto());
		System.out.println(piloto2.mostrarPiloto());
		System.out.println(piloto3.mostrarPiloto());
		System.out.println(piloto4.mostrarPiloto());
		System.out.println(piloto5.mostrarPiloto());
	}

}
