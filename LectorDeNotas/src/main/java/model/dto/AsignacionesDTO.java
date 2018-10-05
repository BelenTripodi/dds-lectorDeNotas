package model.dto;

import model.Asignacion;

import java.util.List;
import java.util.stream.Collectors;

public class AsignacionesDTO {
    private List<AsignacionDTO> assignments;

    public List<Asignacion> getAsignaciones(){
       return this.assignments.stream().map(a -> a.getAsignacion()).collect(Collectors.toList());
    }
}
