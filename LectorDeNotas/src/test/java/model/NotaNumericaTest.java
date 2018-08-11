package model;


import org.junit.Assert;
import org.junit.Test;

public class NotaNumericaTest {
    private NotaNumerica notaAlta = new NotaNumerica(10);
    private NotaNumerica notaBaja = new NotaNumerica(2);

    @Test
    public void estaNotaEstaAprobada(){
        Assert.assertEquals(true, notaAlta.estaAprobada());
    }

    @Test
    public void estaNotaNoEstaAprobada(){
        Assert.assertEquals(false, notaBaja.estaAprobada());
    }
}
