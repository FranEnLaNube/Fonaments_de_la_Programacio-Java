public class Hotel {

    //Atributos

    private String nombre = "";
    private int nroHab = 0;
    private int nroPlantas = 0;
    private double sup = 0;

    // Constructor 

    public Hotel(String nombre, int nroHab, int nroPlantas, double sup) {
        this.nombre = nombre;
        this.nroHab = nroHab;
        this.nroPlantas = nroPlantas;
        this.sup = sup;
    }
    // Getters y Setters

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNroHab(int nroHab) {
        this.nroHab = nroHab; 
    }
    public void setNroPlantas(int nroPlantas) {
        this.nroPlantas = nroPlantas;
    }
    public void setSup(double sup) {
        this.sup = sup;
    }
    
    // Getters

    public String getNombre() {
        return nombre;
    }
    public int getNroHab() {
        return nroHab;
    }
    public int getNroPlantas() {
        return nroPlantas;
    }
    public double getSup() {
        return sup;
    }

    // Método para calcular el mantenimiento
    private String calcularMant() {
        // 20 habitaciones puede limpiar una persona
        // cada persona gana 1500 euros
        // El método debe devolver cuantas personas necesita el hotel y cuánto le saldrá

        // Primero calculamos cuantas personas necesitamos
        
        int personal = nroHab / 20;
        // Redondeando para arriba en caso de que no de exacto
		personal = (nroHab % 20 == 0) ? personal : personal + 1;
		// Otra manera pero truncando, o sea, ajustando personal
		personal = (personal > 0) ? personal : 1;
        
        // Y calculamos cuánto le cuesta al hotel
        float costoPersonal = personal * 1500;
        // Salida
        return "El hotel necesita " + personal + " empleados, lo que le costará " + costoPersonal + " euros.";
    }

    // Método toString() para devolver como texto los valores de las variables.
    
    public String toString() {
        return "El hotel " + nombre + " tiene " + nroHab + " repartidas en " + nroPlantas + " plantas, con una superficie total de " + sup + " metros cuadrados." + calcularMant();
    }

}
