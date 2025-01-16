package np.edu.nast.gui;

import javax.swing.*;
import java.awt.*;

public class SignupPage extends JFrame {
    JLabel lblFirstName, lblLastName, lblEmail, lblPassword, lblConfirmPassword;
    JTextField txtFirstName, txtLastName, txtEmail, txtPassword, txtConfirmPassword;
    JButton btnSignup;

    public SignupPage() {
        setLayout(new GridLayout(6, 2,1,10));
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

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblEmail);
        add(txtEmail);
        add(lblPassword);
        add(txtPassword);
        add(lblConfirmPassword);
        add(txtConfirmPassword);
        add(new JLabel());
        add(btnSignup);

        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupPage();
    }
}
