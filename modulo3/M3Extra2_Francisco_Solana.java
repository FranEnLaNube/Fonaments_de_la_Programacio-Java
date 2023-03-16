package modulo3;

import java.util.Scanner;

public class M3Extra2_Francisco_Solana {
	public static void main(String[] args) {
		/*
		 * Escriu un programa Java que sol·liciti per pantalla un nombre enter, i si és
		 * menor que 10, ho assigni a una variable de tipus int, anomenada varInt.
		 * 
		 * Si no ho és, llavors li assignarà a la variable varInt el número 1. (Utilitza
		 * per a això l'operador condicional ? :)
		 * 
		 * Després, imprimeix la taula de multiplicar d'aquesta variable.
		 */

		// Variables
		int varInt = 0;
		Scanner entrada = new Scanner(System.in);

		// logica
		System.out.println("Diga un número");
		varInt = entrada.nextInt();
		varInt = varInt < 10 ? varInt : 1;
		entrada.close();
		System.out.println(varInt * 1);
		System.out.println(varInt * 2);
		System.out.println(varInt * 3);
		System.out.println(varInt * 4);
		System.out.println(varInt * 5);
		System.out.println(varInt * 6);
		System.out.println(varInt * 7);
		System.out.println(varInt * 8);
		System.out.println(varInt * 9);
		System.out.println(varInt * 10);
	}

}
