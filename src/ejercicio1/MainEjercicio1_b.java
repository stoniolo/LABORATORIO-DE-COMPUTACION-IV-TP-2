package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		
	//Crear 5 profesores
	Profesor p1 = new Profesor("Director", 30);
	Profesor p2 = new Profesor("Ayudante", 2);
	Profesor p3 = new Profesor("Profesor", 15);
	Profesor p4 = new Profesor("Director", 26);
	Profesor p5 = new Profesor("Ayudante", 4);
	
	//Cargar profesores a treeset
	TreeSet<Profesor> treeProfesores = new TreeSet<Profesor>();
	treeProfesores.add(p1);
	treeProfesores.add(p2);
	treeProfesores.add(p3);
	treeProfesores.add(p4);
	treeProfesores.add(p5);
	
	
	//Mostrar treeset con iterator
	
	Iterator<Profesor> it = treeProfesores.iterator();
	
	while (it.hasNext()) 
	{
		Profesor profesor = (Profesor) it.next();
		System.out.println(profesor.toString());
	}

	}
	
}
