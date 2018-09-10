package ui.viewModel;

import model.Asignacion;
import model.Estudiante;
import model.Repos;
import org.uqbar.commons.utils.Observable;

import java.util.List;
import java.util.stream.Collectors;

@Observable
public class VerNotasViewModel {

    private Estudiante estudiante;

    public VerNotasViewModel() {
        estudiante = Repos.repoUsuarios.usuarioActual();
    }

    public List<Asignacion> getAsignaciones() {
        return this.estudiante.getAsignaciones();
    }

    public void setTareas(List<Asignacion> asignaciones) {
        this.estudiante.setAsignaciones(asignaciones);
    }

    public List<String> getNombre() {
        return estudiante.getAsignaciones().stream().map(asignacion -> asignacion.getNombre()).collect(Collectors.toList());
    }

    public List<Boolean> getAprobado() {
        return estudiante.getAsignaciones().stream().map(asignacion -> asignacion.getAprobado()).collect(Collectors.toList());
    }

    public List<String> getUltimaNota() {
        return estudiante.getAsignaciones().stream().map(asignacion -> asignacion.getUltimaNota()).collect(Collectors.toList());
    }
}