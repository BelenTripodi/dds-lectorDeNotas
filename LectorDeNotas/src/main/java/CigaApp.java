import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

import ui.windows.MyMainWindow;

public class CigaApp extends Application {

    public static void main(String[] args) {
        new CigaApp().start();
    }

    @Override
    protected Window<?> createMainWindow() {
        return new MyMainWindow(this);

    }
}