package np.edu.nast.gui;

import javax.swing.*;
import java.awt.*;

public class GridBagSignupPage {


    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Signup Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the panel with GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);

        // Create GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL; // Stretch components horizontally

        // First Name Label and Field
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("First Name"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JTextField(15), gbc);

        // Last Name Label and Field
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Last Name"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JTextField(15), gbc);

        // Email Label and Field
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Email"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JTextField(15), gbc);

        // Password Label and Field
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Password"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(new JPasswordField(15), gbc);

        // Confirm Password Label and Field
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(new JLabel("Confirm Password"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(new JPasswordField(15), gbc);

        // Signup Button
        gbc.gridx = 1;
        gbc.gridy = 5;
     //   gbc.gridwidth = 2; // Span across 2 columns
       // gbc.anchor = GridBagConstraints.CENTER;
        panel.add(new JButton("Signup"), gbc);

        // Set frame visibility
        frame.setVisible(true);
    }
}
