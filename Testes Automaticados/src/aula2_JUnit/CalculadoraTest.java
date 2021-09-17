package aula2_JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);
		assertEquals(12, soma);
		
	}
	

}
