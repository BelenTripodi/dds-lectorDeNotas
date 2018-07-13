package ui.viewModel;


import model.Estudiante;
import org.uqbar.commons.utils.Observable;

@Observable
public class AlumnoViewModel extends ViewModel {

    private String nombreAlumno;
    private String apellidoAlumno;
    private String legajoAlumno;
    private String githubAlumno;
    private Estudiante estudiante = new Estudiante();

    public AlumnoViewModel() {
        this.nombreAlumno = this.estudiante.getNombre();
        this.apellidoAlumno = this.estudiante.getApellido();
        this.legajoAlumno = this.estudiante.getLegajo();
        this.githubAlumno = this.estudiante.getGithub();

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

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
