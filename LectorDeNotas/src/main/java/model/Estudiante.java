package model;

import java.util.List;

import org.uqbar.commons.utils.TransactionalAndObservable;


@TransactionalAndObservable
public class Estudiante {

    private String nombre;
    private String apellido;
    private Integer legajo;
    private String github;
    private List<Tarea> tareas;

    public Estudiante(String nombre, String apellido, String github) {
        this.nombre = nombre;
        this.apellido = apellido;
        //this.legajo = unLegajo;
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

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }


    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

}


