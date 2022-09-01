package ejercicio1;

public class Main_Ejercicio1_c {
	
	public static void main(String[] args) {
		
		//Crear 2 profesores
		Profesor p1 = new Profesor("Director", 30);
		Profesor p2 = new Profesor("Director", 3);
		
		//Comparar
		if (p1.equals(p2))
			{
			
			System.out.println("Son iguales");
			
			}
		
			else
			{
				System.out.println("Son distintos");
			}

		
		}

}
