package src;

public class M8Ex1Main {

   public static void main(String[] args) {
    // Instanciando Ordenador1
    Ordenador ordenador1 = new Ordenador("HP", "ZTW");
    // Imprimiendo para "hacer hablar" al objeto
    System.out.println("Ordenador 1, marca: " + ordenador1.getMarca());
    System.out.println("Ordenador 1, modelo: " + ordenador1.getModelo());
    
    // Instanciando Ordenador2
    Ordenador ordenador2 = new Ordenador("Dell", "XPS", 512, "Intel", 1);
    // Mostrando por pantalla (Imprimir)
    System.out.println("Ordenador 2, marca: " + ordenador2.getMarca()); 
    System.out.println("Ordenador 2, modelo: " + ordenador2.getModelo()); 
    System.out.println("Ordenador 2, memoria de: " + ordenador2.getMemoriaRam()); 
    System.out.println("Ordenador 2, procesador: " + ordenador2.getProcesador()); 
    System.out.println("Ordenador 2, capacidad: " + ordenador2.getCapacidadDisco());
    
    // Probando los Setters
    
    ordenador1.setMemoriaRam(1024);
    ordenador1.setProcesador("Celeron");
    ordenador1.setCapacidadDisco(256);
    
    // Provando que los Setters funcionaron mostrando sus nuevos atributos

    System.out.println("Ordenador 2, memoria de: " + ordenador2.getMemoriaRam()); 
    System.out.println("Ordenador 2, procesador: " + ordenador2.getProcesador()); 
    System.out.println("Ordenador 2, capacidad: " + ordenador2.getCapacidadDisco());
    
    // Provando el método programaEnEjecucion
    
    System.out.println(ordenador1.programaEnEjecucion("VSC"));
    
    // Provando el toString()
    System.out.println(ordenador1.toString());
    //Y para el segundo ordenador:     
    System.out.println(ordenador2.toString());
    }
    
}
