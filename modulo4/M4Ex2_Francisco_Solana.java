package modulo4;

import java.util.Scanner;

public class M4Ex2_Francisco_Solana {

	public static void main(String[] args) {

		/*
		 * Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta,
		 * mostrarem un dels següents missatges per pantalla:
		 * 
		 * Si té 5 anys o menys: preescolar.
		 * 
		 * Si té entre 6 i 11 anys: primària.
		 * 
		 * Si té entre 12 i 15: ESO.
		 * 
		 * Si té entre 16 i 17: Batxillerat.
		 * 
		 * Si és major d'edat: FP o Universitat.
		 */

		// Variables

		int edad = 0;
		Scanner edadDicha = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		edad = edadDicha.nextInt();
		edadDicha.close();

		// Logica

		if (edad <= 0) {
			System.out.println("¡No puedes tener menos de cero!");
		} else if (edad <= 5) {
			System.out.println("preescolar");
		} else if ((edad >= 6) && (edad <= 11)) {
			System.out.println("primaria");
		} else if ((edad >= 12) && (edad <= 15)) {
			System.out.println("Eso");
		} else if ((edad >= 16) && (edad <= 17)) {
			System.out.println("Bachillerato");
		} else {

			System.out.println("Universidad");
		}

	}
}
