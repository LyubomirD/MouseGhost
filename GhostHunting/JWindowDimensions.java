package working_projects.GhostHunting;

import javax.swing.*;

public class JWindowDimensions extends JWindow {
    //Initialisation the abstract Class
    protected JWindow window;

    //DI with constructor
    public JWindowDimensions(JWindow window) {
        this.window = window;
    }

    //Window method that makes it visible
    public void WindowCreation() {
        window.setSize(100, 100);
        window.setAlwaysOnTop(true);
        window.setVisible(true);
    }

}
