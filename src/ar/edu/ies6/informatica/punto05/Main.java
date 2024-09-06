package ar.edu.ies6.informatica.punto05;


    public class Main {
    public static void main(String[] args) {
    	
        // Creación de un objeto usando el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Datos de Persona 1:");
        persona1.mostrarDatos();
      

        // Creación de un objeto usando el constructor parametrizado
        Persona persona2 = new Persona("12345678", "Juan Pérez", LocalDate.of(1990, 5, 15), "Salta");
        System.out.println("Datos de Persona 2:");
        persona2.mostrarDatos();
        System.out.println();

        // Creación de un objeto usando el constructor con dni, nombre y fecha de nacimiento
        Persona persona3 = new Persona("87654321", "Ana Gómez", LocalDate.of(2005, 8, 25));
        System.out.println("Datos de Persona 3:");
        persona3.mostrarDatos();



	}

}
