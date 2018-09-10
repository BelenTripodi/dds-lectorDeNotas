package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import ui.viewModel.BasicViewModel;


public class MyMainWindow extends SimpleWindow<BasicViewModel> {

    public MyMainWindow(WindowOwner parent) {
        super(parent, new BasicViewModel());
    }

    @Override
    protected void addActions(Panel panelActions) {
        panelActions.setLayout(new VerticalLayout());
        Label lblInicial = new Label(panelActions).setText("Seleccione la opción deseada");
        lblInicial.setWidth(300);
        lblInicial.setFontSize(10);
        new Button(panelActions)
                .setCaption("Ver notas")
                .onClick(this::verNotas);

        new Button(panelActions)
                .setCaption("Modificar datos")
                .onClick(this::modificarDatos);
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

