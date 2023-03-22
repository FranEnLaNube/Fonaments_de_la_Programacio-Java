package modulo4;

import java.util.Scanner;

public class M4_Extra2_DanielAmatConMetodos {

	public static void main(String[] args) {
		int u = 0;// unidades
		int d = 0;// decenas

		Scanner numeroEntrado = new Scanner(System.in);

		System.out.println("Escribe un número de decenas, del 0 al 9: ");
		d = numeroEntrado.nextInt();// d, de decenas, toma el valor del scanner

		System.out.println("Escribe ahora un número de unidades, del 0 al 9: ");
		u = numeroEntrado.nextInt();

		pasarATexto(u, d);// Acá se llama a la función pasarATexto
		// y la completamos con los valores de u y d del Scanner.

		numeroEntrado.close();
	}

	public static void pasarATexto(int units, int decenas) {
		// aquí se crea la función "pasarATexto"
		// que es la de antes pero ahora con nombre de funcion.
		// Y está más abajo

		// Variables:
		String textoUnidad = "";
		String textoDecenas = "";
		boolean valid = false;

		// Validaciones

		if ((decenas < 0 || decenas > 9)) {
			System.out.println("Uno de los dos números esta fuera de rango!");
		} else {
			valid = true;
		}
		if (valid) {

			if ((units < 0 || units > 9)) {
				valid = false;
				System.out.println("Uno de los dos números esta fuera de rango!");
			} else {
				valid = true;
			}
		}
		// Lógica

		if (valid) {

			switch (units) {
			case 0:
				if (decenas == 0) {
					textoUnidad = "zero";
				}
				break;
			case 1:
				textoUnidad = "un";
				break;
			case 2:
				textoUnidad = "dos";
				break;
			case 3:
				textoUnidad = "tres";
				break;
			case 4:
				textoUnidad = "quatre";
				break;
			case 5:
				textoUnidad = "cinc";
				break;
			case 6:
				textoUnidad = "sis";
				break;
			case 7:
				textoUnidad = "set";
				break;
			case 8:
				textoUnidad = "vuit";
				break;
			case 9:
				textoUnidad = "nou";
				break;
			}

			switch (decenas) {
			case 0:
				// System.out.println("zero");
				break;
			case 1:
				// System.out.println("one");
				switch (units) {
				case 0:
					textoUnidad = "deu";
					break;
				case 1:
					textoUnidad = "onze";
					break;
				case 2:
					textoUnidad = "dotze";
					break;
				case 3:
					textoUnidad = "tretze";
					break;
				case 4:
					textoUnidad = "catorze";
					break;
				case 5:
					textoUnidad = "quinze";
					break;
				case 6:
					textoUnidad = "setze";
					break;
				case 7:
					textoUnidad = "disset";
					break;
				case 8:
					textoUnidad = "divuit";
					break;
				case 9:
					textoUnidad = "dinou";
					break;
				}
				break;
			case 2:
				textoDecenas = "vint";
				break;
			case 3:
				textoDecenas = "treinta";
				break;
			case 4:
				textoDecenas = "quaranta";
				break;
			case 5:
				textoDecenas = "cinquanta";
				break;
			case 6:
				textoDecenas = "seixanta";
				break;
			case 7:
				textoDecenas = "setanta";
				break;
			case 8:
				textoDecenas = "vuitanta";
				break;
			case 9:
				textoDecenas = "noranta";
				break;
			}
			if (decenas < 2) {
				System.out.println(textoUnidad);
			} else if (decenas >= 2 && units == 0) {
				System.out.println(textoDecenas);

			} else if (decenas == 2) {
				System.out.println(textoDecenas + "-i-" + textoUnidad);
			} else {
				System.out.println(textoDecenas + "-" + textoUnidad);
			}
		}
	}
}
