package model;

import java.util.List;

public class Asignacion {

    private List<NotaConceptual> notasConceptuales;
    private List<Integer> notasNumericas;
    private TipoAsignacion tipo;

    public Asignacion(List<NotaConceptual> notasConceptuales, List<Integer> notasNumericas, TipoAsignacion tipo) {
        this.notasConceptuales = notasConceptuales;
        this.notasNumericas = notasNumericas;
        this.tipo = tipo;
    }

    public void setNotasConceptuales(List<NotaConceptual> notasConceptuales) {
        this.notasConceptuales = notasConceptuales;
    }

    public void setNotasNumericas(List<Integer> notasNumericas) {
        this.notasNumericas = notasNumericas;
    }

    public TipoAsignacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoAsignacion tipo) {
        this.tipo = tipo;
    }

    public List<NotaConceptual> getNotasConceptuales() {
        return this.notasConceptuales;
    }

    public List<Integer> getNotasNumericas() {
        return this.notasNumericas;
    }
}
