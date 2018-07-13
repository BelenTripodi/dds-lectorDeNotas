package ui.viewModel;


import org.uqbar.commons.utils.Observable;
import org.uqbar.commons.utils.Transactional;

import model.Estudiante;
import model.Repos;

@Transactional
@Observable
public class EstudianteViewModel {

    private Estudiante estudiante;


    public EstudianteViewModel() {
        estudiante = Repos.repoUsuarios.usuarioActual();
    }

    public String getNombre() {
        return estudiante.getNombre();
    }
    
    public String getApellido() {
        return estudiante.getApellido();
    }
    
    public String getLegajo() {
        return estudiante.getLegajo();
    }
    
    public String getGithub() {
        return estudiante.getGithub();
    }
    
    

    public void setNombre(String unNombre) {
        estudiante.setNombre(unNombre);
    }
    
    public void setApellido(String unApellido) {
        estudiante.setApellido( unApellido);
    }
    
    public void  setLegajo(String unLegajo) {
        estudiante.setLegajo(unLegajo);
    }
    
    public void  setGithub(String unLegajo) {
        estudiante.setGithub(unLegajo);
    }
    
}

    
    /*
     *   private List<Tarea> tareas;
    
	public ViewModel() {
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
	}*/
