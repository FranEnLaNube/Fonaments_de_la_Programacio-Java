package modulo4;

import java.util.Scanner;

public class M4Ex4_Francisco_Solana {

	public static void main(String[] args) {

		/*
		 * L’usuari/ària introdueix un mes per pantalla i mitjançant un switch amb els
		 * 12 mesos de l’any, el programa calcula els dies del mes i mostra el següent:
		 * 
		 * Exemple: Si el número introduït és 1, llavors ha d'aparèixer per pantalla:
		 * “El mes de gener té 31 dies”
		 * 
		 */

		// Variables

		int mes = 0;
		String respuesta = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Di un numero de mes(del 1 al 12)");
		mes = entrada.nextInt();
		entrada.close();

		// Logica

		switch (mes) {
		case 1:
			respuesta = "Enero tiene 31 días";
			break;
		case 2:
			respuesta = "Febrero tiene 28 días";
			break;
		case 3:
			respuesta = "Marzo tiene 31 días";
			break;
		case 4:
			respuesta = "Abril tiene 30 días";
			break;
		case 5:
			respuesta = "Mayo tiene 31 días";
			break;
		case 6:
			respuesta = "Junio tiene 30 días";
			break;
		case 7:
			respuesta = "Julio tiene 30 días";
			break;
		case 8:
			respuesta = "Agosto tiene 31 días";
			break;
		case 9:
			respuesta = "Septiembre tiene 30 días";
			break;
		case 10:
			respuesta = "Octubre tiene 31 días";
			break;
		case 11:
			respuesta = "Noviembre tiene 30 días";
			break;
		case 12:
			respuesta = "Diciembre tiene 31 días";
			break;
		default:
			respuesta = "Solo puedes ingresar entre 1 y 12";
			break;
		}

		// Salida

		System.out.println(respuesta);
	}
}