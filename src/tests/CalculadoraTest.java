package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void testSuma(){
		assertEquals(5, Calculadora.suma(3, 2));
	}
	
	@Test
	void testResta(){
		assertEquals(1, Calculadora.resta(3, 2));
	}
	
	@Test
	void testMultiplicacion(){
		assertEquals(6, Calculadora.multiplicacion(3, 2));
	}
	
	@Test
	void testDivision(){
		assertEquals(4, Calculadora.division(8, 2));
	}
}
