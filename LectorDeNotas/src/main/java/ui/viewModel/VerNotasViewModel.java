package ui.viewModel;

import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.utils.Observable;

import model.Repos;
import model.Tarea;

@Observable
public class VerNotasViewModel {

    private List<Tarea> tareas;
    
	public VerNotasViewModel() {
        tareas = Repos.repoTareas.todasLasTareas();
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
    
	public List<String> getNombre() {
    	return tareas.stream().map(tarea -> tarea.getNombre()).collect(Collectors.toList());
    }
	
	public List<Boolean> getAprobado() {
		return tareas.stream().map(tarea -> tarea.getAprobado()).collect(Collectors.toList());
	}
	
    public List <String> getUltimaNota() {
		return tareas.stream().map(tarea -> tarea.getUltimaNota()).collect(Collectors.toList());
	}
}