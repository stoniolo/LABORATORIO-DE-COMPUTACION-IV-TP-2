package ejercicio3;

public class EdificioDeOficinas extends Edificio{
	
	private int NumeroDeOficinas;
	
	public EdificioDeOficinas(double Superficie, int numeroDeOficinas) {
		super(Superficie);
		this.setNumeroDeOficinas(numeroDeOficinas);
	}
	
	public int getNumeroDeOficinas() {
		return NumeroDeOficinas;
	}

	public void setNumeroDeOficinas(int numeroDeOficinas) {
		NumeroDeOficinas = numeroDeOficinas;
	}
	
	
}
