package model;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Tarea {

    private List<Nota> notas;
    private String nombre;

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

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
