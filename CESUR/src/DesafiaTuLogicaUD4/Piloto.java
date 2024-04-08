
public class Piloto {

	public Piloto(String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
		
		id=idPiloto;
		idPiloto++;
		this.nomPiloto=nomPiloto;
		this.horasVueloPiloto=horasVueloPiloto;
		this.rangoPiloto=rangoPiloto;
	}

private int id;
private static int idPiloto=1;
private String nomPiloto;
private int horasVueloPiloto;
private String rangoPiloto;
	
	public String mostrarPiloto() {
		return "ID Piloto: " + id + "\n" + "Nombre del piloto: " + nomPiloto + "\n" + "Horas de vuelo: " + horasVueloPiloto + "\n" + "Rango del piloto: " + rangoPiloto;
	}
	
}
