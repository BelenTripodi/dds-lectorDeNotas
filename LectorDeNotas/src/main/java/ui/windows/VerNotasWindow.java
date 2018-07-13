package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.ViewModel;


public class VerNotasWindow extends Dialog<ViewModel>{

	public VerNotasWindow (WindowOwner owner) {
        super(owner, new ViewModel());
    }

    protected void createFormPanel(Panel panel) {
    	this.setTitle("Ver notas");
    	Panel panelNotas= new Panel(panel);
    	panelNotas.setLayout(new ColumnLayout(2));
    	panel.setWidth(10000);
    	panelNotas.setWidth(10000);
    	
    	
    	new Label(panelNotas).setText("Materia 1: ");
    	new Label(panelNotas).setText(" ");
    	new Label(panelNotas).setText("Materia 2: ");
    	new Label(panelNotas).setText(" ");
    	new Label(panelNotas).setText("Materia 3: ");
    	
    	
        new Button(panel).setCaption("Ok").onClick(this::accept).setAsDefault();
        new Button(panel).setCaption("anda");
    }

}
