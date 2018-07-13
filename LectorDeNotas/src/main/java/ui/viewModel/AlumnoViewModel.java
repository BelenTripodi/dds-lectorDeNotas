package ui.viewModel;


import model.Estudiante;
import org.uqbar.commons.utils.Observable;

@Observable
public class AlumnoViewModel {

    private String nombreAlumno = "Belen";
    private String apellidoAlumno = "Curi";
    private String legajoAlumno = "123456789";
    private String githubAlumno = "holagit";


    public AlumnoViewModel() {
        Estudiante.setNombre(nombreAlumno);
        Estudiante.setApellido(apellidoAlumno);
        Estudiante.setLegajo(legajoAlumno);
        Estudiante.setGithub(githubAlumno);

    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getLegajoAlumno() {
        return legajoAlumno;
    }

    public void setLegajoAlumno(String legajoAlumno) {
        this.legajoAlumno = legajoAlumno;
    }

    public String getGithubAlumno() {
        return githubAlumno;
    }

    public void setGithubAlumno(String githubAlumno) {
        this.githubAlumno = githubAlumno;
    }

    public void setTodosCampos() {
        this.setNombreAlumno(nombreAlumno);
        Estudiante.setNombre(nombreAlumno);
    }
}
