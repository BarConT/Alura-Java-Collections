package Alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Curso;

public class Clase9 {

	public static void main(String... args) {

		Curso curso1 = new Curso("Historia", 30);
		Curso curso2 = new Curso("Algebra", 25);
		Curso curso3 = new Curso("Aritmetica", 35);
		Curso curso4 = new Curso("Geometria", 40);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		// Suma total de tiempo
		int tiempo = 0;
		for (Curso curso : cursos) {
			tiempo += curso.getTiempo();
		}
		System.out.println("for - SUMA: " + tiempo);
		
		// Mayor
		int mayor = 0;
		for (Curso curso : cursos) {
			if (curso.getTiempo() > mayor) {
				mayor = curso.getTiempo();
			}
		}
		System.out.println("for - MAYOR: " + mayor);
		
		// Suma total de tiempo sin HISTORIA
		tiempo = 0;
		for (Curso curso : cursos) {
			if (!curso.getNombre().equalsIgnoreCase("Historia")) {
				tiempo += curso.getTiempo();
			}
		}
		System.out.println("for - SUMA  - SIN HISTORIA: " + tiempo);
		
		System.out.println("stream - SUMA: " + cursos.stream().mapToInt(Curso::getTiempo).sum());
		System.out.println("stream - MAYOR: " + cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println("stream - SUMA - SIN HISTORIA: " + cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());

	}
}
