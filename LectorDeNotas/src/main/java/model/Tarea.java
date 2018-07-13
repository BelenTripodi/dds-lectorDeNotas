package model;

import java.util.List;

import org.uqbar.commons.utils.Observable;

@Observable
public class Tarea {

    private List<Nota> notas;
    private Nota ultimaNota;
    private String nombre;
    private Boolean aprobada;

    public Boolean getAprobada() {
        return aprobada;
    }

    public void setAprobada(Boolean aprobada) {
        this.aprobada = this.estaAprobada();
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tarea(List<Nota> unasNotas) {
        this.notas = unasNotas;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public void setUltimaNota(Nota ultimaNota) {
        this.ultimaNota = ultimaNota;
    }

    Boolean estaAprobada() {
    	return notas.stream().allMatch(nota -> nota.estaAprobada());
    }
    
    Nota getUltimaNota() {
    	return this.ultimaNota = notas.get(notas.size() - 1);
    }
}
