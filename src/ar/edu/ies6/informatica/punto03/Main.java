package ar.edu.ies6.informatica.punto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear una instancia de Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
       
        
        System.out.print("Ingrese un número entero entre 0 y 10: ");
        int numero = scanner.nextInt(); //leer el numero
        
        // Verificar que el número esté dentro del rango válido
        if (numero < 0 || numero > 10) {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 10.");
        } else {
            // Calculamos el factorial utilizando while
            int factorial = 1; 
            int i = numero;
            
            while (i > 1) {
                factorial *= i;
                i--;
            }
            
            // Mostramos el resultado por consola
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        scanner.close();

	}

}
