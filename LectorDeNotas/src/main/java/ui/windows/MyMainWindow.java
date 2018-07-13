package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import ui.viewModel.NadaViewModel;


public class MyMainWindow extends SimpleWindow<NadaViewModel> {

    public MyMainWindow(WindowOwner parent) {
        super(parent, new NadaViewModel());
    }

    @Override
    protected void addActions(Panel panelActions) {
        panelActions.setLayout(new VerticalLayout());
        this.setTitle("CIGA");
        new Label(panelActions).setText("Ingrese la opcion deseada");
        new Button(panelActions)
                .setCaption("Modificar datos")
                .onClick(this::modificarDatos);

        new Button(panelActions)
                .setCaption("Ver notas")
                .onClick(this::verNotas);
    }

    public void verNotas() {
        Dialog<?> dialog = new VerNotasWindow(this);
        dialog.open();
        dialog.onAccept(() -> {
        });
    }

    public void modificarDatos() {
        Dialog<?> dialog = new ModificarAlumnoWindow(this);
        dialog.open();
        dialog.onAccept(() -> {
        });
    }


    protected void createFormPanel(Panel formPanel) {
        this.setTitle("CIGA");

    }

}

