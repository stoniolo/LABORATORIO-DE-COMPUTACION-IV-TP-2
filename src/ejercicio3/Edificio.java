package ejercicio3;

public class Edificio {
	
	private double SuperficieEdificio;
	
	public Edificio(double Superficie)
	{
		SuperficieEdificio = Superficie;
	}
	
	public double getSuperficieEdificio() {
		return SuperficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		SuperficieEdificio = superficieEdificio;
	}

	@Override
	public String toString() {
		return "Edificio [SuperficieEdificio=" + SuperficieEdificio + "]";
	}
	
	
}
