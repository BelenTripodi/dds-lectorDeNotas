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

        new Column<>(unaTabla)
                .setTitle("Nombre")
                .setFixedSize(100)
                .bindContentsToProperty("tareas");

        new Column<>(unaTabla)
                .setTitle("Nota actual")
                .setFixedSize(100)
                .bindContentsToProperty("ultimaNota");

        new Column<>(unaTabla)
                .setTitle("Aprobado")
                .setFixedSize(100)
                .bindContentsToProperty("tareas");

    }


    @Override
    protected void addActions(Panel actions) {
        new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();

    }

    @Override
    protected void executeTask() {
        super.executeTask();
    }


}


/*Table<Customer> table = new Table<Celular>(mainPanel, Customer.class);
table.bindItemsToProperty("results");
table.bindValueToProperty("selectedCustomer");

new Column<Celular>(table) //
    .setTitle("Name")
    .setFixedSize(250)
    .bindContentsToProperty("fullName");


 * */
