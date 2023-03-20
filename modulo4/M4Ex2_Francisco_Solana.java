package modulo4;

import java.util.Scanner;

public class M4Ex2_Francisco_SolanaEnClase14nov {

	public static void main(String[] args) {

		/*
		 * Aquest programa li demana l’edat a l’usuari/ària, en funció d’aquesta,
		 * mostrarem un dels següents missatges per pantalla:
		 * 
		 * Si té 5 anys o menys: preescolar.
		 * 
		 * Si té entre 6 i 11 anys: primària.
		 * 
		 * Si té entre 12 i 15: ESO.
		 * 
		 * Si té entre 16 i 17: Batxillerat.
		 * 
		 * Si és major d'edat: FP o Universitat.
		 */

		// Variables

		// parece que no está bien hacerlo con switch y sí, parece mucho más fácil así
		// como lo hice

		int edad = 0;
		Scanner edadDicha = new Scanner(System.in);

		System.out.println("¿Qué edad tienes?");
		edad = edadDicha.nextInt();
		edadDicha.close();

		// Logica

		if (edad <= 0) {
			System.out.println("¡No puedes tener menos de cero!");
		} else if (edad <= 5) {
			System.out.println("preescolar");
		} else if ((edad >= 6) && (edad <= 11)) {// Necesitamos finar el límite inferior para asegurarnos no tener
													// falsos positivos. O sea, que no entre en otro por error.
			System.out.println("primaria");
		} else if ((edad >= 12) && (edad <= 15)) {
			System.out.println("Eso");
		} else if ((edad >= 16) && (edad <= 17)) {// Aqui se puede poner con "o".
			System.out.println("Bachillerato");
		} else {// Aca no les gustó poner solo que ponga solo else, porque no validaron al principio.
			
			System.out.println("Universidad");
		}
		/*
		 * switch (edad) { case 0: case 1: case 2: case 3: case 4: case 5:
		 * System.out.println("preescolar"); break; case 6: case 7: case 8: case 9: case
		 * 10: case 11: System.out.println("primaria"); break; case 12: case 13: case
		 * 14: case 15: System.out.println("Eso"); break; case 16: case 17:
		 * System.out.println("Bachillerato"); break; default:
		 * System.out.println("Universidad"); }
		 */
	}
}
