package np.edu.nast.gui;

import java.awt.*;

public class WelcomeFrame extends Frame {
    private Label lblWelcome;

    public WelcomeFrame() {
        lblWelcome = new Label("Welcome BCA to AWT Programming");
        add(lblWelcome);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomeFrame();
    }
}
