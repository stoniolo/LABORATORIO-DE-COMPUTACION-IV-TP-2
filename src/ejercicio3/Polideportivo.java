package ejercicio3;

public class Polideportivo extends Edificio implements IinstalacionDeportiva{
	
	private String Nombre;
	
	
	public Polideportivo(double Superficie, String name) {
		super(Superficie);
		this.Nombre = name;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return 1;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	@Override
	public String toString() {
		return "Polideportivo [Nombre=" + Nombre + " Superficie=" + this.getSuperficieEdificio() + "]";
	}

}
