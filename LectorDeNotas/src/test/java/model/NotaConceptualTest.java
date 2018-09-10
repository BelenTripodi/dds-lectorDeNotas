package model;

import org.junit.Assert;
import org.junit.Test;

public class NotaConceptualTest {

    private NotaConceptual notaMal = new NotaConceptual(NotasConceptuales.M);
    private NotaConceptual notaRegular = new NotaConceptual(NotasConceptuales.R);
    private NotaConceptual notaBien = new NotaConceptual(NotasConceptuales.B);

    @Test
    public void estaNotaEstaAprobada(){
        Assert.assertEquals(true, notaBien.estaAprobada());
    }

    @Test
    public void estaNotaEstaAprobada2(){
        Assert.assertEquals(true, notaRegular.estaAprobada());
    }

    @Test
    public void estaNotaNoEstaAprobada(){
        Assert.assertEquals(false, notaMal.estaAprobada());
    }

}
