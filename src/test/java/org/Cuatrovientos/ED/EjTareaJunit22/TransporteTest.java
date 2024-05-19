package org.Cuatrovientos.ED.EjTareaJunit22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test para Transporte
 * 
 * @author Javier Prado
 */
class TransporteTest {
	/**
	 * Test para comprobar el PesoTotal
	 */
	@Test
	void testPesoTotal() {
		Camioneta camioneta = new Camioneta();

		camioneta.incluirPaquete(new Paquete("Pamplona", 12f));
		assertEquals(12F, camioneta.pesoTotal());
	}

	/**
	 * Test para comprobar que la generación de la distancia esta entre los limites
	 * del Transporte
	 */
	@Test
	void testRecorrerDistancia() {
		Camioneta camioneta = new Camioneta();

		for (int i = 1; i <= 1000; i++) {
			int actual = camioneta.recorrerDistancia();
			assertTrue(actual >= 70 && actual <= 100);
		}
	}
}
