package src;

public class Ordenador {

    //Atributos

    private String marca;
    private String modelo;
    private String procesador;
    private int memoriaRam;
    private int capacidadDisco;

    //Constructores

    //Const. que recibe todos los atributos de la clase Ordenador
    
    public Ordenador (String marca, String modelo, int memoriaRam, String procesador, int capacidadDisco) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.capacidadDisco = capacidadDisco;
    }
    //Constructor que recibe solo marca y modelo

    public Ordenador (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // Métodos de consulta y modificación **Getters y Setters**
    
    // Getters (para todos los atributos)
    public String getMarca() {
        return marca;
    }
    public String getModelo () {
        return modelo;
    }
    public int getMemoriaRam () {
        return memoriaRam;
    }
    public String getProcesador() {
        return procesador;
    }
    public int getCapacidadDisco() {
        return capacidadDisco;
    }
    //Setters (en este caso solo para procesador, memoria y capacidad)
        // Que serviran para asignarle valor a los atributos que quedaron fuera en el const de 2 parámetros

    public void setProcesador (String procesador) {
        this.procesador = procesador;
    }
    public void setMemoriaRam (int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public void setCapacidadDisco (int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    // Método para mostrar programa en ejecución, pasado por parámetro

    public String programaEnEjecucion (String programa) {
        return "En este momento se está ejecutando " + programa;
    }

    // Método toString(), que se encgarga de dar los valores almacenados en las variables como String
    public String toString() {
        return "Este ordenador es un " + this.marca + ", modelo " + this.modelo + " con " + this.memoriaRam + " de memoria Ram y " + this.capacidadDisco + " de capacidad.";
    }
}
