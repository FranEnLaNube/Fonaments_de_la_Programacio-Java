package M4Extra2_Diego_Medina;

import java.util.Scanner;

public class M4Extra2_Diego_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, unidad = 0 , decena = 0;
		Scanner entrada = new Scanner (System.in);
		String tUnidad = "", tDecena = "", tDecena2="";
		

		System.out.println("Introduce un numero entre 0 y 99 : ");
		num = entrada.nextInt();
		
		if(num >= 0 && num <= 99) {
			//Guardo el valor de las unidades
			unidad = num%10;
			num = num/10;
								
			//Guardo el valor de las decenas
			decena = num%10;
			
		
			switch(unidad){
				case 1:
					tUnidad = "uno";
					break;
				case 2: 
					tUnidad = "dos";
					break;
				case 3:
					tUnidad = "tres";
					break;
				case 4: 
					tUnidad = "cuatro";
					break;
				case 5:
					tUnidad = "cinco";
					break;
				case 6: 
					tUnidad = "seis";
					break;
				case 7:
					tUnidad = "siete";
					break;
				case 8: 
					tUnidad = "ocho";
					break;
				case 9: 
					tUnidad = "nueve";
					break;
				case 0: 
					tUnidad = "zero";
					break;
				default: 
					tUnidad = "";
			}//endSwitch 
		
			switch(decena){
				case 1:
					tDecena = "diez";
					break;
				case 2: 
					tDecena = "veinte";
					break;
				case 3:
					tDecena = "treinta";
					break;
				case 4: 
					tDecena = "cuarenta";
					break;
				case 5:
					tDecena = "cincuenta";
					break;
				case 6: 
					tDecena = "sesenta";
					break;
				case 7:
					tDecena = "setenta";
					break;
				case 8: 
					tDecena = "ochenta";
					break;
				case 9: 
					tDecena = "noventa";
					break;
				default: 
					tDecena = "";
			}//endSwitch 
		
		
			if(decena == 0) {
				System.out.println( tUnidad);
			}
			else if ((unidad == 0) && ( decena > 0)){
				
				System.out.println(tDecena);	
			
			}else if(decena == 1){
			
				decena = unidad + 10;
			
				switch(decena){
					case 11:
						tDecena = "once";
						break;
					case 12: 
						tDecena = "doce";
						break;
					case 13:
						tDecena = "tresce";
						break;
					case 14: 
						tDecena = "catorce";
						break;
					case 15:
						tDecena = "quince";
						break;
					case 16: 
						tDecena = "dieciseis";
						break;
					case 17:
						tDecena = "diecisiete";
						break;
					case 18: 
						tDecena = "dieciocho";
						break;
					case 19: 
						tDecena = "diecinueve";
						break;
					default: 
						tDecena = "";
				}//endSwitch 
				System.out.println(tDecena);
			}
			else if( decena > 1) {
				System.out.println(tDecena + " y " + tUnidad);
			}		 

	/*END IF*/}else {
			System.out.println("El número introducido está fuera de rango: " + num);
		}
	
	}//END FUNC MAIN

}//END CLASS
