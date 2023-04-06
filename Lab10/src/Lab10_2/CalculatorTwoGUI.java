package Lab10_2;

import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15;

    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField();
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("c");
        btn11 = new JButton("=");
        btn12 = new JButton("+");
        btn13 = new JButton("-");
        btn14 = new JButton("x");
        btn15 = new JButton("/");

        p.setLayout(new GridLayout(4,4));
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn12);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn13);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn14);
        p.add(btn0);
        p.add(btn10);
        p.add(btn11);
        p.add(btn15);

        fr.setLayout(new BorderLayout());
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p);

        fr.setSize(400,350);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
