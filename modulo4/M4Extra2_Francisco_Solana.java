package modulo4;

import java.util.Scanner;

public class M4_Extra2_Francisco_Solana {

	public static void main(String[] args) {
		
		// Variables:
		int unidad = 0;
		int decena = 0;
		String textoUnidad = "";
		String textoDecena = "";
		boolean valid = true;

		Scanner resultado = new Scanner(System.in);

		System.out.println("Escribe un número de decena, del 0 al 9: ");
		decena = resultado.nextInt();
		if ((decena < 0 || decena > 9)) {
			valid = false;
			System.out.println("Este número esta fuera de rango!");
		}

		if (valid) {
			System.out.println("Escribe ahora un número del 0 al 9: ");
			unidad = resultado.nextInt();
			if ((unidad < 0 || unidad > 9)) {
				valid = false;
				System.out.println("Este número esta fuera de rango!");
			}
		}

		resultado.close();

		if (valid) {

			switch (unidad) {
			case 0:
				if (decena == 0) {
					textoUnidad = "cero";
				}
				break;
			case 1:
				textoUnidad = "uno";
				break;
			case 2:
				textoUnidad = "dos";
				break;
			case 3:
				textoUnidad = "tres";
				break;
			case 4:
				textoUnidad = "cuatro";
				break;
			case 5:
				textoUnidad = "cinco";
				break;
			case 6:
				textoUnidad = "seis";
				break;
			case 7:
				textoUnidad = "siete";
				break;
			case 8:
				textoUnidad = "ocho";
				break;
			case 9:
				textoUnidad = "nueve";
				break;

			}

			switch (decena) {
			case 0:
				break;
			case 1:
				switch (unidad) {
				case 0:
					textoUnidad = "diez";
					break;
				case 1:
					textoUnidad = "once";
					break;
				case 2:
					textoUnidad = "doce";
					break;
				case 3:
					textoUnidad = "trece";
					break;
				case 4:
					textoUnidad = "catorce";
					break;
				case 5:
					textoUnidad = "quince";
					break;
				case 6:
					textoUnidad = "dieciseis";
					break;
				case 7:
					textoUnidad = "diecisiete";
					break;
				case 8:
					textoUnidad = "dieciocho";
					break;
				case 9:
					textoUnidad = "diecinueve";
					break;
				}
				break;
			case 2:
				textoDecena = (unidad == 0) ? "veinte" : "veinti";
				break;
			case 3:
				textoDecena = "treinta";
				break;
			case 4:
				textoDecena = "cuarenta";
				break;
			case 5:
				textoDecena = "cincuenta";
				break;
			case 6:
				textoDecena = "sesenta";
				break;
			case 7:
				textoDecena = "setenta";
				break;
			case 8:
				textoDecena = "ochenta";
				break;
			case 9:
				textoDecena = "noventa";
				break;

			}
			if (decena < 2) {
				System.out.println(textoUnidad);
			} else if (decena >= 2 && unidad == 0) {
				System.out.println(textoDecena);

			} else if (decena == 2) {

				System.out.println(textoDecena + textoUnidad);
			} else {
				System.out.println(textoDecena + " y " + textoUnidad);
			}
		}

	}

}
