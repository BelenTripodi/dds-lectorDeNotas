package model;

import java.util.LinkedList;

public class AlgunosDatos {

	public static void initialize() {
		NotaConceptual unaNotaBien = new NotaConceptual("B");
		NotaConceptual unaNotaRegular = new NotaConceptual("R");
		NotaConceptual unaNotaMal = new NotaConceptual("M");

		NotaNumerica nota7 = new NotaNumerica(7);
		NotaNumerica nota3 = new NotaNumerica(3);
		NotaNumerica nota10 = new NotaNumerica(10);

		LinkedList<Nota> listaNotasAprobadas = new LinkedList<>();
		listaNotasAprobadas.add(nota7);
		listaNotasAprobadas.add(unaNotaBien);
		listaNotasAprobadas.add(nota10);
		listaNotasAprobadas.add(unaNotaRegular);

		LinkedList<Nota> listaNotasDesaprobadas = new LinkedList<>();
		listaNotasDesaprobadas.add(nota7);
		listaNotasDesaprobadas.add(unaNotaMal);
		listaNotasDesaprobadas.add(nota3);

		Tarea unaTarea = new Tarea(listaNotasAprobadas, "Primer Parcial");
		Tarea otraTarea = new Tarea(listaNotasDesaprobadas, "Segundo Parcial");
		
		
		Estudiante estudiante = new Estudiante("Nombre", "Apellido", 0, "unGithub");
		

		Repos.repoTareas.agregar(unaTarea);
		Repos.repoTareas.agregar(otraTarea);
		Repos.repoUsuarios.agregar(estudiante);
		
	}
}