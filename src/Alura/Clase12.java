package Alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class Clase12 {

	public static void main(String... args) {

		String alumno1 = "Diego";
		String alumno2 = "Felipe";
		String alumno3 = "Facundo";
		String alumno4 = "Guadalupe";
		String alumno5 = "Marilyn";
		String alumno6 = "Cristian";
		String alumno7 = "Marilyn";
		String alumno8 = "Cristian";
		
		Collection<String> listaAlumnos = new ArrayList<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
		listaAlumnos.forEach(alumno -> System.out.println(alumno));
		
	}
}