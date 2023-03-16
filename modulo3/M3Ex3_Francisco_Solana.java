package modulo3;

import java.util.Scanner;

public class M3Ex3_Francisco_Solana {

	public static void main(String[] args) {

		// Variables
		int notaMat = 0;
		int notaHis = 0;
		int notaBio = 0;
		float promedio = 0f;
		Scanner entrada = new Scanner(System.in);

		// Lógica

		System.out.println("¿Qué nota sacaste en matematica?");
		notaMat = entrada.nextInt();
		System.out.println("¿Qué tal en Historia?");
		notaHis = entrada.nextInt();
		System.out.println("¿Y en Biologia?");
		notaBio = entrada.nextInt();
		entrada.close();

		promedio = (float) (notaMat + notaHis + notaBio) / 3;

		// Visualizacion
		System.out.println("Tu promedio es " + promedio);
	}

}
