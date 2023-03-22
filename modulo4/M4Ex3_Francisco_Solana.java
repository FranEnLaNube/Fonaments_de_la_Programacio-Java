package modulo4;

import java.util.Scanner;

public class M4Ex3_Francisco_Solana {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO. 
		 * Una escola d’idiomes concedeix beques a futurs estudiants si
		 * compleixen una sèrie de requisits.
		 * 
		 * A l'alumne/a se li assigna una beca si és major d’edat i si té un títol
		 * universitari. O també se li assigna una beca si l’alumne/a està a l’atur.
		 * 
		 * El programa demana les tres dades per pantalla i en finalitzar mostra si
		 * l’alumne/a té la beca o no.
		 */

		/*
		 * Por el enunciado entiedo que siendo menor de edad puede recibir la beca en
		 * caso de que este en el paro. Entonces:
		 */

		// Para entrar en el paro tiene que ser mayor de 16

		// Variables

		int edad = 0;
		String respuestaSiNo = "";
		String pudo = "";

		Scanner entrada = new Scanner(System.in);

		// Logica

		System.out.println("¿Qué edad tienes?");

		edad = entrada.nextInt();
		if (edad < 16) {
			pudo = "No";
		} else {
			System.out.println("¿Estas en el paro? solo responde \"si\" o \"no\".");
			entrada.nextLine();
			respuestaSiNo = entrada.nextLine();
			respuestaSiNo = respuestaSiNo.toLowerCase();
			switch (respuestaSiNo) {
			case "si":
				pudo = "Si";
				break;
			case "no":
				if (edad >= 18) {
					System.out.println("¿Eres graduado universitario?");
					respuestaSiNo = entrada.nextLine();
					if (respuestaSiNo.equalsIgnoreCase("Si")) {
						pudo = "Si";
						break;
					}
				}
				pudo = "No";
				break;
			default:
				System.out.println("Solamente puedes insertar \"si\" o \"no\", empieza de vuelta.");
				pudo = "No";
			}
		}

		// Salida

		System.out.println(pudo + " tienes la beca.");
		entrada.close();
	}
}
