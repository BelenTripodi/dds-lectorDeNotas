package ui.viewModel;


import model.Estudiante;


import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

import httpclient.ServiceGet;

@Transactional
@Observable
public class EstudianteViewModel {

    private Estudiante estudiante;
    private String test;

    public EstudianteViewModel() {
        test = ServiceGet.getInstance().get("student").toString();
    }

    public String getNombre() {
    	return test;
//        return estudiante.getNombre();
    }

    public void setNombre(String unNombre) {
        if (!unNombre.isEmpty()) estudiante.setNombre(unNombre);
    }

    public String getApellido() {
    	return test;
//        return estudiante.getApellido();
    }

    public void setApellido(String unApellido) {
        if (!unApellido.isEmpty()) estudiante.setApellido(unApellido);
    }

    public String getLegajo() {
    	return test;
//        return Repos.repoUsuarios.usuarioActual().getLegajo();
    }

    public void setLegajo(Integer unLegajo) {
        estudiante.setLegajo(unLegajo);
    }

    public String getGithub() {
    	return test;
//        return estudiante.getGithub();
    }

    public void setGithub(String unGit) {
        if (!unGit.isEmpty()) estudiante.setGithub(unGit);
    }

}
