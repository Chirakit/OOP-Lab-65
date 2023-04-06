package Lab10_4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        } SwingUtilities.invokeLater(() -> {MDIFromGUI fr = new MDIFromGUI();});
    }
}
