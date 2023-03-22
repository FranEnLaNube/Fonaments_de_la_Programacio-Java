package modulo4;

import java.util.Scanner;

public class M4Extra1_Francisco_Solana {

	public static void main(String[] args) {
		/*
		 * Fes un programa que pregunti a l'usuari/ària dos nombres enters al qual
		 * anomenaràs dividend i divisor respectivament.
		 * 
		 * El divisor haurà d'estar comprès entre 2 i 7.
		 * 
		 * En cas contrari, el programa haurà de mostrar un missatge d'error.
		 * 
		 * Si el divisor és correcte (2-7) mostra en pantalla si el dividend és múltiple
		 * del divisor, o no.
		 */
		// Variables
		int divisor = 0;
		int dividendo = 0;
		String multiple = "";
		Scanner entrada = new Scanner(System.in);

		// Método de salida
		System.out.println("Di un dividendo.");
		// Método de entrada
		dividendo = entrada.nextInt();
		// Salida
		System.out.println("Ahora di el divisor, que sea entre 2 y 7.");
		// Método de entrada
		divisor = entrada.nextInt();
		entrada.close();

		// logica

		if ((divisor < 2) || (divisor > 7)) {
			System.out.println("Error, fuera de rango.");
		} else {
			multiple = (dividendo % divisor == 0) ? "" : "No ";
			System.out.println(multiple + "es multiple.");

		}
	}
}
