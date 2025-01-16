package np.edu.nast.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm extends JFrame {
    private JTextField txtFirst, txtSecond;
    private JButton btnAdd, btnSub, btnMul, btnDiv;

    public CalculatorForm() {
        setTitle("Calculator");
        setLayout(null);

        txtFirst = new JTextField();
        txtFirst.setBounds(10, 20, 230, 30);

        txtSecond = new JTextField();
        txtSecond.setBounds(10, 60, 230, 30);

        btnAdd = new JButton("+");
        btnAdd.setBounds(10, 100, 50, 30);
        btnSub = new JButton("-");
        btnSub.setBounds(70, 100, 50, 30);
        btnMul = new JButton("x");
        btnMul.setBounds(130, 100, 50, 30);
        btnDiv = new JButton("/");
        btnDiv.setBounds(190, 100, 50, 30);

        add(txtFirst);
        add(txtSecond);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        add(txtFirst);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double n1 = Double.parseDouble(txtFirst.getText().toString());
                    Double n2 = Double.parseDouble(txtSecond.getText().toString());
                    JOptionPane.showMessageDialog(
                            CalculatorForm.this, (n1 + n2), "Sum",
                            JOptionPane.INFORMATION_MESSAGE);
                }catch (Exception er){
                    JOptionPane.showMessageDialog(
                            CalculatorForm.this, "Invalid Number",
                            "Wrong User Input",
                            JOptionPane.WARNING_MESSAGE);

                }
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(txtFirst.getText().toString());
                    Double n2 = Double.parseDouble(txtSecond.getText().toString());
                    JOptionPane.showMessageDialog(CalculatorForm.this,(n1-n2),"sub",
                            JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception er){
                    JOptionPane.showMessageDialog(CalculatorForm.this,"invalid Number",
                            "Wrong User Input",JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });

        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(txtFirst.getText().toString());
                    Double n2 = Double.parseDouble(txtSecond.getText().toString());
                    JOptionPane.showMessageDialog(CalculatorForm.this,(n1*n2),"Mul",
                            JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception er){
                    JOptionPane.showMessageDialog(CalculatorForm.this,"invalid Number",
                            "Wrong User Input",JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Double n1 = Double.parseDouble(txtFirst.getText().toString());
                    Double n2 = Double.parseDouble(txtSecond.getText().toString());
                    JOptionPane.showMessageDialog(CalculatorForm.this,(n1/n2),"Div",
                            JOptionPane.INFORMATION_MESSAGE);

                }catch (Exception er){
                    JOptionPane.showMessageDialog(CalculatorForm.this,"invalid Number",
                            "Wrong User Input",JOptionPane.INFORMATION_MESSAGE);

                }
            }
        });


        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorForm();
    }

}
