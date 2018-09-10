package ui.viewModel;


import model.Estudiante;
import model.Repos;
import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

@Transactional
@Observable
public class LoginViewModel {

    private Estudiante estudianteLoggeado;
    private Integer legajoIngresado;

    public LoginViewModel() {

    }

    public Integer getLegajo() {
        return legajoIngresado;
    }

    public void setLegajo(Integer unLegajo) {
        this.legajoIngresado = unLegajo;
    }

    public Boolean esLegajoValido() {
        return Repos.repoUsuarios.getEstudiantes().stream().
                anyMatch(estudiante -> estudiante.esMiLegajo(legajoIngresado));
    }

    public void cargarEstudiante() {
        estudianteLoggeado = Repos.repoUsuarios.getEstudiantes().stream()
                .filter(estudiante -> estudiante.getLegajo().equals(legajoIngresado)).findFirst().get();

        Repos.repoUsuarios.seLogueo(estudianteLoggeado);
    }

}