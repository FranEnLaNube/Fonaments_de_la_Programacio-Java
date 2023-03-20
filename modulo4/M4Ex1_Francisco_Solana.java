package francisco;

import java.util.Scanner;

public class M4Ex1_Francisco_Solana {

	public static void main(String[] args) {
		
		// Variables
		String nombre = "";
		String apellido = "";
		int edad = 0;
		String mayoria = "";
		Scanner entrada = new Scanner(System.in);

		// Lógica
		System.out.println("Diga su nombre");
		nombre = entrada.nextLine();
		
		System.out.println("Diga su apellido");
		apellido = entrada.nextLine();
		
		System.out.println("Diga su edad");
		edad = entrada.nextInt();
		
		entrada.close();
		
		mayoria = edad >= 18 ? "mayor" : "menor";

		// Visualización
		System.out.println(nombre + " " + apellido + ", es " + mayoria + " de edad");
	}

}
