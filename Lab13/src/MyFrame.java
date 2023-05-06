import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame implements MouseListener{
    private JFrame fr;
    private MyClock clock;
    private MyTimer tm;
    private Thread t, tt;

    public MyFrame() {
        fr = new JFrame();
        fr.setLocationRelativeTo(null);
        fr.getContentPane().setPreferredSize(new Dimension(300, 50));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        
        /*
        clock = new MyClock();
        t = new Thread(clock);
        */
        
        tm = new MyTimer();
        tt = new Thread(tm);
        tm.addMouseListener(this);

        
        
        tt.start();
        fr.add(tm);
        
        
        /*
        t.start();
        fr.add(clock);
        */
        
        fr.setVisible(true);
        fr.pack();
    }
    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(tm.isEnable) {
            tm.setForeground(Color.red);
            tm.pauseTimer();
        } else {
            tm.setForeground(Color.black);
            tm.resumeTimer();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
