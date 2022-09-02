package ejercicio2;

public class ProdRefrigerado extends Producto{
	private int codSupervision;
	
	//Constructors
	public ProdRefrigerado()
	{
		super();
		this.codSupervision = 0;
	}
	public ProdRefrigerado(String fecha, int lote, int cod)
	{
		super(fecha, lote);
		this.codSupervision = cod;
	}
	
	//Getters & Setters
	public int getCodSupervision() {
		return codSupervision;
	}
	public void setCodSupervision(int codSupervision) {
		this.codSupervision = codSupervision;
	}
	
	//Methods
	@Override
	public String toString() {
		return "ID Producto: " + getId() + " Producto Refrigerado: Cod Supervision=" + codSupervision + " Fecha: " + getFecha() + "Lote: " + getLote();
	}
	
	
	
}
