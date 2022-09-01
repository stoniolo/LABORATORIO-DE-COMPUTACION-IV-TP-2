package ejercicio1;

public class Empleado {

	//Attributes
	
	private final int id;
	private String nombre;
	private int edad;
	
	static int count=999;
	
	//métodos
	public static int devuelveProximoID()
	{
		return count+1;
	}
	
	@Override
	public String toString() {
		return "Empleado ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad;
	}
	
	//Constructors
	
	public Empleado() 
	{
		count++;
		id = count;
		nombre = "Sin nombre";
		edad = 99;
	}
	
	public Empleado(String nombre, int edad)
	{
		count++;
		id = count;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters & Setters
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
