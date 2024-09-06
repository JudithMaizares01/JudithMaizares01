package ar.edu.ies6.informatica.punto05.model;


	import java.time.LocalDate;
	import java.time.Period;

	public class Persona {
	    private String dni;
	    private String nombre;
	    private LocalDate fechaNacimiento;
	    private String provincia;

	    // Constructor por defecto
	    public Persona() {
	        this.dni = "";
	        this.nombre = "";
	        this.fechaNacimiento = LocalDate.now();
	        this.provincia = "Jujuy";
	    }

	    // Constructor parametrizado
	    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = provincia;
	    }

	    // Constructor con dni, nombre y fecha de nacimiento
	    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.provincia = "Jujuy";
	    }

	    // Métodos accesores (getters y setters)
	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public LocalDate getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public String getProvincia() {
	        return provincia;
	    }

	    public void setProvincia(String provincia) {
	        this.provincia = provincia;
	    }

	    // Método para calcular la edad
	    public int calcularEdad() {
	        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
	    }

	    // Método para verificar si es mayor de edad
	    public boolean esMayorDeEdad() {
	        return calcularEdad() >= 18;
	    }

	  
	  
	    
	

	}


