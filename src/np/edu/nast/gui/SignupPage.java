package np.edu.nast.gui;

import javax.swing.*;
import java.awt.*;

public class SignupPage extends JFrame {
    JLabel lblFirstName, lblLastName, lblEmail, lblPassword, lblConfirmPassword;
    JTextField txtFirstName, txtLastName, txtEmail, txtPassword, txtConfirmPassword;
    JButton btnSignup;

    public SignupPage() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 5, 5));
        // setLayout();
        setTitle("Signup Page");

        lblFirstName = new JLabel("First Name");
        txtFirstName = new JTextField(20);

        lblLastName = new JLabel("Last Name");
        txtLastName = new JTextField(20);

        lblEmail = new JLabel("Email");
        txtEmail = new JTextField(30);

        lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField(20);

        lblConfirmPassword = new JLabel("Confirm Password");
        txtConfirmPassword = new JPasswordField(20);

        btnSignup = new JButton("Signup");

        panel.add(lblFirstName);
        panel.add(txtFirstName);
        panel.add(lblLastName);
        panel.add(txtLastName);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(lblConfirmPassword);
        panel.add(txtConfirmPassword);
        panel.add(new JLabel());
        panel.add(btnSignup);
        add(panel, BorderLayout.CENTER);

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
