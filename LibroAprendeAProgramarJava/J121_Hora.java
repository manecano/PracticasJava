package Ejercicios;

public class J121_Hora {
	
	J121_Hora(int hora, int minuto){
		
		this.hora = hora;
		this.minuto = minuto;
		
	}
	
int hora;
int minuto;

	public void inc() {
	
	this.minuto = minuto + 1;
	
	if(minuto == 60) {
		
		this.minuto = 0;
		hora++;
		
		if(hora == 24) {
			
			this.hora = 0;
			
		}
		
	}
	
	}
	
	public void setMinutos(int min) {
		
		if(min>=0 && min<=59) {
			
			this.minuto = min;
			
		}else {
			
			System.out.println("Error");
			
		}
		
	}
	
	public void setHora(int hora) {
		
		if(hora>=0 && hora<=23) {
			
			this.hora = hora;
			
		}else {
			
			System.out.println("Error");
			
		}
		
	}
	
	@Override public String toString() {
		
		String hour = hora + ":" + minuto ;
		System.out.println(hour);
		return hour;
		
	}

}
