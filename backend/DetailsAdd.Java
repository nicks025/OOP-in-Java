package backend;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DetailsAdd {
    JFrame frame1 = new JFrame("Student panel");
    JLabel idlabel, userlabel, emaillabel, genderlabel, facultylabel;
    JTextField idtext, usertext, emailtext;
    JRadioButton r1, r2;
    JComboBox<String> jc;
    JButton btninsert, btnresert, btndelete, btnupdate, btndisplay;
    ButtonGroup bg;

    public DetailsAdd() {
        idlabel = new JLabel("ID");
        idlabel.setBounds(30, 50, 100, 30);
        idtext = new JTextField();
        idtext.setBounds(150, 50, 100, 30);

        userlabel = new JLabel("Username");
        userlabel.setBounds(30, 100, 100, 30);
        usertext = new JTextField();
        usertext.setBounds(150, 100, 100, 30);

        emaillabel = new JLabel("Email");
        emaillabel.setBounds(30, 150, 100, 30);
        emailtext = new JTextField();
        emailtext.setBounds(150, 150, 100, 30);

        genderlabel = new JLabel("Gender");
        genderlabel.setBounds(30, 200, 100, 30);
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        r1.setBounds(150, 200, 100, 50);
        r2.setBounds(250, 200, 100, 50);
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        facultylabel = new JLabel("Faculty");
        facultylabel.setBounds(50, 250, 100, 30);
        String[] facultydetails = {"bca", "bbm", "bit", "bsc.cs.it"};
        jc = new JComboBox<>(facultydetails);
        jc.setBounds(150, 250, 100, 30);

        btninsert = new JButton("Insert");
        btninsert.setBounds(50, 300, 100, 30);

        btnresert = new JButton("Reset");
        btnresert.setBounds(150, 300, 100, 30);

        btnupdate = new JButton("Update");
        btnupdate.setBounds(50, 350, 100, 30);

        btndelete = new JButton("Delete");
        btndelete.setBounds(150, 350, 100, 30);

        btndisplay = new JButton("Display");
        btndisplay.setBounds(100, 400, 100, 30);

        btnresert.addActionListener(e -> {
            idtext.setText("");
            usertext.setText("");
            emailtext.setText("");
        });

        btninsert.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            String s2 = usertext.getText();
            String s3 = emailtext.getText();
            String gender = r1.isSelected() ? r1.getText() : r2.getText();
            String s4 = (String) this.jc.getSelectedItem();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "")) {
                try (Statement stmt = conn.createStatement()) {
                    String query = String.format("INSERT INTO bca_detail (id, name, email, gender, faculty) VALUES ('%d', '%s', '%s', '%s', '%s')", i1, s2, s3, gender, s4);
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(frame1, "Insert successful");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        });

        btndelete.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "")) {
                try (Statement stmt = conn.createStatement()) {
                    String query = String.format("DELETE FROM bca_detail WHERE id='%d'", i1);
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(frame1, "Delete successful");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        });

        btnupdate.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            String s2 = usertext.getText();
            String s3 = emailtext.getText();
            String gender = r1.isSelected() ? r1.getText() : r2.getText();
            String s4 = (String) this.jc.getSelectedItem();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "")) {
                try (Statement stmt = conn.createStatement()) {
                    String query = String.format("UPDATE bca_detail SET name='%s', email='%s', gender='%s', faculty='%s' WHERE id='%d'", s2, s3, gender, s4, i1);
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(frame1, "Update successful");
                }
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
        });

        btndisplay.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            String s2 = usertext.getText();
            String s3 = emailtext.getText();
            String gender = r1.isSelected() ? r1.getText() : r2.getText();
            String s4 = (String) this.jc.getSelectedItem();

            JOptionPane.showMessageDialog(frame1, "ID: " + i1 + " Name: " + s2 + " Email: " + s3 + " Gender: " + gender + " Faculty: " + s4);
            System.out.println("ID: " + i1 + " Name: " + s2 + " Email: " + s3 + " Gender: " + gender + " Faculty: " + s4);
        });

        frame1.add(idlabel);
        frame1.add(idtext);
        frame1.add(userlabel);
        frame1.add(usertext);
        frame1.add(emaillabel);
        frame1.add(emailtext);
        frame1.add(genderlabel);
        frame1.add(r1);
        frame1.add(r2);
        frame1.add(facultylabel);
        frame1.add(jc);
        frame1.add(btnresert);
        frame1.add(btndisplay);
        frame1.add(btndelete);
        frame1.add(btnupdate);
        frame1.add(btninsert);
        frame1.setSize(500, 500);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DetailsAdd();
    }
}
