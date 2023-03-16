package modulo3;

import java.util.Scanner;

public class M3Extra1_Francisco_Solana {

	public static void main(String[] args) {
		/*Escriu un programa Java que lea un nombre enter per teclat i obté 
		 * i mostra per pantalla el doble i el triple d'aquest número.*/

		//Variables
		int num1 = 0;
		int resultado = 0;
		Scanner entrada = new Scanner(System.in);
		
		//logica
		System.out.println("tirá un numero");
		num1 = entrada.nextInt();
		resultado = 2 * num1;
		entrada.close();
		
		System.out.print("el doble es " + resultado);
		resultado = 3 * num1;
		System.out.println(" y el triple es " + resultado);
	}

}
