//Generador de identificadores único y secuencial.
public class CreadorID {
    //El identificador comienza en 0
	private static int identificatorId = 0;
    //Método para obtener siguiente identificador.
	public static int nextVal(){
        // Devuelve el siguiente valor
		return identificatorId++;
	}

}