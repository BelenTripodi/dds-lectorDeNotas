package ui.viewModel;


import model.Repos;
import model.Tarea;
import org.uqbar.commons.utils.Observable;

import java.util.List;


@Observable
public class ViewModel {

    private List<Tarea> tareas;


    public ViewModel() {
        tareas = Repos.repo.todasLasTareas();
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }


}
