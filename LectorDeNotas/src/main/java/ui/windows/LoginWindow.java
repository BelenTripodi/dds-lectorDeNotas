package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.LoginViewModel;


public class LoginWindow extends SimpleWindow<LoginViewModel> {

    public LoginWindow(WindowOwner owner) {
        super(owner, new LoginViewModel());
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
        new Label(form).setText("Número de legajo:");
        NumericField nroLegajo = new NumericField(form);
        		nroLegajo.setWidth(125);
                nroLegajo.bindValueToProperty("legajo");
                

        Button btnIngresar = new Button(form).setCaption("Ingresar").setAsDefault();
        btnIngresar.setWidth(150);
        btnIngresar.onClick(this::verMain);
    }

    public void verMain() {
        MyMainWindow main = new MyMainWindow(this);
        this.cerrar();
        main.open();
    }
    
    
    private void cerrar() {
    	this.close();
    }

	@Override
	protected void addActions(Panel actionsPanel) {
	}
    
}
