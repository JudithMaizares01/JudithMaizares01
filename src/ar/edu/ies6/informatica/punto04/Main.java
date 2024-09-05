package ar.edu.ies6.informatica.punto04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero entre [1,9]
        System.out.print("Ingrese un número entero entre 1 y 9: ");
        int numero = scanner.nextInt(); // Leer el número ingresado por el usuario
        
        // Verificar que el número esté dentro del rango válido
        if (numero < 1 || numero > 9) {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 9.");
        } else {
            // Mostrar la tabla de multiplicar del número ingresado
            System.out.println("Tabla de multiplicar del " + numero + ":");
            
            // Usar un bucle for para generar la tabla de multiplicar
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);

	}
        }

	}

}
