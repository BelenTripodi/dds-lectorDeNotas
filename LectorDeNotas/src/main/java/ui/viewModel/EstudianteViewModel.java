package ui.viewModel;


import httpclient.NotitasService;
import model.Estudiante;
import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

@Transactional
@Observable
public class EstudianteViewModel {

    private Estudiante estudiante;

    public EstudianteViewModel() {
        estudiante = NotitasService.getInstance().getStudent();
    }

    public String getNombre() {
        return estudiante.getNombre();
    }

    public void setNombre(String unNombre) {
        if (!unNombre.isEmpty()) estudiante.setNombre(unNombre);
    }

    public String getApellido() {
        return estudiante.getApellido();
    }

    public void setApellido(String unApellido) {
        if (!unApellido.isEmpty()) estudiante.setApellido(unApellido);
    }

    public String getLegajo() {
        return estudiante.getLegajo();
    }

    public void setLegajo(String unLegajo) {
        estudiante.setLegajo(unLegajo);
    }

    public String getGithub() {
        return estudiante.getGithub();
    }

    public void setGithub(String unGit) {
        if (!unGit.isEmpty()) estudiante.setGithub(unGit);
    }

}
