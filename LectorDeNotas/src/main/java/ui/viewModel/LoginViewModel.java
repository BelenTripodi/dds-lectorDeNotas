package ui.viewModel;


import model.Estudiante;
import model.Repos;
import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

@Transactional
@Observable
public class LoginViewModel {

    private Estudiante estudiante;

    public LoginViewModel() {
        estudiante = Repos.repoUsuarios.usuarioActual();
    }

    public Integer getLegajo() {
        return estudiante.getLegajo();
    }

    public void setLegajo(Integer unLegajo) {
        estudiante.setLegajo(unLegajo);

    }

}
