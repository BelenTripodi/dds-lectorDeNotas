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

		Tarea primerParcialAprobado = new Tarea(listaNotasAprobadas, "Primer Parcial");
		Tarea primerParcialDesaprobado = new Tarea(listaNotasDesaprobadas, "Primer Parcial");
		
		Tarea segundoParcialAprobado = new Tarea(listaNotasAprobadas, "Segundo Parcial");
		Tarea segundoParcialDesaprobado = new Tarea(listaNotasDesaprobadas, "Segundo Parcial");
		
		Estudiante estudianteAprobador = new Estudiante("Juan", "Aprobador", 123, "elaprobador");
		Estudiante estudianteDesaprobador = new Estudiante("Pedro", "Desaprobador", 456, "eldesaprobador");
		
		estudianteAprobador.agregarTarea(primerParcialAprobado);
		estudianteAprobador.agregarTarea(segundoParcialAprobado);
		
		estudianteDesaprobador.agregarTarea(primerParcialDesaprobado);
		estudianteDesaprobador.agregarTarea(segundoParcialDesaprobado);
		
		Repos.repoUsuarios.agregar(estudianteAprobador);
		Repos.repoUsuarios.agregar(estudianteDesaprobador);
		
//		Repos.repoTareas.agregar(unaTareaAprobada);
//		Repos.repoTareas.agregar(unaTareaDesaprobada);
		
	}
}