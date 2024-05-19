package org.Cuatrovientos.ED.EjTareaJunit13;

import java.util.ArrayList;

/**
 * Factura con una lista de Productos
 * 
 * @author Javier Peado
 */
public class Factura {
	private ArrayList<Producto> listaProductos;

	/**
	 * Constructor Inicializa la lista de Productos
	 */
	public Factura() {
		listaProductos = new ArrayList<Producto>();
	}

	/**
	 * Añade un Producto a la lista
	 * 
	 * @param newProducto
	 */
	public void meterProducto(Producto newProducto) {
		listaProductos.add(newProducto);
	}

	/**
	 * Devuelve el precio total de los productos de la lista
	 * 
	 * @return floar
	 */
	public float totalFactura() {
		float total = 0f;
		for (Producto producto : listaProductos) {
			total += producto.precioTotal();
		}
		return total;
	}

	/**
	 * Devuelve el precio total de los productos de la lista con un IVA recibido
	 * 
	 * @param ivaProductos
	 * @return float
	 */
	public float aplicarIva(float ivaProductos) {
		float iva = 0f;
		float total = totalFactura();
		iva = total - ((ivaProductos / 100) * total);
		return iva;
	}

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
