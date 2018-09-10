package ui.windows;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.LegajoInvalidoViewModel;

public class LegajoInvalidoWindow extends TransactionalDialog<LegajoInvalidoViewModel>{

	public LegajoInvalidoWindow(WindowOwner owner) {
		super(owner, new LegajoInvalidoViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
    	form.setLayout(new VerticalLayout());
        Label lblError = new Label(form).setText("Legajo inválido, por favor ingresalo nuevamente");
        lblError.setWidth(300);
        lblError.setFontSize(10);
        
        Button btnOK = new Button(form).setCaption("OK").onClick(this::accept).setAsDefault();
        btnOK.setWidth(150);
	}

}
