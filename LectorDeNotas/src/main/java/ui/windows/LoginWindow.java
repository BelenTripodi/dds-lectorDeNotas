package ui.windows;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.EstudianteViewModel;
import ui.viewModel.NadaViewModel;


public class LoginWindow extends TransactionalDialog<EstudianteViewModel> {

    public LoginWindow(WindowOwner owner) {
        super(owner, new EstudianteViewModel());
    }

    @Override
    protected void createFormPanel(Panel panel) {
    	this.setTitle("CIGA");
    	Panel form = new Panel(panel);
    	form.setLayout(new VerticalLayout());
    	Panel login = new Panel(panel);
    	login.setLayout(new ColumnLayout(2));
        Label lblBienvenida = new Label(form).setText("Inicio de sesión");
        lblBienvenida.setWidth(300);
        lblBienvenida.setFontSize(10);
        new Label(login).setText("Número de legajo:");
        NumericField nroLegajo = new NumericField(login);
                nroLegajo.setWidth(125);
                nroLegajo.bindValueToProperty("legajo");

        Button btnIngresar = new Button(panel).setCaption("Ingresar").onClick(this::accept);
        btnIngresar.setWidth(150);
        btnIngresar.onClick(this::verMain);
    }

    public void verMain() {
    	this.close();
        MyMainWindow main = new MyMainWindow(this);
        main.open();
    }
    
}