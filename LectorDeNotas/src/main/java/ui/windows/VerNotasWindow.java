package ui.windows;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import ui.viewModel.VerNotasViewModel;


public class VerNotasWindow extends Dialog<VerNotasViewModel> {

    public VerNotasWindow(WindowOwner owner) {
        super(owner, new VerNotasViewModel());
    }

    @Override
    protected void createFormPanel(Panel form) {

    	Panel panel = new Panel(form);
        this.setTitle("CIGA - Ver notas");
        panel.setLayout(new ColumnLayout(1)); //Aca era VerticaLayout

        
        
        new Label(panel).setText("Nombre");
        TextBox nombre = new TextBox(panel);
        nombre.setWidth(600).bindValueToProperty("nombre");

        new Label(panel).setText("Aprobado");
        TextBox apellido = new TextBox(panel);
        apellido.setWidth(600)
                .bindValueToProperty("aprobado");

        new Label(panel).setText("Ultima nota");
        TextBox legajo = new TextBox(panel);
        legajo.setWidth(600)
                .bindValueToProperty("ultimaNota");

//        Table<Asignacion> unaTabla = new Table<Asignacion>(panel, Asignacion.class);

        
        

//        unaTabla.bindItemsToProperty("asignaciones");
//        new Column<>(unaTabla)
//                .setTitle("Nombre")
//                .setFixedSize(160)
//                .bindContentsToProperty("nombre");
//
//        new Column<>(unaTabla)
//                .setTitle("Aprobado")
//                .setFixedSize(100)
//                .bindContentsToProperty("aprobado").setTransformer(new Transformador());
//
//
//        new Column<>(unaTabla)
//                .setTitle("Ultima nota")
//                .setFixedSize(100)
//                .bindContentsToProperty("ultimaNota");

    }

}