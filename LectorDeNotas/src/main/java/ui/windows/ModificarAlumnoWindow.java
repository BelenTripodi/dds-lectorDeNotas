package ui.windows;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import ui.viewModel.AlumnoViewModel;


public class ModificarAlumnoWindow extends Dialog<AlumnoViewModel> {

    public ModificarAlumnoWindow(WindowOwner owner) {
        super(owner, new AlumnoViewModel());
    }

    @Override
    protected void createFormPanel(Panel panel) {
        new Label(panel).setText("Nombre");
        new TextBox(panel)
                .setWidth(80)
                .bindValueToProperty("nombreAlumno");
        new Label(panel).setText("Apellido");
        new TextBox(panel)
                .setWidth(80)
                .bindValueToProperty("apellidoAlumno");
        new Label(panel).setText("Legajo");
        new TextBox(panel)
                .setWidth(80)
                .bindValueToProperty("legajoAlumno");
        new Label(panel).setText("Usuario GitHub");
        new TextBox(panel)
                .setWidth(80)
                .bindValueToProperty("githubAlumno");


        new Button(panel).setCaption("Aceptar").onClick(this::accept);
        new Button(panel).setCaption("Cancelar").onClick(this::cancel).setAsDefault();

    }

}
