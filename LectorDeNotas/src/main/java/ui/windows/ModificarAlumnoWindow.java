package ui.windows;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.EstudianteViewModel;


public class ModificarAlumnoWindow extends TransactionalDialog<EstudianteViewModel> {

    public ModificarAlumnoWindow(WindowOwner owner) {
        super(owner, new EstudianteViewModel());
    }

    @Override
    protected void createFormPanel(Panel panel) {
    	this.setTitle("Modificar Datos");
    	Panel form = new Panel(panel);
    	form.setLayout(new ColumnLayout(2));
    	
        new Label(form).setText("Nombre");
        TextBox nombre = new TextBox(form);
        nombre.setWidth(80).bindValueToProperty("nombre");

        new Label(form).setText("Apellido");
        TextBox apellido = new TextBox(form);
        apellido.setWidth(80)
                .bindValueToProperty("apellido");

        new Label(form).setText("Legajo");
        TextBox legajo = new TextBox(form);
        legajo.setWidth(80)
                .bindValueToProperty("legajo");
        new Label(form).setText("Usuario GitHub");
        new TextBox(form)
                .setWidth(80)
                .bindValueToProperty("github");

        new Button(form).setCaption("Aceptar").onClick(this::accept).setAsDefault();
        new Button(form).setCaption("Cancelar").onClick(this::cancel);

    }

}
