package Alura;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Clase13 {

	public static void main(String... args) {

		String alumno1 = "Diego";
		String alumno2 = "Felipe";
		String alumno3 = "Facundo";
		String alumno4 = "Guadalupe";
		String alumno5 = "Marilyn";
		String alumno6 = "Cristian";
		String alumno7 = "Marilyn";
		String alumno8 = "Cristian";
		
		Collection<String> listaAlumnos = new HashSet();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		
		listaAlumnos.forEach(alumno -> System.out.println(alumno));
		
		boolean valida = listaAlumnos.contains("Diego");
		System.out.println(valida);
		
		String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(max.length());
		
		listaAlumnos.removeIf(alumno -> "Diego".equalsIgnoreCase(alumno));
		listaAlumnos.forEach(alumno -> System.out.println(alumno));
		
	}
}

