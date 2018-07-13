package model;

import java.util.List;

public class Estudiante {

    private static String nombre;
    private static String apellido;
    private static String legajo;
    private static String github;

    public String getGithub() {
        return github;
    }

    public static void setGithub(String github) {
        Estudiante.github = github;
    }

    private List<Tarea> asignaciones;

    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String legajo, List<Tarea> asignaciones, String github) {

        Estudiante.nombre = nombre;
        Estudiante.apellido = apellido;
        Estudiante.legajo = legajo;
        Estudiante.github = github;
        this.asignaciones = asignaciones;
    }

    public List<Tarea> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Tarea> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Estudiante.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Estudiante.apellido = apellido;
    }

    public String getLegajo() {
        return legajo;
    }

    public static void setLegajo(String legajo) {
        Estudiante.legajo = legajo;
    }

//    public Boolean aproboAsignacion(Asignacion asignacion) {
//        return this.noTieneDosMal(asignacion) && this.aproboTodosLosParciales(asignacion);
//    }

//    private Boolean noTieneDosMal(Asignacion asignacion) {
//
//        return asignacion.getNotasConceptuales().stream().filter(nota -> nota.equals(Nota.M)).collect(Collectors.toList()).size() < 2;
//    }
//
//    private boolean aproboTodosLosParciales(Asignacion asignacion) {
//        return asignacion.getNotasNumericas().stream().allMatch(nota -> nota > 6);
//    }
}
