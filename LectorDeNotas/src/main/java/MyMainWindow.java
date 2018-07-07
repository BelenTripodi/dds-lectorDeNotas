import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import ui.ModificarAlumnoWindow;

import java.util.ArrayList;
import java.util.List;

public class MyMainWindow extends MainWindow<MyWindow> {

    private List<String> hola = new ArrayList<>();

    private List<String> iniciar() {
        hola.add("hola");
        hola.add("chau");
        return hola;
    }

    public MyMainWindow() {
        super(new MyWindow());
    }

    @Override
    public void createContents(Panel mainPanel) {
        this.setTitle("Conversor de millas a kilómetros");
        mainPanel.setLayout(new VerticalLayout());

        new Label(mainPanel).setText("Ingrese la opcion deseada");
        Selector hola = new Selector<Action>(mainPanel);


        Action modificarAlumno = new Action() {
            @Override
            public void execute() {
                //ir a ventana para modificar el alumno
            }
        };

        new Button(mainPanel)
                .setCaption("Aceptar")
                .onClick(() -> new ModificarAlumnoWindow(this).open());

    }

    //TODO FIJARME SI CUANDO NO COMPLETO UN NUMERIC FIELD ES NULL

    public static void main(String[] args) {
        new MyMainWindow().startApplication();
    }
}

