package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor>{

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
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + antiguedadDocente;
			result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			Profesor other = (Profesor) obj;
			if (antiguedadDocente != other.antiguedadDocente)
				return false;
			if (cargo == null) {
				if (other.cargo != null)
					return false;
			} else if (!cargo.equals(other.cargo))
				return false;
			return true;
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

		@Override
		public int compareTo(Profesor o) {
			
			if(o.getAntiguedadDocente() == this.antiguedadDocente) return 0;
			
			if(o.getAntiguedadDocente() < this.antiguedadDocente)
				{
				
				return -1;
				
				}
			
			return 1;
		}	
		
}
