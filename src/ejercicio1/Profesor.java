package ejercicio1;

public class Profesor extends Empleado{

	//Attributes
	
		private String cargo;
		private int antiguedadDocente;
		
		//métodos
		
		@Override
		public String toString() {
			return "Empleado ID=" + getId() + ", Nombre=" + getNombre() + ", Edad=" + getEdad() + ", Cargo=" + cargo + ", Antiguedad=" + antiguedadDocente ;
		}
		
		//Constructors
		
		public Profesor() 
		{
			cargo = "Sin cargo";
			antiguedadDocente = 0;
		}
		
		public Profesor(String cargo, int antiguedad) 
		{
			this.cargo = cargo;
			this.antiguedadDocente = antiguedad;
		}
		
		
		//Getters & Setters
		
		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public int getAntiguedadDocente() {
			return antiguedadDocente;
		}

		public void setAntiguedadDocente(int antiguedadDocente) {
			this.antiguedadDocente = antiguedadDocente;
		}	
		
}
