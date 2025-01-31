package np.edu.nast.db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentForm extends JFrame {

    private JTextField txtFirstName, txtLastName, txtEmail, txtMobile;
    private JButton btnSave;

    StudentForm() {

        setLayout(new GridBagLayout());

        txtFirstName = new JTextField(20);

        txtLastName = new JTextField(20);

        txtEmail = new JTextField(20);

        txtMobile = new JTextField(20);

        btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String fn = txtFirstName.getText();
                    String ln = txtLastName.getText();
                    String em = txtEmail.getText();
                    String mob = txtMobile.getText();
                    StudentRepo repo = new StudentRepo();
                    if (repo.saveStudentInfo(fn, ln, em, mob) > 0) {
                        JOptionPane.showMessageDialog(StudentForm.this, "Saved Successfully..");
                        txtFirstName.setText("");
                        txtLastName.setText("");
                        txtEmail.setText("");
                        txtMobile.setText("");
                    }else{
                        JOptionPane.showMessageDialog(StudentForm.this, "Sorry, Not Saved to database");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(StudentForm.this, "Sorry: "+ex.getMessage());
                }
            }
        });

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx=0;
        constraints.gridy=1;
        add(txtFirstName,constraints);

        constraints.gridx=0;
        constraints.gridy=2;
        add(txtLastName,constraints);

        constraints.gridx=0;
        constraints.gridy=3;
        add(txtEmail,constraints);

        constraints.gridx=0;
        constraints.gridy=4;
        add(txtMobile,constraints);

        constraints.gridx=0;
        constraints.gridy=5;
        add(btnSave,constraints);

        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
