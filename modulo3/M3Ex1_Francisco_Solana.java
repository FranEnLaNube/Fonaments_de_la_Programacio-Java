package modulo3;

import java.util.Scanner;

public class M3Ex1_Francisco_Solana_subido_antes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		String nombre;
		String apellido;
		int edad;
		Scanner entrada = new Scanner(System.in);
		
		//Lógica
		System.out.println("Diga su nombre");
		nombre = entrada.nextLine();
		System.out.println("Diga su apellido");
		apellido = entrada.nextLine();
		System.out.println("Diga su edad");
		edad = entrada.nextInt();
		entrada.close();
		
		
		//Visualización
		System.out.println("Soy " + nombre + " " + apellido + " y tengo " + edad + " años.");
	}

}
