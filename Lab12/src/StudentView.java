import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentView extends JFrame implements ActionListener {
    public JPanel p1, p2, p3, p4, p5, p6;
    public JTextField t1, t2, t3;
    public JButton depobtn, witbtn;
    public static Student std = new Student("", -1, 0);

    public StudentView() {
        p1 = new JPanel(new GridLayout(1, 0));
        t1 = new JTextField();
        p1.add(new JLabel("  ID:"));
        p1.add(t1);

        p2 = new JPanel(new GridLayout(1, 0));
        t2 = new JTextField();
        p2.add(new JLabel("  Name:"));
        p2.add(t2);

        p3 = new JPanel(new GridLayout(1, 0));
        p3.add(new JLabel("  Money:"));
        t3 = new JTextField();
        t3.setEditable(false);
        t3.setText(std.getMoney() + "");
        p3.add(t3);

        p4 = new JPanel(new FlowLayout());
        depobtn = new JButton("Deposite");
        witbtn = new JButton("Withdraw");
        p4.add(depobtn);
        p4.add(witbtn);

        p5 = new JPanel(new GridLayout(4, 0));
        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);

        depobtn.addActionListener(this);
        witbtn.addActionListener(this);

        
        File f = new File("StudentM.dat");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try (FileOutputStream fout = new FileOutputStream(f);
                ObjectOutputStream obj = new ObjectOutputStream(fout)) {
                    if (t1.getText().isEmpty()) {
                        std.setID(-1);
                    }else {
                        std.setID(Integer.parseInt(t1.getText()));    
                    }
                    std.setName(t2.getText()); std.setMoney(std.getMoney());
                    obj.writeObject(std);
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        });
        
        if (f.exists()) {
            try (FileInputStream fine = new FileInputStream(f);
            ObjectInputStream objin = new ObjectInputStream(fine)) {
                std = (Student) objin.readObject();
                if (std.getID() == -1) {
                    t1.setText("");
                } else {
                    t1.setText(std.getID() + ""); 
                }
                t2.setText(std.getName()); t3.setText(std.getMoney() + "");
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.toString());
            }
        }
        
        this.add(p5);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depobtn) {
            std.setMoney(std.getMoney() + 100);
            t3.setText(String.valueOf(std.getMoney()));
        }
        if (e.getSource() == witbtn) {
            if (std.getMoney() - 100  < 0) {
                t3.setText("0");
            } else{
                std.setMoney(std.getMoney() - 100);
                t3.setText(String.valueOf(std.getMoney()));
            }
        }
    }

    public static void main(String[] args) {
        new StudentView();
        System.out.println(std.getID());
    }
}

