package ui.viewModel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.utils.Observable;

import model.Estudiante;
import model.Repos;
import model.Tarea;

@Observable
public class VerNotasViewModel {

    private Estudiante estudiante;
    
	public VerNotasViewModel() {
        estudiante = Repos.repoUsuarios.usuarioActual();
    }

    public List<Tarea> getTareas() {
        return this.estudiante.getTareas();
    }

    public void setTareas(List<Tarea> tareas) {
        this.estudiante.setTareas(tareas);
    }
    
	public List<String> getNombre() {
    	return estudiante.getTareas().stream().map(tarea -> tarea.getNombre()).collect(Collectors.toList());
    }
	
	public List<Boolean> getAprobado() {
		return estudiante.getTareas().stream().map(tarea -> tarea.getAprobado()).collect(Collectors.toList());
	}
	
    public List <String> getUltimaNota() {
		return estudiante.getTareas().stream().map(tarea -> tarea.getUltimaNota()).collect(Collectors.toList());
	}
}