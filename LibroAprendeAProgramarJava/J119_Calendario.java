package Ejercicios;

import java.util.Date;
import java.util.GregorianCalendar;

public class J119_Calendario {

	J119_Calendario(int año, int mes, int dia){
		
		//if(año>0 && mes>0 && mes<=12 && dia>0 && dia<=31) {
		
		this.año = año;
		this.mes = mes;
		this.dia = dia;
		this.gregorianCalendar = new GregorianCalendar(this.año, this.mes - 1, this.dia);
		this.calendar = gregorianCalendar.getTime();
		
		//}else {
			
			//System.out.println("Error en la fecha introducida");
		//}
		
	}

int año;
int mes;
int dia;
Date calendar;
GregorianCalendar gregorianCalendar;


	public void incremDias(int dias) {
		
		gregorianCalendar.add(GregorianCalendar.DAY_OF_MONTH,dias);
		this.año = gregorianCalendar.get(GregorianCalendar.YEAR);
		this.mes = gregorianCalendar.get(GregorianCalendar.MONTH);
		this.dia = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
		this.calendar = gregorianCalendar.getTime();
		
	}
	
	public void incremMes(int mes) {
		
		gregorianCalendar.add(GregorianCalendar.MONTH,mes);
		this.año = gregorianCalendar.get(GregorianCalendar.YEAR);
		this.mes = gregorianCalendar.get(GregorianCalendar.MONTH);
		this.dia = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
		this.calendar = gregorianCalendar.getTime();
		
	}
	
	public void incremAño(int año) {
		
		gregorianCalendar.add(GregorianCalendar.YEAR,año);
		this.año = gregorianCalendar.get(GregorianCalendar.YEAR);
		this.mes = gregorianCalendar.get(GregorianCalendar.MONTH);
		this.dia = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
		this.calendar = gregorianCalendar.getTime();
		
	}
	
	public void mostrar(){
		
		System.out.println(calendar);
		
	}
	
	public boolean iguales(GregorianCalendar calendario) {
		
		Date almanaque;
		
		almanaque = calendario.getTime();
		
		boolean eq = false;
		
		if(this.calendar.equals(calendario)) {
			
			eq = true;
			System.out.println("Son iguales");
			
		}else {
			
			eq = false;
			System.out.println("No son iguales");
			
		}
		
		return eq;
	}
	
	
}


