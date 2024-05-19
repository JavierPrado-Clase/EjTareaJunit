package org.Cuatrovientos.ED.EjTareaJunit12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test para GenerarIp
 * 
 * @author Javier Prado
 */
class GeneradoeIpTest {
	/**
	 * Test para comprobar que el número se genera entre los limites dados
	 */
	@Test
	void testGenerarNumero() {
		GeneradorIp generador = new GeneradorIp();
		for (int i = 1; i <= 1000; i++) {
			int actual = generador.generarNumero(0, 254);
			assertTrue(actual >= 0 && actual <= 254);
		}

	}

	/**
	 * Test para comprobar la generacion de IPs
	 */
	@Test
	void testGeneraIp() {
		GeneradorIp generador = new GeneradorIp();
		String actual = generador.generarIp();
		assertFalse(actual.startsWith("0") && actual.endsWith("0"));
	}
}
