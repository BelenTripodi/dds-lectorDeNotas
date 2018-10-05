package model;

import model.dto.EstudianteDTO;
import org.uqbar.commons.utils.TransactionalAndObservable;

import java.util.LinkedList;
import java.util.List;


@TransactionalAndObservable
public class Estudiante {

    private String nombre;
    private String apellido;
    private String legajo;
    private String github;
    private List<Asignacion> asignaciones;

    public List<Asignacion> getAsignaciones() {
		return asignaciones;
	}

	public void setAsignaciones(List<Asignacion> asignaciones) {
		this.asignaciones = asignaciones;
	}

	public Estudiante(String nombre, String apellido, String unLegajo, String github) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = unLegajo;
        this.github = github;
        asignaciones = new LinkedList<>();
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
    
    public void agregarAsignacion(Asignacion unaAsignacion)
    {
    	this.asignaciones.add(unaAsignacion);
    }
    
    public Boolean esMiLegajo(Integer unLegajo)
    {
    	return legajo.equals(unLegajo);
    }

    public EstudianteDTO toDto(){
        return new EstudianteDTO(this.legajo, this.nombre, this.apellido, this.github);
    }
}


