package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.ViewModel;


public class ModificarAlumnoWindow extends Dialog<ViewModel> {

    public ModificarAlumnoWindow(WindowOwner owner) {
        super(owner, new ViewModel());
    }
    
    @Override
    protected void createFormPanel(Panel panel) {
    	new Button(panel).setCaption("Aceptar").onClick(this::accept);
    	new Button(panel).setCaption("Cancelar").onClick(this::cancel).setAsDefault();;
    }
    
}
