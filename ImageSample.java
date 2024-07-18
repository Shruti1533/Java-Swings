import javax.swing.*;
import java.awt.*;

public class ImageSample {
    public static void create() {
        JFrame frame = new JFrame("Image Frame Example");

        frame.setLayout(new BorderLayout());

        ImageIcon icon = new ImageIcon("local.jpg");
        JLabel label = new JLabel(icon);
        frame.add(label, BorderLayout.CENTER);

         // Get the screen size
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

         // Use a proportion of the screen size (e.g., 80% of width and height)
         int width = (int) (screenSize.width * 0.8);
         int height = (int) (screenSize.height * 0.8);
 
         frame.setSize(width, height);
 
         // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        create();
    }
}