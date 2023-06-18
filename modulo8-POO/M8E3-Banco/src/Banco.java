import java.util.ArrayList;
import java.util.Scanner;
//Corregir bug de que te permite acceder al mismo numero de cuenta pero con nombres de clientes distintos
public class Banco {
    private static ArrayList<Cliente> cliente = new ArrayList<Cliente>();
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
                System.out.println("Hasta luego");
				end = true;
				break;
            case 1:
				pedirDatos();
				Cliente cl = new Cliente(nombre, apellido);
				cliente.add(cl);
				System.out.println("El cliente ha sido agregado");
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
            case 3:
				pedirDatos();
				int idCliente = findIndex(nombre, apellido);
				if (idCliente < 0) {
					System.out.println("El cliente no existe");
				} else {
					Cuenta cuenta1 = new Cuenta(CreadorID.nextVal(), 0);
					cliente.get(idCliente).addCuenta(cuenta1);
					System.out.println("Se creo la cuenta " + cuenta1.getNroCuenta() 
					+ " para el cliente " + nombre + " " + apellido + ".");
                }
                break;
            case 4:
				modificarSaldo(true);
				break;
            case 5:
				modificarSaldo(false);
				break;
            default:
				System.out.println("Digite una opcion correcta");
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
    public static void modificarSaldo(boolean suma) {
		pedirDatos();
		int iClient = findIndex(nombre, apellido);
		if (iClient < 0) {
			System.out.println("El cliente no existe");
		} else {
			System.out.println("Ingrese número de cuenta");
			int nc = input.nextInt();
			input.nextLine();
			Cliente clienteEncontrado = cliente.get(iClient);
			int j = clienteEncontrado.findIndexCuenta(nc);
			if (j < 0) {
				System.out.println("La cuenta no existe");
			} else {
				System.out.println("Cuál es el monto?");
				int deposito = input.nextInt();
				input.nextLine();
				if (!suma) {
					deposito *= -1;
				}
				int saldo = clienteEncontrado.getCuentas().get(j).opSaldo(deposito);
				System.out.println("El saldo actual es " + saldo);
			}
		}
	}
}
