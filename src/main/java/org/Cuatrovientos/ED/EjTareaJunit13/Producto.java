package org.Cuatrovientos.ED.EjTareaJunit13;

/**
 * Producto de una Factura
 * 
 * @author Javier Peado
 */
public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;

	/**
	 * Constructor
	 * 
	 * @param nombre
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	/**
	 * Devuelve el precio total de el Producto
	 * 
	 * @return float
	 */
	public float precioTotal() {
		return precio * cantidad;
	}

	@Override
	public String toString() {
		return "Producto: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
