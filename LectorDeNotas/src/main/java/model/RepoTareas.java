
package model;


import java.util.LinkedList;
import java.util.List;

import org.uqbar.commons.utils.Observable;

public class RepoTareas {
	
	private List<Tarea> tareas = new LinkedList<>();

	public void agregar(Tarea unaTarea) {
		this.tareas.add(unaTarea);
	}

	public List<Tarea> todasLasTareas() {
		return tareas;
	}
}
