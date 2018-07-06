package ui.windows;


import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.WindowOwner;

public class ListadoDeNotas extends SimpleWindow<AlgoViewModel> {

	public ListadoDeNotas(WindowOwner parent) {
		super(parent, new AlgoViewModel());
	}

	@Override
	protected void addActions(Panel panelActions) {
		new Button(panelActions)
		.setCaption("Nueva venta")
		.onClick(this::registrarVenta);
	}

	protected void createFormPanel(Panel formPanel) {
		this.setTitle("Macowins - Ventas");
		
		Table tableVentas = new Table<>(formPanel, Nota.class);
		Column<Venta> columnaFecha = new Column<Venta>(tableVentas);
		columnaFecha.setTitle("Fecha");
		
		Column<Venta> columnaPrenda = new Column<Venta>(tableVentas);
		columnaPrenda.setTitle("Prenda");
		
		Column<Venta> columnaUnidades = new Column<Venta>(tableVentas);
		columnaUnidades.setTitle("Prenda");
		
		tableVentas.setHeight(300);
		tableVentas.setWidth(600);
	}

	public void registrarVenta() {
		Dialog<?> dialog = new RegistrarVentaWindow(this);
		dialog.open();
		dialog.onAccept(() -> {});
	}

	
}
