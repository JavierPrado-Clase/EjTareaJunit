package org.Cuatrovientos.ED.EjTareaJunit12;

import java.util.Random;

/**
 * Generador de IPs aleatorias
 * 
 * @author Javier Peado
 */
public class GeneradorIp {
	/**
	 * Genera un número aleatorio entre los dos parametros que recive
	 * 
	 * @param min
	 * @param max
	 * @return int
	 */
	public int generarNumero(int min, int max) {
		Random rnd = new Random();
		return rnd.nextInt(max - min + 1) + min;
	}

	/**
	 * Genera una IP con cuatro números generados con generarNumero(el primer o
	 * ultimo numero no puede ser 0)
	 * 
	 * @return string
	 */
	public String generarIp() {
		int num1;
		int num2;
		int num3;
		int num4;
		boolean correcto = true;
		do {
			num1 = generarNumero(0, 245);
			if (num1 == 0) {
				correcto = false;
			} else {
				correcto = true;
			}
		} while (!correcto);
		num2 = generarNumero(0, 245);
		num3 = generarNumero(0, 245);
		do {
			num4 = generarNumero(0, 245);
			if (num1 == 0) {
				correcto = false;
			} else {
				correcto = true;
			}
		} while (!correcto);
		return num1 + "." + num2 + "." + num3 + "." + num4;
	}
}
