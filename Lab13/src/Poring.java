import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Poring implements Runnable {
    private JLabel lPoring, lCount;
    private JFrame frame;
    
    public Poring(int num) {
        frame = new JFrame();
        frame.getContentPane().setPreferredSize(new Dimension(500, 550));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Random rand = new Random();
        int x = rand.nextInt(screenSize.width - frame.getWidth());
        int y = rand.nextInt(screenSize.height - frame.getHeight());
        frame.setLocation(x, y);
        lPoring = new JLabel(new ImageIcon("src\\sooksan_phobia.jpg"));
        frame.setLayout(new BorderLayout());
        lCount = new JLabel(String.valueOf(num));
        frame.add(lPoring, BorderLayout.CENTER);
        frame.add(lCount, BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public static void main(String[] args) {
        for (int i = 1; i < 300; i++) {
            Thread thread = new Thread(new Poring(15));
            thread.start();
        
        }
        System.exit(0);
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int dx = new Random().nextInt(5)-2;
            frame.setLocation(frame.getX()+dx, frame.getY()+dx);
        }
    }
}
