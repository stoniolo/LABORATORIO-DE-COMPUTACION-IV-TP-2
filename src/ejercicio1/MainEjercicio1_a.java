package ejercicio1;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {
	
	public static void main(String[] args) {
	
	//Crear 5 profesores
	Profesor p1 = new Profesor("Director", 30);
	Profesor p2 = new Profesor("Ayudante", 2);
	Profesor p3 = new Profesor("Profesor", 15);
	Profesor p4 = new Profesor("Director", 26);
	Profesor p5 = new Profesor("Ayudante", 4);
	
	//Cargar profesores a lista
	ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
	listaProfesores.add(p1);
	listaProfesores.add(p2);
	listaProfesores.add(p3);
	listaProfesores.add(p4);
	listaProfesores.add(p5);
	
	
	//Mostrar lista con iterator
	
	ListIterator<Profesor> it = listaProfesores.listIterator();
	
	while (it.hasNext()) {
		Profesor profesor = it.next();
		it.remove();
		System.out.println(profesor.toString());
	}
	
	}
	
}
