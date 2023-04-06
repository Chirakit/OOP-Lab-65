package Lab10_4;

import javax.swing.*;
import java.awt.*;

public class MDIFromGUI {
    private JDesktopPane dskp;
    private JInternalFrame frame1, frame2, frame3;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;

    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        dskp = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);

        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(ms1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        ms1.add(msi1);
        ms1.addSeparator();//It will separate into menu box.
        ms1.add(msi2);

        frame1.add(new JLabel());
        frame1.setSize(300,200);
        frame1.setVisible(true);

        frame2.add(new JLabel());
        frame2.setSize(300,200);
        frame2.setVisible(true);

        frame3.add(new JLabel());
        frame3.setSize(300,200);
        frame3.setVisible(true);
       
        int x1 = frame1.getX();
        int y1 = frame1.getY() + 250;
        frame1.setLocation(x1, y1);
        
        int x2 = frame2.getX() + 200;
        int y2 = frame2.getY() +50;
        frame2.setLocation(x2, y2);
        
        int x3 = frame3.getX() + frame3.getWidth() + 150;
        int y3 = frame3.getY() + 200;
        frame3.setLocation(x3, y3);

        dskp.add(frame1);
        dskp.add(frame2);
        dskp.add(frame3);
        
        fr.add(dskp, BorderLayout.CENTER);
        fr.setMinimumSize(new Dimension(800, 600));
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(800,600);
        fr.setVisible(true);
    }
}
