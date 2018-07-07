package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

public class ModificarAlumnoWindow extends Dialog<ModificarAlumno> {

    public ModificarAlumnoWindow(WindowOwner owner) {
        super(owner, new ModificarAlumno());
    }

    @Override
    protected void createFormPanel(org.uqbar.arena.widgets.Panel panel) {
        new Button(panel).setCaption("Hola");
    }
}
