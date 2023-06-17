import java.util.ArrayList;
import java.util.Scanner;

public class M8E2Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Hotel> hotels = new ArrayList<Hotel>();

    public static void main(String[] args) {

        System.out.println("Bienvenido al archivo de Hoteles");
        boolean end = false;

        do {
            System.out.println("\n¿Qué quieres hacer?\n1. Crear Hotel." + "\n2. Eliminar hotel." + "\n3. Ver hotel."
                    + "\n4. Modificar hotel." + "\n0. Salir.");
            int option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    crearHotel();
                    break;
                case 2:
                    eliminarHotel();
                    break;
                case 3:
                    verHotel();
                    break;
                case 4:
                    modificarHotel();
                    break;
                case 0:
                    System.out.println("Hasta Luego.");
                    end = true;
            }
        } while (!end);

        input.close();

    }

    public static void crearHotel() {

        // Consiguiendo los datos para después usar en el constructor

        System.out.println("¿Cómo se llama?");
        String nombre = input.nextLine();

        System.out.println("¿Cuántas habitaciones tiene?");
        int nroHab = input.nextInt();

        System.out.println("¿Cuántas plantas tiene?");
        int nroPlantas = input.nextInt();

        System.out.println("¿Cuál es la superficie total?");
        double sup = input.nextDouble();

        Hotel hotel1 = new Hotel(nombre, nroHab, nroPlantas, sup);

        
		hotels.add(hotel1);
    }
    public static void eliminarHotel() {

		System.out.println("¿Cuál querés eliminar?");
		String nombre = input.nextLine();

		int i = findIndex(nombre);

		if (i < 0) {
			System.out.println("El hotel " + nombre + " no se encuentra en la lista.");
		} else {
			System.out.println("El hotel " + hotels.get(i).getNombre() + " ha sido removido de la lista.");
			hotels.remove(i);
		}

	}
    public static void verHotel() {
		System.out.println("¿Cuál querés ver?");
		String nombre = input.nextLine();

		int i = findIndex(nombre);

		if (i < 0) {
			System.out.println("El hotel " + nombre + " no se encuentra en la lista.");
		} else {
			System.out.println(hotels.get(i));
		}
	}
    public static void modificarHotel() {
		boolean finish = true;

		System.out.println("¿Cuál querés modificar?");
		String nombre = input.nextLine();

		int i = findIndex(nombre);

		if (i < 0) {
			System.out.println("El hotel " + nombre + " no se encuentra en la lista.");
		} else {
			do {
				System.out.println("¿Qué quieres modificar?\n1. Habitaciones.\n2. Plantas.\n3. Superficie.");
				int option = 0;
				option = input.nextInt();
				input.nextLine();

				switch (option) {
				case 1:
					System.out.println("¿Cuántas habitaciones tendrá?");
					int nroHab = input.nextInt();
					input.nextLine();
					hotels.get(i).setNroHab(nroHab);
					break;
				case 2:
					System.out.println("¿Cuántas plantas tendrá?");
					int nroPlantas = input.nextInt();
					input.nextLine();
					hotels.get(i).setNroPlantas(nroPlantas);
					break;
				case 3:
					System.out.println("¿Cuánta superficie tendrá?");
					int sup = input.nextInt();
					input.nextLine();
					hotels.get(i).setSup(sup);
					break;
				default:
					System.out.println("Digite un número correcto");
				}
				System.out.println("¿Quieres seguir modificando(SI, NO)");
				String answer = input.nextLine();

				finish = (answer.equalsIgnoreCase("no") ? true : false);
			} while (!finish);
		}
		System.out.println("La modificación se ha realizado.");
	}

    // findIndex funcion que busca la posicion del objeto hotel en el ArrayList a
	// partir de su nombre
	private static int findIndex(String nombre) {

		for (int i = 0; i < hotels.size(); i++) {

			if (hotels.get(i).getNombre().equalsIgnoreCase(nombre)) {
				return i;
			}
		}
		return -1;
	}


}