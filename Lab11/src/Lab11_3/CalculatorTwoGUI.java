package Lab11_3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculatorTwoGUI implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JTextArea txt;
    private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15;
    private char operator;
    private double num1, num2, result;

    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextArea();
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

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        
        fr.setLayout(new BorderLayout());
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p);

        fr.setSize(400,350);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(btn10)) {
            txt.setText("");
        } else if (ae.getSource().equals(btn0)) {
            txt.append("0");
        } else if (ae.getSource().equals(btn1)) {
            txt.append("1");
        } else if (ae.getSource().equals(btn2)) {
            txt.append("2");
        } else if (ae.getSource().equals(btn3)) {
            txt.append("3");
        } else if (ae.getSource().equals(btn4)) {
            txt.append("4");
        } else if (ae.getSource().equals(btn5)) {
            txt.append("5");
        } else if (ae.getSource().equals(btn6)) {
            txt.append("6");
        } else if (ae.getSource().equals(btn7)) {
            txt.append("7");
        } else if (ae.getSource().equals(btn8)) {
            txt.append("8");
        } else if (ae.getSource().equals(btn9)) {
            txt.append("9");
        } else if (ae.getSource().equals(btn12)) {
            num1 = Double.parseDouble(txt.getText());
            operator = '+';
            txt.setText("");
        } else if (ae.getSource().equals(btn13)) {
            num1 = Double.parseDouble(txt.getText());
            operator = '-';
            txt.setText("");
        } else if (ae.getSource().equals(btn14)) {
            num1 = Double.parseDouble(txt.getText());
            operator = '*';
            txt.setText("");
        } else if (ae.getSource().equals(btn15)) {
            num1 = Double.parseDouble(txt.getText());
            operator = '/';
            txt.setText("");
        } else if (ae.getSource().equals(btn11)) {
            num2 = Double.parseDouble(txt.getText());
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            txt.setText(result + "");
        }
    }
}