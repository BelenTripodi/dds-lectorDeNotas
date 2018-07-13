package ui.windows;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import ui.viewModel.ViewModel;

public class MyMainWindow extends MainWindow<ViewModel> {

    public MyMainWindow() {
        super(new ViewModel());
    }

    public static void main(String[] args) {
        new MyMainWindow().startApplication();
    }

    @Override
    public void createContents(Panel mainPanel) {
        this.setTitle("CIGA");
        mainPanel.setLayout(new VerticalLayout());

        new Label(mainPanel).setText("Ingrese la opcion deseada");

        new Button(mainPanel)
                .setCaption("Modificar datos")
                .onClick(() -> new ModificarAlumnoWindow(this).open());


        new Button(mainPanel)
                .setCaption("Ver notas")
                .onClick(() -> new VerNotasWindow(this).open());
    }
}

