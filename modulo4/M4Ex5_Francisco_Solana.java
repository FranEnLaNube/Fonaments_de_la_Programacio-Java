package modulo4;

import java.util.Scanner;

public class M4Ex5_Juan_Andres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Demanar a l'usuari que introdueixi dos números i un operador
		// Representar a pantalla el resultat de l'operació

		int num1 = 0;
		int num2 = 0;
		// String operador = "";
		char operadorChar = ' ';
		Scanner entrada = new Scanner(System.in);

		// Sol·licitud de dades
		System.out.println("Indica un valor inicial");
		num1 = entrada.nextInt();
		System.out.println("Indica un valor pel segon número");
		num2 = entrada.nextInt();
		System.out.println("Quina operació desitges realitzar? (+,-,*,/)");
		// operador = entrada.next(); // versió 1
		operadorChar = entrada.next().charAt(0); // conversió d'string a char
		entrada.close();

		// Oriol
		// O = index 0
		// r = index 1
		// (...)

		// Construcció de la lògica
		/*
		 * - VERSIÓ 1 if( operador.equals("+")){
		 * System.out.println("El resultat de la SUMA és " + (num1 + num2)); } else
		 * if(operador.equals("-")){ System.out.println("El resultat de la RESTA és "+
		 * (num1 - num2)); } else if(operador.equals("*")) {
		 * System.out.println("El resultat de la MULTIPLICACIÓ és "+ (num1 * num2)); }
		 * else if(operador.equals("/")) {
		 * System.out.println("El resultat de la DIVISIÓ és "+ (float)(num1 / num2)); }
		 * else { System.out.println("Introdueix un operador correcte (+,-,*,/)"); }
		 */

		switch (operadorChar) {
		case '+':
			System.out.println("El resultat de la SUMA és " + (num1 + num2));
			break;
		case '-':
			System.out.println("El resultat de la RESTA és " + (num1 - num2));
			break;
		case '*':
			System.out.println("El resultat de la MULTIPLICACIÓ és " + (num1 * num2));
			break;
		case '/':
			System.out.println("El resultat de la DIVISIÓ és " + (float) (num1 / num2));
			break;
		default:
			System.out.println("Introdueix un operador correcte (+,-,*,/)");
			break;

		}

	}

}
