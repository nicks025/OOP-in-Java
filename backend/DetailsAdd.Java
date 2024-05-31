package backend;

import com.sun.jdi.connect.spi.Connection;

import javax.swing.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DetailsAdd {
    JFrame frame1 = new JFrame("Student panel");
    JLabel idlabel, userlabel, emaillabel, genderlabel, facultylabel;
    JTextField idtext, usertext, emailtext;
    JRadioButton r1, r2;
    JComboBox jc;
    JButton btninsert, btnresert, btndelete, btnupdate, btndisplay;
    ButtonGroup bg;
    public DataAdd() {
        idlabel=new JLabel("ID");
        idlabel.setBounds(30,50,100, 30);
        idtext= new JTextField();
        idtext.setBounds(150,50,100,30);

        userlabel=new JLabel("USername");
        userlabel.setBounds(30,100,100, 30);
        usertext= new JTextField();
        usertext.setBounds(150,100,100,30);

        emaillabel=new JLabel("Email");
        emaillabel.setBounds(30,150,100, 30);
        emailtext= new JTextField();
        emailtext.setBounds(150,150,100,30);

        genderlabel=new JLabel("Gender");
        genderlabel.setBounds(30,200,100, 30);
        r1= new JRadioButton("Male");
        r2=new JRadioButton("Female");
        r1.setBounds(150,200,100,50);
        r2.setBounds(250,200,100,50);
        bg =new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        facultylabel=new JLabel("Faculty");
        facultylabel.setBounds(50,250,100,30);
        String facultydetails[]= {"bca","bbm","bit","bsc.cs.it"};

        jc= new JComboBox(facultydetails);
        jc.setBounds(150,250,100,30);

        btninsert = new JButton("Inset");
        btninsert.setBounds(50,300,100,30);


        btnresert= new JButton("Resert");
        btnresert.setBounds(150,300,100,30);


        btnupdate= new JButton("Update");
        btnupdate.setBounds(50,350,100,30);

        btndelete = new JButton("Delete");
        btndelete.setBounds(150,350,100,30);


        btndisplay = new JButton("Display");
        btndisplay.setBounds(100,400,100,30);

        btnresert.addActionListener(e->{
            idtext.setText("");
            usertext.setText("");
            emailtext.setText("");
        });

        btninsert.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            String s2 = usertext.getText();
            String s3= emailtext.getText();;
            String s4 = (String)this.jc.getSelectedItem();
            if (r1.isSelected()) {
                s3=r1.getText();
            }else{
                s3=r2.getText();
            }
            System.out.println(+i1+s2+s3+s4);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("INSERT INTO `bca_detail` (`id`, `name`, `gender`,`faculty`)"+"VALUES ('" + i1 + "','" +s2+ "','" +s3+"','" +s4+"')");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "Insert succesful");
        });
        btnresert.addActionListener(e -> {
            this.idtext.setText("");
            this.emailtext.setText("");
            this.usertext.setText("");
            JOptionPane.showMessageDialog(frame1, "reset succesful");
        });
       btndelete.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("DELETE FROM bca_detail WHERE id='"+i1+"';");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "delete succesful");
        });
        btnupdate.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            String s2 = usertext.getText();
            String s3= emailtext.getText();
            String s4 = (String)this.jc.getSelectedItem();
            if (r1.isSelected()) {
                s3=r1.getText();
            }else{
                s3=r2.getText();
            }
            System.out.println(+i1+s2+s3+s4);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            Connection conn = null;
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bca", "root", "");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            }
            Statement stmt = null;
            int rs = 0;

            try {
                stmt = conn.createStatement();
                rs = stmt.executeUpdate("UPDATE bca_detail SET name= '"+s2+"',gender = '"+s3+"',faculty = '"+s4+"' WHERE id = "+i1+";");
            } catch (SQLException ex) {
                System.out.println("SQLException: " + ex.getMessage());
                System.out.println("SQLState: " + ex.getSQLState());
                System.out.println("VendorError: " + ex.getErrorCode());
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            JOptionPane.showMessageDialog(frame1, "update succesful");
        });
        btndisplay.addActionListener(e -> {
            int i1 = Integer.parseInt(idtext.getText());
            String s2 = usertext.getText();
            String s3= emailtext.getText();
            String s4 = (String)this.jc.getSelectedItem();
            if (r1.isSelected()) {
                s3=r1.getText();
            }else{
                s3=r2.getText();
            }
            JOptionPane.showMessageDialog(frame1,"id="+i1+" name="+s2+" gender="+s3+" faculty ="+s4);
            System.out.println(+i1+s2+s3+s4);
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
        frame1.setSize(500,500);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new DetailsAdd();
    }
}
