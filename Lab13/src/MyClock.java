import java.awt.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {
    @Override
    public void run() {
        while(true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            
            Font thaiFont = new Font("Tahoma", Font.BOLD, 30);
            this.setFont(thaiFont);
            
            this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
