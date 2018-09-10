package model;

import org.uqbar.commons.utils.Observable;

import java.util.List;

@Observable
public class Asignacion {

    private List<Nota> notas;
    private String nombre;
    private Tarea tarea;

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public Asignacion(Tarea unaTarea, List<Nota> notas, String nombre) {
        this.tarea = unaTarea;
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
