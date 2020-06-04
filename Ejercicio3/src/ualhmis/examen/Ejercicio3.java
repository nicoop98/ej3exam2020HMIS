package ualhmis.examen;

public class Ejercicio3 {

	public String diaSemana(int dia) {
		
		if (dia == 1) return "lunes";
		else if (dia == 2) return "martes";
		else if (dia == 3) return "miercoles";
		else if (dia == 4) return "jueves";
		else if (dia == 5) return "viernes";
		else if (dia == 6) return "sabado";
		else if (dia == 7) return "domingo";
		
		else return "error";
	}
}
