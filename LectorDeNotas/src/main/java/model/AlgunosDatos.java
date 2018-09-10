package model;

import java.util.LinkedList;

public class AlgunosDatos {

    public static void initialize() {
        NotaConceptual unaNotaBien = new NotaConceptual(NotasConceptuales.B);
        NotaConceptual unaNotaRegular = new NotaConceptual(NotasConceptuales.R);
        NotaConceptual unaNotaMal = new NotaConceptual(NotasConceptuales.M);

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

        Tarea primerParcialAprobado = new Tarea("Primer Parcial");
        Tarea primerParcialDesaprobado = new Tarea("Primer Parcial");

        Tarea segundoParcialAprobado = new Tarea("Segundo Parcial");
        Tarea segundoParcialDesaprobado = new Tarea("Segundo Parcial");

        Asignacion primeraAsignacionAprobada = new Asignacion(primerParcialAprobado, listaNotasAprobadas, "1P");
        Asignacion segundaAsignacionAprobada = new Asignacion(segundoParcialAprobado, listaNotasAprobadas, "2P");
        Asignacion primeraAsignacionDesaprobada = new Asignacion(primerParcialDesaprobado, listaNotasDesaprobadas, "1P");
        Asignacion segundaAsignacionDesaprobada = new Asignacion(segundoParcialDesaprobado, listaNotasDesaprobadas, "2P");

        Estudiante estudianteAprobador = new Estudiante("Juan", "Aprobador", 123, "elaprobador");
        Estudiante estudianteDesaprobador = new Estudiante("Pedro", "Desaprobador", 456, "eldesaprobador");

        estudianteAprobador.agregarAsignacion(primeraAsignacionAprobada);
        estudianteAprobador.agregarAsignacion(segundaAsignacionAprobada);

        estudianteDesaprobador.agregarAsignacion(primeraAsignacionDesaprobada);
        estudianteDesaprobador.agregarAsignacion(segundaAsignacionDesaprobada);

        Repos.repoUsuarios.agregar(estudianteAprobador);
        Repos.repoUsuarios.agregar(estudianteDesaprobador);
    }
}