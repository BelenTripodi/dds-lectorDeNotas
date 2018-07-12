package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.ViewModel;


public class VerNotasWindow extends Dialog<ViewModel>{

	public VerNotasWindow (WindowOwner owner) {
        super(owner, new ViewModel());
    }

    protected void createFormPanel(Panel panel) {
        new Button(panel).setCaption("Ok").onClick(this::accept).setAsDefault();
    }

}
