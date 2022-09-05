package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio3 {
	
	public static void main(String[] args) {
		
		//Crear 5 profesores
		EdificioDeOficinas p1 = new EdificioDeOficinas(1500, 23);
		EdificioDeOficinas p2 = new EdificioDeOficinas(2400, 31);
		Polideportivo p3 = new Polideportivo(5500,"Numero1");
		Polideportivo p4 = new Polideportivo(7500,"Numero2");
		Polideportivo p5 = new Polideportivo(6500,"Numero3");
		
		//Cargar profesores a lista
		ArrayList<Edificio> listaProfesores = new ArrayList<Edificio>();
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		
		//Mostrar lista con iterator
		
		ListIterator<Edificio> it = listaProfesores.listIterator();
		
		while (it.hasNext()) {
			Edificio instalacion = it.next();
			it.remove();
			System.out.println(instalacion.toString());
		}
		
		}
	
}
