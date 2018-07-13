package ui.windows;

import model.Tarea;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import ui.viewModel.ViewModel;


public class VerNotasWindow extends Dialog<ViewModel> {

    public VerNotasWindow(WindowOwner owner) {
        super(owner, new ViewModel());
    }

    @Override
    protected void createFormPanel(Panel panel) {

        this.setTitle("Ver notas");
        panel.setLayout(new VerticalLayout());

        Table<Tarea> unaTabla = new Table<Tarea>(panel, Tarea.class);
        
        unaTabla.bindItemsToProperty("tareas");
        new Column<>(unaTabla)
                .setTitle("Nombre")
                .setFixedSize(160)
                .bindContentsToProperty("nombre");

        new Column<>(unaTabla)
                .setTitle("Aprobado")
                .setFixedSize(100)
                .bindContentsToProperty("aprobado").setTransformer(new Transformador());;


        new Column<>(unaTabla)
                .setTitle("Ultima nota")
                .setFixedSize(100)
                .bindContentsToProperty("ultimaNota");

    }


    @Override
    protected void addActions(Panel actions) {
        new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();

    }
}