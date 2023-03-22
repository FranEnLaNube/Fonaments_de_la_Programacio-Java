package modulo4;

import java.util.Scanner;

public class M4Ex6_Francisco_SolanaEnClase14nov {

	public static void main(String[] args) {

		/*
		 * Fer un programa que demani a l’usuari/ària quin dia i quin mes va néixer, amb
		 * aquesta informació el programa mostra per pantalla, de quin signe del zodíac
		 * és.
		 * 
		 * Àries-Aries (21.03 — 19.04) Taure-Tauro (20.04 — 20.05) Bessons-Géminis
		 * (21.05 — 20.06) Cranc-Cáncer (21.06 — 22.07) Lleó-Leo (23.07 — 22.08)
		 * Verge-Virgo (23.08 — 22.09) Balança-Libra (23.09 — 22.10) Escorpí-Escorpión
		 * (23.10 — 21.11) Sagitari-Sagitario (22.11 — 21.12) Capricorn-Capricornio
		 * (22.12 — 19.01) Aquari-Acuario (20.01 — 18.02) Peixos-Piscis (19.02 — 20.03)
		 */

		// Podremos hacer un if dentro de un if.
		// Un problema puede ser que cada mes tiene dos signos.

		// Variables
		int dia = 0;
		int mes = 0;
		String signo = "";
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Qué día naciste?");
		dia = entrada.nextInt();
		System.out.println("¿De qué mes, en numeros?");
		mes = entrada.nextInt();
		entrada.close();

		switch (mes) {
		case 1:
			signo = (dia <= 19) ? "Capricornio" : "Acuario";
			break;
		case 2:
			signo = (dia <= 18) ? "Acuario" : "Picsis";
			break;
		case 3:
			signo = (dia <= 20) ? "Picsis" : "Aries";
			break;
		case 4:
			signo = (dia <= 19) ? "Aries" : "Géminis";
			break;
		case 5:
			signo = (dia <= 20) ? "Géminis" : "Cáncer";
			break;
		case 6:
			signo = (dia <= 22) ? "Cáncer" : "Leo";
			break;
		case 7:
			signo = (dia <= 22) ? "Leo" : "Virgo";
			break;
		case 8:
			signo = (dia <= 22) ? "Virgo" : "Libra";
			break;
		case 9:
			signo = (dia <= 22) ? "Libra" : "Escorpio";
			break;
		case 10:
			signo = (dia <= 22) ? "Escorpio" : "Sagitario";
			break;
		case 11:
			signo = (dia <= 21) ? "Sagitario" : "Capricornio";
			break;
		case 12:
			signo = (dia <= 21) ? "Capricornio" : "Acuario";
			break;
		}
		if (signo.equals("")) {
			System.out.println("Has introducido algún dato mal");
		} else {
			System.out.println("Tu signo es " + signo);
		}

	}
}
