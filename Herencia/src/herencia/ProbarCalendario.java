package herencia;

import java.util.Calendar;

public class ProbarCalendario {

	public static void main(String[] args) {
		Calendario cal= new Calendario();
		System.out.println(cal.toString());
		System.out.println(cal.get(Calendario.DAY_OF_MONTH));
		System.out.println(cal.getDiaMes());
		System.out.println(cal.getAño());
		System.out.println(cal.getMes());
		System.out.println(cal.getDiaSemana());
		
		
	}
	


}
