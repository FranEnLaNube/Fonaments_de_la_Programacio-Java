package modulo3;

import java.util.Scanner;

public class M3Extra3_Francisco_Solana11NovOk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio Escriu un programa Java que calculi cuantos litros necesito para
		 * pintar una pared rectangular.
		 * 
		 * Un litre de pintura cobreix 12 m² en una sola mà.
		 * 
		 * Crea una constant anomenada coberturaLitro per a guardar la dada de cobertura
		 * de la pintura (12 m²) Hauràs de demanar a l'usuari/ària: - L'alt i ample de
		 * la paret (multiplicant sabràs l'àrea de la mateixa) - El número de manos a
		 * aplicar
		 * 
		 * Mostra en pantalla els litres de pintura a utilitzar.
		 */

		// Variables
		final int COBERTURALITRO = 12;

		float altura = 0f;
		float ancho = 0f;
		int manos = 0;
		float area = 0f;
		float litrosResultado = 0f;

		Scanner entrada = new Scanner(System.in);
		// Logica
		System.out.println("Diga la altura de la pared");
		altura = entrada.nextFloat();
		System.out.println("Ahora el ancho");
		ancho = entrada.nextFloat();
		System.out.println("¿Cuantas manos quiere darle?");
		manos = entrada.nextInt();
		entrada.close();

		area = altura * ancho;
		litrosResultado = area * manos / COBERTURALITRO;
		System.out.println("necesitará " + litrosResultado + " litros de pintura");

	}

}
