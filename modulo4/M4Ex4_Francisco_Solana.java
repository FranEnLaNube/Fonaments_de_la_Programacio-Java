package modulo4;

import java.util.Scanner;

public class M4Ex4_Francisco_SolanaV1NoSubidaPeroEstaBuena_NoEstaBien {

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

		// int usuario = 0;
		int mes = 0;
		int diasMes = 0;
		String mesATexto = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Di un numero de mes(del 1 al 12)");

		mes = entrada.nextInt();
		if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 8) || (mes == 10) || (mes == 12)) {

			switch (mes) {
			case 1:
				mesATexto = "enero";
				break;
			case 3:
				mesATexto = "marzo";
				break;
			case 5:
				mesATexto = "mayo";
				break;
			case 8:
				mesATexto = "agosto";
				break;
			case 10:
				mesATexto = "octubre";
				break;
			case 12:
				mesATexto = "diciembre";
				break;
			}
			diasMes = 31;
		} else {
			if (mes == 2) {
				mesATexto = "febrero";
				diasMes = 28;
			} else {
				switch (mes) {
				case 4:
					mesATexto = "abril";
					break;
				case 6:
					mesATexto = "junio";
					break;
				case 7:
					mesATexto = "julio";
					break;
				case 9:
					mesATexto = "septiembre";
					break;
				case 11:
					mesATexto = "noviembre";
					break;
				default:
					System.out.println("Di uno entre 1 y 12");
					break;
				}
				diasMes = 30;//Este me lo imprime igual aunque agarre el default
			}
			entrada.close();
		}
		System.out.println(mesATexto + " tiene " + diasMes + " días.");
	}

}
