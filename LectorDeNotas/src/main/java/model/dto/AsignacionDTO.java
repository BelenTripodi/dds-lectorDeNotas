package model.dto;

import model.Asignacion;
import model.Nota;
import model.Tarea;

import java.util.List;

public class AsignacionDTO {

    private String id;
    private String title;
    private String description;
    private List<Nota> grades;

    public Asignacion getAsignacion(){
        return new Asignacion(new Tarea(this.description),this.grades,this.title);
    }
}
