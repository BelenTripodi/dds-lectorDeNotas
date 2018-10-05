package ui.viewModel;


import httpclient.NotitasService;
import model.Estudiante;
import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

@Transactional
@Observable
public class EstudianteViewModel {

    private Estudiante estudiante;
    private NotitasService notitasService = NotitasService.getInstance();

    public EstudianteViewModel() {
        estudiante = notitasService.getStudent();
    }

    public String getNombre() {
        return estudiante.getNombre();
    }

    public void setNombre(String unNombre) {
        if (!unNombre.isEmpty()) estudiante.setNombre(unNombre);
        notitasService.putStudent(estudiante);
    }

    public String getApellido() {
        return estudiante.getApellido();
    }

    public void setApellido(String unApellido) {
        if (!unApellido.isEmpty()) estudiante.setApellido(unApellido);
        notitasService.putStudent(estudiante);
    }

    public String getLegajo() {
        return estudiante.getLegajo();
    }

    public void setLegajo(String unLegajo) {
        estudiante.setLegajo(unLegajo);
        notitasService.putStudent(estudiante);
    }

    public String getGithub() {
        return estudiante.getGithub();
    }

    public void setGithub(String unGit) {
        if (!unGit.isEmpty()) estudiante.setGithub(unGit);
        notitasService.putStudent(estudiante);
    }

}
