package modulo3;

import java.util.Scanner;

public class M3Ex2_Francisco_Solana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		int num1 = 0;
		int num2 = 0;
		Scanner entrada = new Scanner(System.in);

		//Lógica
		System.out.println("Ingrese un número");
		num1 = entrada.nextInt();
		System.out.println("Ingrese otro número");
		num2 = entrada.nextInt();
		entrada.close();
		
		//Visualización
		System.out.println("la suma da " + (num1 + num2));
		System.out.println("la resta da " + (num1 - num2));
		System.out.println("la multiplicación da " + (num1 * num2));
		System.out.println("la división da " + ((double)num1 / num2));
		}

}
