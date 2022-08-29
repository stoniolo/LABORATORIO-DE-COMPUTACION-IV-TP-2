package ejercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado();
		
		System.out.println(empleado.toString());
		
		Empleado empleado1 = new Empleado();
		
		System.out.println(empleado1.toString());
		
		Empleado[] vEmpleados = new Empleado[3];
		
		vEmpleados[0] = new Empleado("Jose", 30);
		vEmpleados[1] = new Empleado("Pedro", 35);
		vEmpleados[2] = new Empleado("Alejandro", 40);
		
		for (Empleado empleado2 : vEmpleados) {
			System.out.println(empleado2.toString());
		}
		
		System.out.println(Empleado.devuelveProximoID());
	}
}
