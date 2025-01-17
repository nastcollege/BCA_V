package np.edu.nast.gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    private JButton btnOne, btnTwo, btnThree, btnFour, btnFive;
    private BorderLayout layout;

    public BorderLayoutDemo() {
        setTitle("Border LAyout Demo");
        layout=new BorderLayout(20,20);
        setLayout(layout);

        btnOne= new JButton("EAST");
        btnTwo= new JButton("WEST");
        btnThree= new JButton("NORTH");
        btnFour= new JButton("SOUTH");
        btnFive= new JButton("CENTER");

        add(btnOne, BorderLayout.EAST);
        add(btnTwo, BorderLayout.WEST);
        add(btnThree, BorderLayout.NORTH);
        add(btnFour, BorderLayout.SOUTH);
        add(btnFive, BorderLayout.CENTER);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
