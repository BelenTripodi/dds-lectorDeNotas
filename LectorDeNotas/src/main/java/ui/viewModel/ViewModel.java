package ui.viewModel;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.utils.Observable;
import org.uqbar.lacar.ui.model.Action;

@Observable
public class ViewModel {

	//private List<Asignacion> asignaciones;
	
	private Action opcionSeleccionada;
	private List<Action> opciones= new ArrayList<>();
	
	public ViewModel() {
		super();
	}
}
