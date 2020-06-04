package ualhmis.examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ej3Test {

	@ParameterizedTest
	@CsvSource({"0", "1", "2", "3", "4", "5", "6", "7", "8"})
	
	void notaTest(int dia) {
		Ejercicio3 ej = new Ejercicio3();
		ej.diaSemana(dia);
	}

}
