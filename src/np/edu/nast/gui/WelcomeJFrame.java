package np.edu.nast.gui;

import javax.swing.*;

public class WelcomeJFrame extends JFrame {
   private JLabel lblWelcome;
    public WelcomeJFrame(){
        lblWelcome= new JLabel("Welcome BCA to Java Swing");
        add(lblWelcome);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomeJFrame();
    }
}
