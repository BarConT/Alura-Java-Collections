package Alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import model.Alumno;

public class Clase14 {

	public static void main(String... args) {

		Alumno alumno1 = new Alumno("Diego", "001");
		Alumno alumno2 = new Alumno("Felipe", "002");
		Alumno alumno3 = new Alumno("Facundo", "003");
		Alumno alumno4 = new Alumno("Guadalupe", "004");
		Alumno alumno5 = new Alumno("Marilyn", "005");
		Alumno alumno6 = new Alumno("Cristian", "006");
		
		Collection<Alumno> listaAlumnos = new HashSet();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		Alumno nuevoAlumno = new Alumno("Diego", "001");
		
		System.out.println(alumno1.equals(nuevoAlumno));
		System.out.println(listaAlumnos.contains(nuevoAlumno));
		
	}
}

