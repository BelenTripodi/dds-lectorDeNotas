package model;

import java.util.List;
import java.util.stream.Collectors;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String legajo;
    private List<Asignacion> asignaciones;

    public Estudiante(String nombre, String apellido, String legajo, List<Asignacion> asignaciones) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.asignaciones = asignaciones;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
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

    public Boolean aproboAsignacion(Asignacion asignacion) {
        return this.noTieneDosMal(asignacion) && this.aproboTodosLosParciales(asignacion);
    }

    private Boolean noTieneDosMal(Asignacion asignacion) {

        return asignacion.getNotasConceptuales().stream().filter(nota -> nota.equals(NotaConceptual.M)).collect(Collectors.toList()).size() < 2;
    }

    private boolean aproboTodosLosParciales(Asignacion asignacion) {
        return asignacion.getNotasNumericas().stream().allMatch(nota -> nota > 6);
    }
}
