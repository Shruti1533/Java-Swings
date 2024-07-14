import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FLOW LAYOUT");

        //Layout is set to the Frame itself 
        frame.setLayout(new FlowLayout());

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
