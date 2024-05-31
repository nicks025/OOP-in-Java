package layout;

import javax.swing.*;

public class calculator extends JFrame {
    JLabel number, square;
    JTextField numfield, squfield;
    JButton calc, clean;
    public void Calculator (){

        number = new JLabel("Number");
        number.setBounds(10,10,100,30);
        numfield=new JTextField();
        numfield.setBounds(160,10,100,30);

        square=new JLabel("Square");
        square.setBounds(10,70,100,30);
        squfield=new JTextField();
        squfield.setBounds(160,70,100,30);

        calc=new JButton();
        calc.setBounds(10,120,100,30);

        clean=new JButton();
        clean.setBounds(150,120,100,30);
        clean.addActionListener(e-> {
            numfield.setText("");
            squfield.setText("");
        });
        calc.addActionListener(e->{
            int number=Integer.parseInt(numfield.getText());
            int squre= number*number;
            squfield.setText(String.valueOf(squre));
        });
        add(number);
        add(numfield);
        add(square);
        add(squfield);
        add(calc);
        add(clean);
        setSize(100,100);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new calculator();
    }
}
