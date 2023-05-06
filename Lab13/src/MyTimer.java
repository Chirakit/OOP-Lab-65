import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyTimer extends JLabel implements Runnable{
    private int sec;
    private int min;
    private int hour;
    public boolean isEnable = true;
    
    public MyTimer() {
        this.sec = 0;
        this.min = 0;
        this.hour = 0;
    }
    public synchronized void resumeTimer() {
        isEnable = true;
        this.notify();
    }
    public synchronized void pauseTimer() {
        isEnable = false;
    }
    public synchronized void checkPause() {
        while(!isEnable) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void run() {
        while(true) {
            checkPause();
            Font thaiFont = new Font("Tahoma", Font.BOLD, 30);
            this.setFont(thaiFont);

            this.setText(String.format("%02d:%02d:%02d", hour, min, sec));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
            sec++;
            if(sec == 60) {
                sec = 0;
                min++;
                if(min == 60) {
                    min = 0;
                    hour++;
                }
            }
        }
    }
}
