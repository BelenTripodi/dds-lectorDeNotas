import com.sun.org.apache.bcel.internal.generic.Select;
import org.eclipse.swt.widgets.Combo;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;

import java.awt.*;

public class MyMainWindow extends MainWindow<Conversor> {

    public MyMainWindow() {
        super(new Conversor());
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

        new NumericField(mainPanel).bindValueToProperty("millas");

        new Button(mainPanel)
                .setCaption("Convertir a kilómetros")
                .onClick(() -> new );

        new Label(mainPanel) //
                .setBackground(Color.ORANGE)
                .bindValueToProperty("kilometros");

        new Label(mainPanel).setText(" kilómetros");
    }

    //TODO FIJARME SI CUANDO NO COMPLETO UN NUMERIC FIELD ES NULL

    public static void main(String[] args) {
        new ConversorWindow().startApplication();
    }
}

