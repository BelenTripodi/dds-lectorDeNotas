package ui.windows;

import model.Asignacion;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import ui.viewModel.VerNotasViewModel;


public class VerNotasWindow extends Dialog<VerNotasViewModel> {

    public VerNotasWindow(WindowOwner owner) {
        super(owner, new VerNotasViewModel());
    }

    @Override
    protected void createFormPanel(Panel panel) {

        this.setTitle("CIGA - Ver notas");
        panel.setLayout(new VerticalLayout());

        Table<Asignacion> unaTabla = new Table<Asignacion>(panel, Asignacion.class);

        unaTabla.bindItemsToProperty("asignaciones");
        new Column<>(unaTabla)
                .setTitle("Nombre")
                .setFixedSize(160)
                .bindContentsToProperty("nombre");

        new Column<>(unaTabla)
                .setTitle("Aprobado")
                .setFixedSize(100)
                .bindContentsToProperty("aprobado").setTransformer(new Transformador());


        new Column<>(unaTabla)
                .setTitle("Ultima nota")
                .setFixedSize(100)
                .bindContentsToProperty("ultimaNota");

    }

}