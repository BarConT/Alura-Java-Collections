package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Curso implements Comparable<Curso> {

	private String nombre;
	private int tiempo;
	private List<Aula> listAula = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
	// private Collection<Alumno> alumnos = new LinkedList();
	private Map<String, Alumno> alumnoMap = new HashMap<>();

	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public Curso(String nombre, int tiempo, List<Aula> listAula) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.listAula = listAula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public List<Aula> getListAula() {
		return Collections.unmodifiableList(listAula);
	}

	public void setClaseList(List<Aula> listAula) {
		this.listAula = listAula;
	}
	
	public void addAula(Aula aula) {
		this.listAula.add(aula);
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

	@Override
	public int compareTo(Curso o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
		this.alumnoMap.put(alumno.getCodigo(), alumno);
	}
	
	public boolean verificarAlumno(Alumno alumno) {
		return this.alumnos.contains(alumno);
	}
	
	public Collection<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public Map<String, Alumno> getAlumnosMap() {
		return this.alumnoMap;
	}
	
}
