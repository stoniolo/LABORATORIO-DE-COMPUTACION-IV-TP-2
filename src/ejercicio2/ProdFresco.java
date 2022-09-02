package ejercicio2;

public class ProdFresco extends Producto{
	private String fechaEnvasado;
	private String paisOrigen;
	
	//Constructors
	public ProdFresco()
	{
		super();
		this.fechaEnvasado = "Sin Fecha";
		this.paisOrigen = "Sin País";
	}
	
	public ProdFresco(String fechaEnvasado, String paisOrigen, String fecha, int lote)
	{
		super(fecha, lote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	//Getters & Setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	//Methods

	@Override
	public String toString() {
		return "ID Producto: " + getId() + " Producto Fresco: Fecha Envasado= " + fechaEnvasado + ", País Origen=" + paisOrigen + " Fecha:" + getFecha() + " Lote:" + getLote();
	}
	
	
}
