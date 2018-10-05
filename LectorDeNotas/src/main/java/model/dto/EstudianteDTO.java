package model.dto;

import model.Estudiante;

public class EstudianteDTO {
    private String code;
    private String first_name;
    private String last_name;
    private String github_user;

    public EstudianteDTO(String code, String first_name, String last_name, String github_user) {
        this.code = code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.github_user = github_user;
    }

    public Estudiante getEstudiante(){
        return new Estudiante(this.first_name, this.last_name, this.code, this.github_user);
    }
}
