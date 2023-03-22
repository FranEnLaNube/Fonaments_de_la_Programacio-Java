package modulo4;

import java.util.Scanner;

public class M4Ex3_Francisco_SolanaV2 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO. Una escola d’idiomes concedeix beques a futurs estudiants si
		 * compleixen una sèrie de requisits.
		 * 
		 * A l'alumne/a se li assigna una beca si és major d’edat i si té un títol
		 * universitari. O també se li assigna una beca si l’alumne/a està a l’atur.
		 * 
		 * El programa demana les tres dades per pantalla i en finalitzar mostra si
		 * l’alumne/a té la beca o no.
		 */

		// Variables

		int edad = 0;
		boolean tituloBol;
		boolean enElParoBol;
		boolean edadBol = true;
		String tituloTexto = "";
		String paroTexto;

		Scanner entrada = new Scanner(System.in);

		// Logica

		// Solicitud den información
		// 1ra variable
		System.out.println("¿Estás en el paro?");
		paroTexto = entrada.next();
		// 2da Variable
		System.out.println("¿Qué edad tienes?");
		edad = entrada.nextInt();
		System.out.println("¿Eres graduado universitario?");
		// edad = entrada.nextInt();
		tituloTexto = entrada.next();
		entrada.close();

		// Conversiones

		enElParoBol = (paroTexto.equalsIgnoreCase("si")) ? true : false;
		tituloBol = (tituloTexto.equalsIgnoreCase("si")) ? true : false;
		edadBol = (edad >= 18) ? true : false;

		// Salida

		if ((enElParoBol) || (tituloBol && edadBol)) {
			System.out.println("Tienes la beca.");
		} else {
			System.out.println("No Tienes la beca.");
		}
	}
}
