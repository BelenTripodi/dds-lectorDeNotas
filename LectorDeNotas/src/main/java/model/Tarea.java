package model;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Tarea {

    private List<Nota> notas;
    private String nombre;
    private Boolean aprobada;

    public Tarea(List<Nota> notas, String nombre) {
		this.notas = notas;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public Boolean getAprobado() {
    	return notas.stream().allMatch(nota -> nota.estaAprobada());
    }
    
    public String getUltimaNota() {
    	return (notas.get(notas.size() - 1)).getNotaReal();
    }
}