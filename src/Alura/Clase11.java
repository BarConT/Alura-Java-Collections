package Alura;

import java.util.Set;
import java.util.HashSet;

public class Clase11 {

	public static void main(String... args) {

		String alumno1 = "Diego";
		String alumno2 = "Felipe";
		String alumno3 = "Facundo";
		String alumno4 = "Guadalupe";
		String alumno5 = "Marilyn";
		String alumno6 = "Cristian";
		
		Set<String> listaAlumnos = new HashSet();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
	}
}