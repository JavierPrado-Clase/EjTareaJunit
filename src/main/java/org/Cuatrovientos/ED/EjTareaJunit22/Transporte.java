package org.Cuatrovientos.ED.EjTareaJunit22;

/**
 * Interfaz para Transportes
 * 
 * @author Javier Prado
 */
public interface Transporte {
	/**
	 * Añade un paquete al transporte
	 * 
	 * @param paquete
	 */
	public void incluirPaquete(Paquete paquete);

	/**
	 * Devuelve el peso total de el transporte
	 * 
	 * @return float
	 */
	public float pesoTotal();

	/**
	 * Recorre una distancia aleatoria dependiendo del tipo de Transporte
	 * 
	 * @return int
	 */
	public int recorrerDistancia();
}
