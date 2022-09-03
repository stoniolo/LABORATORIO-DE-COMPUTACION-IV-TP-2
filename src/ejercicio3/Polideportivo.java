package ejercicio3;

public class Polideportivo extends Edificio implements IinstalacionDeportiva{
	
	private String Nombre;
	
	
	public Polideportivo(double Superficie) {
		super(Superficie);
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

}
