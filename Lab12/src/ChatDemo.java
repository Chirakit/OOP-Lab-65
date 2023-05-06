import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame frame;
    private JPanel p1;
    private JTextArea txtarea;
    private JTextField txtfield;
    private JButton subbtn, rebtn;
    private String chatHistory;

    public ChatDemo() {
        frame = new JFrame("ChatDemo");
        Font thaiFont = new Font("Tahoma", Font.BOLD, 14);
        p1 = new JPanel();
        txtarea = new JTextArea(20, 45);
        txtfield = new JTextField(45);
        subbtn = new JButton("Submit");
        rebtn = new JButton("Reset");

        p1.add(subbtn);
        p1.add(rebtn);
        
        subbtn.addActionListener(this);
        rebtn.addActionListener(this);

        txtarea.setFont(thaiFont);
        txtfield.setFont(thaiFont);
        txtarea.setEditable(false);

        frame.addWindowListener(this);
        frame.add(txtarea, BorderLayout.NORTH);
        frame.add(txtfield, BorderLayout.CENTER);
        frame.add(p1, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ac) {
        if(ac.getSource().equals(subbtn)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String txt = dtf.format(LocalDateTime.now()) + " : " + txtfield.getText();
            txtarea.append("\n" + txt);
            txtfield.setText("");
        } else if(ac.getSource().equals(rebtn)) {
            txtarea.setText("");
            txtfield.setText("");
        }
    }
    public void windowOpened(WindowEvent we) {
        File file = new File("ChatDemo.dat");
        if(file.exists() == false) {
            try {
                file.createNewFile();
            } catch(IOException io) {
                io.printStackTrace();
            }
        }
        try(FileReader f = new FileReader("ChatDemo.dat");) {
            String txt = "";
            int data = f.read();
            while(data != -1) {
                System.out.print((char)data);
                txt += (char)data;
                data = f.read();
            }
            txtarea.setText(txt);
        } catch(IOException io) {
            io.printStackTrace();
        }
    }
    public void windowClosing(WindowEvent we) {
         if (we.getSource().equals(frame)){
            try(FileWriter fw = new FileWriter("ChatDemo.dat");){
                fw.write(txtarea.getText());
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }
    public void windowClosed(WindowEvent e) {
    }
    public void windowIconified(WindowEvent e) {
    }
    public void windowDeiconified(WindowEvent e) {
    }
    public void windowActivated(WindowEvent e) {
    }
    public void windowDeactivated(WindowEvent e) {
    }
}
