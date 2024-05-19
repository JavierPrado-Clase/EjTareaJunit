package org.Cuatrovientos.ED.EjTareaJunit22;

import java.util.ArrayList;
import java.util.Random;

/**
 * Tipo de Transporte
 * 
 * @author Javier Peado
 */
public class Camioneta implements Transporte {

	private ArrayList<Paquete> listaPaquetes;

	/**
	 * Constructor
	 */
	public Camioneta() {
		listaPaquetes = new ArrayList<Paquete>();
	}

	/**
	 * Añade un paquete a la Camioneta
	 * 
	 * @param paquete
	 */
	@Override
	public void incluirPaquete(Paquete paquete) {
		listaPaquetes.add(paquete);
	}

	/**
	 * Devuelve el peso total de la Camioneta
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
		return rnd.nextInt(100 - 70 + 1) + 70;
	}

	public ArrayList<Paquete> getListaPaquetes() {
		return listaPaquetes;
	}

	public void setListaPaquetes(ArrayList<Paquete> listaPaquetes) {
		this.listaPaquetes = listaPaquetes;
	}

}
