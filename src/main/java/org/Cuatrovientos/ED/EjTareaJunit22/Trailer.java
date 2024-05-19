package org.Cuatrovientos.ED.EjTareaJunit22;

import java.util.ArrayList;
import java.util.Random;

/**
 * Tipo de Transporte
 * 
 * @author Javier Peado
 */
public class Trailer implements Transporte {

	private ArrayList<Paquete> listaPaquetes;

	/**
	 * Constructor
	 */
	public Trailer() {
		listaPaquetes = new ArrayList<Paquete>();
	}

	/**
	 * Añade un paquete al Trailer
	 * 
	 * @param paquete
	 */
	@Override
	public void incluirPaquete(Paquete paquete) {
		listaPaquetes.add(paquete);
	}

	/**
	 * Devuelve el peso total de el Trailer
	 * 
	 * @return float
	 */
	@Override
	public float pesoTotal() {
		float total = 0f;
		for (Paquete paquete : listaPaquetes) {
			total += paquete.getPreso();
		}
		return total;
	}

	/**
	 * Recorre una distancia aleatoria
	 * 
	 * @return int
	 */
	@Override
	public int recorrerDistancia() {
		Random rnd = new Random();
		return rnd.nextInt(300 - 270 + 1) + 270;
	}

	public ArrayList<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}

	public void setListaPaquetes(ArrayList<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}

}
