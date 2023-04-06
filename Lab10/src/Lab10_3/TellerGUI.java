package Lab10_3;

import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel lb1, lb2, lb3;
    private JTextField txt;
    private JButton btn1, btn2, btn3;

    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        lb3 = new JLabel("6000");
        txt = new JTextField();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");

        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p1.add(lb1);
        p1.add(lb3);
        p2.setLayout(new GridLayout(1,2));
        p2.add(lb2);
        p2.add(txt);
        p3.setLayout(new FlowLayout());
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);

        fr.add(p1);
        fr.add(p2);
        fr.add(p3);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
