package Alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import model.Alumno;
import model.Curso;

public class Clase15 {

	public static void main(String... args) {
		
		Curso curso1 = new Curso("Historia", 30);

		Alumno alumno1 = new Alumno("Diego", "001");
		Alumno alumno2 = new Alumno("Felipe", "002");
		Alumno alumno3 = new Alumno("Facundo", "003");
		Alumno alumno4 = new Alumno("Guadalupe", "004");
		Alumno alumno5 = new Alumno("Marilyn", "005");
		Alumno alumno6 = new Alumno("Cristian", "006");
		
		Collection<Alumno> listaAlumnos = new HashSet();
		curso1.agregarAlumno(alumno1);
		curso1.agregarAlumno(alumno2);
		curso1.agregarAlumno(alumno3);
		curso1.agregarAlumno(alumno4);
		curso1.agregarAlumno(alumno5);
		curso1.agregarAlumno(alumno6);
		
		Alumno nuevoAlumno = new Alumno("Diego", "001");
		
		System.out.println(alumno1.equals(nuevoAlumno));
		System.out.println(curso1.getAlumnos().contains(nuevoAlumno));
		System.out.println(curso1.verificarAlumno(nuevoAlumno));
		
	}
}

