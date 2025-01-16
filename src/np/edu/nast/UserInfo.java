//package np.edu.nast;
//
//import javax.swing.*;
//import java.applet.Applet;
//import java.awt.*;
//
//public class UserInfo extends Applet {
//
//    @Override
//    public void init() {
//        setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        Label lblName = new Label("Enter Name");
//        TextField txtName = new TextField(20);
//        Label lblAddress = new Label("Enter Address");
//        TextField txtAddress = new TextField(20);
//        Label lblGender = new Label("Gender");
//
//        CheckboxGroup group = new CheckboxGroup();
//        Checkbox male = new Checkbox("Male", group, false);
//        Checkbox female = new Checkbox("Female", group, false);
//
//        Label lblCity = new Label("City");
//        List cityList = new List(4, false);
//        cityList.add("Biratnagar");
//        cityList.add("Kathmandu");
//        cityList.add("Bhaktapur");
//        cityList.add("Pokhara");
//
//        Button btnSubmit = new Button("Submit");
//        Button btnCancel = new Button("Cancel");
//
//        //Row 1
//        gbc.gridx=0;
//        gbc.gridy=0;
//        add(lblName,gbc);
//
//        gbc.gridx=1;
//        gbc.gridy=0;
//        add(txtName,gbc);
//
//        add(lblAddress);
//        add(txtAddress);
//
//        add(lblGender);
//        add(male);
//        add(female);
//
//        add(lblCity);
//        add(cityList);
//
//        add(btnSubmit);
//        add(btnCancel);
//    }
//}
