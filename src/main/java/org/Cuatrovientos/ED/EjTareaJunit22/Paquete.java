package org.Cuatrovientos.ED.EjTareaJunit22;

/**
 * Paquete de un transporte
 * 
 * @author Javier Peado
 */
public class Paquete {
	private String destino;
	private float peso;

	/**
	 * Constructor
	 * 
	 * @param destino
	 * @param preso
	 */
	public Paquete(String destino, float preso) {
		this.destino = destino;
		this.peso = preso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getPreso() {
		return peso;
	}

	public void setPreso(float preso) {
		this.peso = preso;
	}

	@Override
	public String toString() {
		return "Destino paquete: " + destino + ", peso: " + peso;
	}

}
