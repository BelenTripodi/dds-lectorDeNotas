package ui.viewModel;

import httpclient.NotitasService;
import model.Asignacion;
import org.uqbar.commons.utils.Observable;

import java.util.List;
import java.util.stream.Collectors;

@Observable
public class VerNotasViewModel {

    private List<Asignacion> asignaciones;

    public VerNotasViewModel() {
        asignaciones = NotitasService.getInstance().getStudentsAssignments();
    }

    public List<Asignacion> getAsignaciones() {
        return this.asignaciones;
    }

    public List<String> getNombre() {

        return this.asignaciones.stream().map(Asignacion::getNombre).collect(Collectors.toList());
    }

    public List<Boolean> getAprobado() {

        return this.asignaciones.stream().map(Asignacion::getAprobado).collect(Collectors.toList());
    }

}