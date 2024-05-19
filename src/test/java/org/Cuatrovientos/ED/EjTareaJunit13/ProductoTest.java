package org.Cuatrovientos.ED.EjTareaJunit13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test para Producto
 * 
 * @author Javier Prado
 */
class ProductoTest {
	/**
	 * Test que comprueba el constructor
	 */
	@Test
	void testNuevo() {
		Producto producto = new Producto("pan", 0.50f, 5);

		assertEquals("pan", producto.getNombre());
		assertEquals(0.50f, producto.getPrecio());
		assertEquals(5, producto.getCantidad());
	}

	/**
	 * Test que comprueba el precio total
	 */
	@Test
	void testPrecioTotal() {
		Producto producto = new Producto("pan", 0.50f, 5);

		assertEquals(2.50f, producto.precioTotal());
	}
}
