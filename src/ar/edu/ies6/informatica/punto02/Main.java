package ar.edu.ies6.informatica.punto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     
	       
	       // Solicitar al usuario que ingrese un número entero
	       System.out.print("Ingrese un número entero: ");
	       int numero = scanner.nextInt(); 
	       
	       // Verificar si el número es par o impar
	       
	       if (numero % 2 == 0) {
	           // El número es par
	       	
	           System.out.println("El número es par. El triple del número es: " + (numero * 3));
	       } else {
	       	
	           // El número es impar
	       	
	           System.out.println("El número es impar. El doble del número es: " + (numero * 2));
	       }
	       
	       scanner.close();

		}

	


	}


