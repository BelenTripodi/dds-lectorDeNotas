package model.dto;

import model.Estudiante;

public class EstudianteDTO {
    private String code;
    private String first_name;
    private String last_name;
    private String github_user;

    public Estudiante getEstudiante(){
        return new Estudiante(this.first_name, this.last_name, this.code, this.github_user);
    }
}
