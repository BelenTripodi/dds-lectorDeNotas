package model;

import java.util.List;

public class Tarea {

    private List<Nota> notas;


    public Tarea(List<Nota> unasNotas) {
        this.notas = unasNotas;
    }
    
    Boolean estaAprobada() {
    	return notas.stream().allMatch(nota -> nota.estaAprobada());
    }
    
    Nota ultimaNota() {
    	return notas.get(notas.size() - 1);
    }
}
