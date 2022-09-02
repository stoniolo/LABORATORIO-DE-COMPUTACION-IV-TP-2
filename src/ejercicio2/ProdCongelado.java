package ejercicio2;

public class ProdCongelado extends Producto{
	private int tempRecomendada;
	
	//Constructors
	public ProdCongelado()
	{
		super();
		this.tempRecomendada = 0;
	}
	
	public ProdCongelado(String fecha, int lote, int tempRecomendada)
	{
		super(fecha, lote);
		this.tempRecomendada = tempRecomendada;
	}
	//Getters & Setters
	public int getTempRecomendada() {
		return tempRecomendada;
	}

	public void setTempRecomendada(int tempRecomendada) {
		this.tempRecomendada = tempRecomendada;
	}

	@Override
	public String toString() {
		return "ID Producto: " + getId() + " Producto Congelado: Temperatura Recomendada=" + tempRecomendada + " Fecha: " + getFecha() + " Lote: " + getLote();
	}
	
	
	
}
