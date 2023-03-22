package modulo4;

import java.util.Scanner;

public class M4Ex3_Francisco_SolanaEnClase14nov {

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

		/*
		 * Por el enunciado entiedo que siendo menor de edad puede recibir la beca en
		 * caso de que este en el paro. Entonces:
		 */

		// Para entrar en el paro tiene que ser mayor de 16
		// PERO AL FINAL DIJERON QUE ENTRABA EN EL PARO SI TENÍA 18.

		// Variables

		int edad = 0;
		boolean tituloBol;
		boolean enElParoBol;
		boolean edadBol = true;
		String tituloTexto = "";
		String paroTexto;
		//String respuestaSiNo = ""; AL FINAL ESTE NO LO USÈ
		//String pudo = ""; // AGREGARON LA VARIABLE enElParo booleana

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

		if ((enElParoBol) || (tituloBol && edadBol)) {
			System.out.println("Tienes la beca.");
		} else {
			System.out.println("No Tienes la beca.");

			/*
			 * if (edad < 16) { pudo = "No"; } else {
			 * System.out.println("¿Estas en el paro? solo responde \"si\" o \"no\".");
			 * entrada.nextLine(); respuestaSiNo = entrada.nextLine(); respuestaSiNo =
			 * respuestaSiNo.toLowerCase(); switch (respuestaSiNo) { case "si": pudo = "Si";
			 * break; case "no": if (edad >= 18) {
			 * System.out.println("¿Eres graduado universitario?"); respuestaSiNo =
			 * entrada.nextLine(); if (respuestaSiNo.equalsIgnoreCase("Si")) { pudo = "Si";
			 * break; } } pudo = "No"; break; default: System.out.
			 * println("Solamente puedes insertar \"si\" o \"no\", empieza de vuelta.");
			 * pudo = "No"; } }
			 */

			// Salida

			//System.out.println(pudo + " tienes la beca.");
		}
	}
}
