package ejercicio2;

public class Producto {
	private String fecha;
	private int lote;
	private int idProducto;
	
	static int count = 999;
	
	//Constructors
	public Producto() 
	{
		count++;
		fecha = "Sin Fecha";
		lote = 0;
		idProducto = count;
	}
	
	public Producto(String fecha, int lote)
	{
		count++;
		this.fecha = fecha;
		this.lote = lote;
		idProducto = count;
	}
	//Getters and Setters
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public int getId()
	{
		return idProducto;
	}
	//Methods
	@Override
	public String toString() {
		return "ID Producto: " + idProducto + "Producto fecha=" + fecha + ", lote=" + lote;
	}
	
	
}
