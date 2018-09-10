package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class AsignacionTest {


    private NotaConceptual unaNotaMal = new NotaConceptual(NotasConceptuales.M);
    private NotaConceptual unaNotaRegular = new NotaConceptual(NotasConceptuales.R);
    private NotaConceptual unaNotaBien = new NotaConceptual(NotasConceptuales.B);

    NotaNumerica nota7 = new NotaNumerica(7);
    NotaNumerica nota3 = new NotaNumerica(3);
    NotaNumerica nota10 = new NotaNumerica(10);

    LinkedList<Nota> listaNotasAprobadas = new LinkedList<>();

    LinkedList<Nota> listaNotasDesaprobadas = new LinkedList<>();

    Tarea unaTarea = new Tarea( "Primer Parcial");
    Tarea otraTarea = new Tarea("Segundo Parcial");


    Asignacion unaAsignacion = new Asignacion(unaTarea, listaNotasAprobadas, "Una Asignacion Aprobada");
    Asignacion otraAsignacion = new Asignacion(otraTarea, listaNotasDesaprobadas, "Una Asignacion Desaprobada");

    @Before
    public void init(){
        listaNotasAprobadas.add(nota7);
        listaNotasAprobadas.add(unaNotaBien);
        listaNotasAprobadas.add(nota10);
        listaNotasAprobadas.add(unaNotaRegular);

        listaNotasDesaprobadas.add(nota7);
        listaNotasDesaprobadas.add(unaNotaMal);
        listaNotasDesaprobadas.add(nota3);

    }

    @Test
    public void obtenerUltimaNotaUnaTarea(){
        Assert.assertEquals("R", unaAsignacion.getUltimaNota());
    }

    @Test
    public void obtenerUltimaNotaOtraTarea(){
        Assert.assertEquals("3", otraAsignacion.getUltimaNota());
    }

    @Test
    public void obtenerAprobadoUnaTarea(){
        Assert.assertEquals(true, unaAsignacion.getAprobado());
    }

    @Test
    public void obtenerAprobadoOtraTarea(){
        Assert.assertEquals(false, otraAsignacion.getAprobado());
    }
}