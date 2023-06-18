import java.util.Scanner;

public class Banco {

    private static Scanner input = new Scanner(System.in);
    private static String nombre = "";
	private static String apellido = "";
    
    public static void main(String[] args) {
        System.out.println("Bienvenido.");
        // Variables a usar
        boolean end = false;
		int option = 0;
        do {
			System.out.println("¿Qué quieres hacer?");
            System.out.println("0. Salir.\n" + "1. Crear cliente/a.\n" + "2. Eliminar cliente/a.\n"
					+ "3. Crear cuenta de cliente/a.\n" + "4. Ingresar euros en una cuenta de client/a.\n"
					+ "5. Retirar euros de una cuenta de cliente.");
            // Escaneamos el imput y lo metemos dentro de option
            option = input.nextInt();
            // Para vaciar el imput
            input.nextLine();
            switch (option) {
			case 0:
                System.out.println("hasta luego");
				end = true;
				break;
			case 2:
				pedirDatos();
				int i = findIndex(nombre, apellido);
				if (i < 0) {
					System.out.println("El cliente no existe");
				} else {
					cliente.remove(i);
					System.out.println("El cliente ha sido eliminado");
				}
				break;
            }
        } while (end == false);
    }
    private static void pedirDatos() {
		System.out.println("Cual es el nombre del cliente");
		nombre = input.nextLine();
		System.out.println("¿Y el Apellido?");
		apellido = input.nextLine();
	}
    private static int findIndex(String nombre, String apellido) {

		for (int i = 0; i < cliente.size(); i++) {

			if (nombre.equalsIgnoreCase(cliente.get(i).getNombre())
					&& (apellido.equalsIgnoreCase(cliente.get(i).getApellido()))) {
				return i;
			}
		}
		return -1;
	}
}
