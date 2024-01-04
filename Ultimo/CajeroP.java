package Ultimo;
import javax.swing.*;

public class CajeroP {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CajeroFrame cajeroFrame = new CajeroFrame();
            cajeroFrame.setVisible(true);
        });
    }
}