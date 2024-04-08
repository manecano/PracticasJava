
public class Avion {

	public Avion(int capAvion) {
		id=idAvion;
		idAvion++;
		this.capAvion=capAvion;
		
	}

private int id;
private static int idAvion=1;
private int capAvion;


	public String mostrarAvion() {
		return "ID Avión: " + id + "\n" + "Capacidad del avión: " + capAvion;
	}
}

