package modulo4;

import java.util.Scanner;

public class M4extra1_Oriol_Lorente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int divident = 0;
        int divisor = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println( "Possa el divisor un numero entre 2 i 7 ");
        divisor = entrada.nextInt();
        System.out.println(" Possa el dividend");
        divident = entrada.nextInt();
        entrada.close();
        if ((divisor >= 2) && (divisor <= 7)){
	        if(	divident % divisor == 0) {
	        	System.out.println(" Es multiple ");
	        } else {
	        	System.out.println(" No es multiple ");
	        }
        }else {
        	System.out.println(" Esta fora de rang ");  
        }
        }
        
        
	}


