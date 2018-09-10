package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class NotaConceptual extends Nota {

    NotasConceptuales notaReal;

    public NotaConceptual(NotasConceptuales notaReal) {
        this.notaReal = notaReal;
    }

    @Override
    public Boolean estaAprobada() {
        return !notaReal.equals(NotasConceptuales.M);
    }

    @Override
    public String getNotaReal() {
        return notaReal.toString();
    }
}