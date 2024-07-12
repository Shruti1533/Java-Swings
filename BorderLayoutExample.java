import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class BorderLayoutExample{
    public static void main(String[] args) {
        JFrame frame = new JFrame("BORDER LAYOUT");

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");

        b1.setBackground(Color.BLUE);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.GREEN);
        b4.setBackground(Color.PINK);
        b5.setBackground(Color.YELLOW);

        b1.setPreferredSize(new Dimension(100, 50)); // Size for NORTH button
        b2.setPreferredSize(new Dimension(100, 50)); // Size for SOUTH button
        b3.setPreferredSize(new Dimension(50, 100)); // Size for EAST button
        b4.setPreferredSize(new Dimension(50, 100)); // Size for WEST button
        b5.setPreferredSize(new Dimension(300, 300)); // Size for CENTER button

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

