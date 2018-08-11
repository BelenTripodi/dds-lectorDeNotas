package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class TareaTest {

    NotaConceptual unaNotaBien = new NotaConceptual("B");
    NotaConceptual unaNotaRegular = new NotaConceptual("R");
    NotaConceptual unaNotaMal = new NotaConceptual("M");

    NotaNumerica nota7 = new NotaNumerica(7);
    NotaNumerica nota3 = new NotaNumerica(3);
    NotaNumerica nota10 = new NotaNumerica(10);

    LinkedList<Nota> listaNotasAprobadas = new LinkedList<>();


    LinkedList<Nota> listaNotasDesaprobadas = new LinkedList<>();


    Tarea unaTarea = new Tarea(listaNotasAprobadas, "Primer Parcial");
    Tarea otraTarea = new Tarea(listaNotasDesaprobadas, "Segundo Parcial");

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
        Assert.assertEquals("R", unaTarea.getUltimaNota());
    }

    @Test
    public void obtenerUltimaNotaOtraTarea(){
        Assert.assertEquals("3", otraTarea.getUltimaNota());
    }

    @Test
    public void obtenerAprobadoUnaTarea(){
        Assert.assertEquals(true, unaTarea.getAprobado());
    }

    @Test
    public void obtenerAprobadoOtraTarea(){
        Assert.assertEquals(false, otraTarea.getAprobado());
    }
}