package model;

import org.uqbar.commons.utils.Observable;

import java.util.List;

@Observable
public class Estudiante {

    private String nombre;
    private String apellido;
    private String legajo;
    private String github;
    private List<Tarea> tareas;

    public Estudiante(String nombre, String apellido, String legajo, String github) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.github = github;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }


    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
}


