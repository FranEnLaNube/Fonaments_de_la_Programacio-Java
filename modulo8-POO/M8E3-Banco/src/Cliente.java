import java.util.ArrayList;

public class Cliente {
    // Atributos
    private String nombre;
    private String apellido;
    // Array de cuentas con objetos Cuenta dentro, inicializado en 0 cuentas
    static ArrayList <Cuenta> cuentas = new ArrayList<Cuenta>(0);
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // Método para agregar cuentas al ArrayList
    public void addCuenta(Cuenta c) {
        cuentas.add(c);
    }
    // Método para encontrar el índice en el Array donde está la cuenta buscada
    public int findIndexCuenta(int nroCuenta) {
        // Bucle para recorrer el Array
        for (int i = 0; i < cuentas.size(); i++) {
            // Si encuentra la cuenta devuelve el índice, si no no.
			if (nroCuenta==cuentas.get(i).getNroCuenta()) {
				return i;
			}
		}
		return -1;
    }
}
