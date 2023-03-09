package Alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;

import model.Alumno;
import model.Curso;

public class Clase18 {

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
		
		System.out.println(curso1.getAlumnos());
		
		Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a-> "003".equalsIgnoreCase(a.getCodigo())).findFirst();
		
		if (alumno.isPresent()) {
			System.out.println("Alumno: " + alumno.get());
		} else {
			System.out.println("Alumno no encontrado.");
		}
		
		Alumno alumnoMap = curso1.getAlumnosMap().get("002");
		System.out.println("Alumno map: " + alumnoMap);
		
	}
}

