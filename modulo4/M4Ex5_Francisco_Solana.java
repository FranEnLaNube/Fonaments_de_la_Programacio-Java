package modulo4;

import java.util.Scanner;

public class M4Ex5_Francisco_SolanaEnClase14nov {

	public static void main(String[] args) {

		/*
		 * Fer un programa que demani dos números i un operador(+,-,*,/).
		 * 
		 * Al final, el programa ha d'imprimir per pantalla el resultat de fer
		 * l’operació que contingui la variable operador.
		 */

		int num1 = 0;
		int num2 = 0;
		//String operador = "";
		char operadorChar = ' ';
		Scanner entrada = new Scanner(System.in);

		// Solicito al usuario

		System.out.println("Indica un valor inicial");
		num1 = entrada.nextInt();
		System.out.println("Indica un valor para el segundo numero");
		num2 = entrada.nextInt();
		System.out.println("¿Qué operación deseas realizar (+, -, *, /)");
		// operador = entrada.next();
		// HAREMOS UN METODO PROPIO DEL STRING PARA CREAR VARIABLE CHAR
		operadorChar = entrada.next().charAt(0); // Conversión de String a char.
		// los caracteres se numeran del 0 en adelante, por el orden de la palabra, pe.
		// para carlos, c es 0.
		// Los espacios en blanco también cuentan.
		entrada.close();

		// Logica
		/*
		 * VERSION 1 if(operador.equals("+")) {
		 * System.out.println("El resultado de la suma es " + (num1 + num2));
		 * 
		 * } else if(operador.equals("-")) {
		 * System.out.println("El resultado de la resta es " + (num1 - num2)); } else
		 * if(operador.equals("*")) {
		 * System.out.println("El resultado de la multiplicación es " + (num1 * num2));
		 * } else if(operador.equals("/")) {
		 * System.out.println("El resultado de la división es " + (num1 / num2)); } else
		 * { System.out.println("Solo puedes escribir +, -, * o /");
		 */
		//VERSION 2
		switch (operadorChar) {
		case '+':
			System.out.println("El resultado de la suma es " + (num1 + num2));
			break;
		case '-':
			System.out.println("El resultado de la resta es " + (num1 - num2));
			break;
		case '*':
			System.out.println("El resultado de la multiplicación es " + (num1 * num2));
			break;
		case '/':
			System.out.println("El resultado de la división es " + (num1 / num2));
			break;
		default:
			System.out.println("Ingresa un operador correcto (+, -, * o /4)");

		}
	}
}
