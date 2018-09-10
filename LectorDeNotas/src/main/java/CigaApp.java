import model.AlgunosDatos;
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import ui.windows.LoginWindow;

public class CigaApp extends Application {

    public static void main(String[] args) {
        AlgunosDatos.initialize();
        new CigaApp().start();
    }

    @Override
    protected Window<?> createMainWindow() {
        return new LoginWindow(this);

    }
}