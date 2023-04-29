package Lab11_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2;
    private JButton btn1, btn2, btn3;
    private int money, total, bank;

    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        txt2 = new JTextField("6000");
        txt1 = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");

        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p1.add(lb1);
        p1.add(txt2);
        p2.setLayout(new GridLayout(1,2));
        p2.add(lb2);
        p2.add(txt1);
        p3.setLayout(new FlowLayout());
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        
        txt2.setEditable(false);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        fr.add(p1);
        fr.add(p2);
        fr.add(p3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn3)) {
            System.exit(0);
        } else if (ae.getSource().equals(btn1)) {
            money = Integer.parseInt(txt1.getText());
            bank = Integer.parseInt(txt2.getText());
            total = bank + money;
            txt2.setText(total + "");
            
        } else if (ae.getSource().equals(btn2)) {
            money = Integer.parseInt(txt1.getText());
            bank = Integer.parseInt(txt2.getText());
            total = bank - money;
            txt2.setText(total + "");
            if (Integer.parseInt(txt2.getText()) < 0) {
                txt2.setText("0");
            }
        }
    }
}