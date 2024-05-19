package org.Cuatrovientos.ED.EjTareaJunit13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test para Factura
 * 
 * @author Javier Prado
 */
class FacturaTest {
	/**
	 * Test para comprobar el total de la factura
	 */
	@Test
	void testTotalFactura() {
		Factura factura = new Factura();

		factura.meterProducto(new Producto("pan", 0.50f, 5));
		factura.meterProducto(new Producto("agua", 0.05f, 10));
		factura.meterProducto(new Producto("platano", 2.50f, 2));

		assertEquals(8f, factura.totalFactura());
	}

	/**
	 * Test para comprobar la aplicación del IVA
	 */
	@Test
	void testAplicarIva() {
		Factura factura = new Factura();

		factura.meterProducto(new Producto("pan", 0.50f, 5));
		factura.meterProducto(new Producto("platano", 2.50f, 3));

		assertEquals(9f, factura.aplicarIva(10));
	}

}
