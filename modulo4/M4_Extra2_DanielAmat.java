package modulo4;

import java.util.Scanner;

public class M4_Extra2_DanielAmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables:
		int units = 0;
		int decenas = 0;
		String unitsText = "";
		String decenasText = "";
		//String numberAsText = "";
		boolean valid = false;
		
		Scanner resultado = new Scanner(System.in);
		

		System.out.println("Escribe ahora un número de decenas, del 1 al 9: ");
		decenas = resultado.nextInt();
		if ((decenas < 0 || decenas > 9)) {
			System.out.println("Este número esta fuera de rango!");
			}else {
				valid = true;
				}
		if (valid) {
			
		System.out.println("Escribe un número del 0 al 9: ");
		units = resultado.nextInt();
		if ((units < 0 || units > 9)) {
			valid = false;
			System.out.println("Este número esta fuera de rango!");
			}else {
			valid = true;
			}
		}
		
		resultado.close();
		
		if (valid) {
		
		switch (units) {
		    case 0:
		    	if (decenas == 0) {
		    		unitsText = "zero";
		    	}
			 	break;
			case 1:
				unitsText = "un";
			 	break;
			case 2:
				unitsText = "dos";
			 	break;
			case 3:
				unitsText = "tres";
			 	break;
			case 4:
				unitsText = "quatre";
			 	break;
			case 5:
				unitsText = "cinc";
			 	break;
			case 6:
				unitsText = "sis";
			 	break;
			case 7:
				unitsText = "set";
			 	break;
			case 8:
				unitsText = "vuit";
			 	break;
			case 9:
				unitsText = "nou";
			 	break;
				
			
		}
		
		switch(decenas) {
	    case 0:
	    	//System.out.println("zero");
	    	break;
		case 1:
		 	//System.out.println("one");
			switch(units) {
			case 0:
				unitsText = "deu";
				break;
			case 1:
				unitsText = "onze";
				break;
			case 2:
				unitsText = "dotze";
				break;
			case 3:
				unitsText = "tretze";
				break;
			case 4:
				unitsText = "catorze";
				break;
			case 5:
				unitsText = "quinze";
				break;
			case 6:
				unitsText = "setze";
				break;
			case 7:
				unitsText = "disset";
				break;
			case 8:
				unitsText = "divuit";
				break;
			case 9:
				unitsText = "dinou";
				break;
			}
		    break;
		case 2:
			decenasText = "vint";
		 	break;
		case 3:
			decenasText = "treinta";
		 	break;
		case 4:
			decenasText = "quaranta";
		 	break;
		case 5:
			decenasText = "cinquanta";
		 	break;
		case 6:
			decenasText = "seixanta";
		 	break;
		case 7:
			decenasText = "setanta";
		 	break;
		case 8:
			decenasText = "vuitanta";
		 	break;
		case 9:
			decenasText = "noranta";
		 	break;
			
		
	}
		if(decenas < 2) {
			System.out.println(unitsText);
		}else if (decenas >= 2 && units == 0) {
				System.out.println(decenasText);	
					
			}
		else if (decenas == 2) {
				System.out.println(decenasText + "-i-" + unitsText);
		}else {
			System.out.println(decenasText + "-" + unitsText);
		}
		}
		
	}

}
