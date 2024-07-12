import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("NULL LAYOUT");
        JButton b1 =new JButton("B1");
        JButton b2 =new JButton("B2");
        JButton b3 =new JButton("B3");
        JButton b4 =new JButton("B4");
        JButton b5 =new JButton("B5");

        b1.setBounds(50,50,80,30);
        b2.setBounds(200, 50, 80, 30);
        b3.setBounds(350, 50, 80, 30);
        b4.setBounds(50, 200, 80, 30);
        b5.setBounds(200, 200, 80, 30);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.setLayout(null);
        frame.setSize(500,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
