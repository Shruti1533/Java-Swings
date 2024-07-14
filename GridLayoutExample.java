import javax.swing.*;
import java.awt.GridLayout;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BORDER LAYOUT");

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");
        JButton b7 = new JButton("B7");
        JButton b8 = new JButton("B8");
        JButton b9 = new JButton("B9");

        //rows=3,cols=3,horizontal-gap=10, vertical gap=10
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
