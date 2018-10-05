package ui.viewModel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.utils.Observable;

import httpclient.ServiceGet;
import model.Asignacion;
import model.Estudiante;

@Observable
public class VerNotasViewModel {

	private static final String recurso ="student/assignments";
    private Estudiante estudiante;
    private String test; // TODO hay que borrar esto, es solo para probar el get

    public VerNotasViewModel() {
        test = ServiceGet.getInstance().get(recurso).toString();
    }

    public String getAsignaciones() { //TODO esto devolvia List<Asignacion>
    	return test;
    	//        return this.estudiante.getAsignaciones();
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.estudiante.setAsignaciones(asignaciones);
    }

    public String getNombre() { // TODO esto devolvia List<String>
    	return test;
//        return estudiante.getAsignaciones().stream().map(asignacion -> asignacion.getNombre()).collect(Collectors.toList());
    }

    public String getAprobado() {// TODO esto devolvia List<Boolean>
    	return test;
//        return estudiante.getAsignaciones().stream().map(asignacion -> asignacion.getAprobado()).collect(Collectors.toList());
    }

    public String getUltimaNota() {// TODO esto devolvia List<String>
    	return test;
//        return estudiante.getAsignaciones().stream().map(asignacion -> asignacion.getUltimaNota()).collect(Collectors.toList());
    }
}