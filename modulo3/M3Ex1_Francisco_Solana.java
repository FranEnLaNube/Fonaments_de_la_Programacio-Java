package modulo3;

import java.util.Scanner;

public class M3Ex1_Francisco_Solana {

	public static void main(String[] args) {
		
		// Variables
		String nombre = "";
		String apellido = "";
		int edad = 0;
		Scanner entrada = new Scanner(System.in);

		// Lógica
		System.out.println("Diga su nombre");
		nombre = entrada.nextLine();
		
		System.out.println("Diga su apellido");
		apellido = entrada.nextLine();
		
		System.out.println("Diga su edad");
		edad = entrada.nextInt();
		
		entrada.close();

		// Visualización
		System.out.println("Soy " + nombre + " " + apellido + " y tengo " + edad + " años.");
	}

}
