package Lab10_1;

import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;

    public CalculatorOneGUI(){
        fr = new JFrame("เครื่องคิดเลข");//Calculator but in Thai.
        p = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("*");
        btn4 = new JButton("/");

        fr.setLayout(new GridLayout(4,1));
        fr.add(txt1);
        fr.add(txt2);
        fr.add(p);

        p.setLayout(new FlowLayout());
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        fr.add(p);
        fr.add(txt3);

        fr.setSize(400,200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
