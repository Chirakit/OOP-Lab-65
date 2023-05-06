import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener {
    public JFrame fr;
    public int poringCount = 0;
    public JButton addbtn;
    public PoringConstructor() {
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.getContentPane().setPreferredSize(new Dimension(200, 50));
        fr.setResizable(false);
        
        addbtn = new JButton("Add");
        addbtn.addActionListener(this);
        
        fr.add(addbtn);
        fr.pack();
        fr.setVisible(true);
        fr.setAlwaysOnTop(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread thread = new Thread(new Poring(++poringCount));
        thread.start();
    }
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
