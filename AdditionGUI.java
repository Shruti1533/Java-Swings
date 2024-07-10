import javax.swing.*;
import java.awt.event.*;


public class AdditionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition GUI");
        
        JLabel l1 = new JLabel("Enter number 1");
        JLabel l2 = new JLabel("Enter number 1");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("CALCULATE");

        l1.setBounds(10, 50, 150, 30);
        t1.setBounds(250, 50, 200, 30);
        
        l2.setBounds(10, 100, 150, 30);
        t2.setBounds(250, 100, 200, 30);
        
        b.setBounds(200, 150, 150, 30);
        b.addActionListener(new ButtonClickListener(t1, t2));

        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class ButtonClickListener implements ActionListener {
        private JTextField t1, t2;

        public ButtonClickListener(JTextField t1, JTextField t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String n1 = t1.getText();
            String n2 = t2.getText();

            int num1=Integer.valueOf(n1);
            int num2=Integer.valueOf(n2);
            int add=num1+num2;

            String message = "Addition of 2 numbers= " + add;
            JOptionPane.showMessageDialog(null, message, "Addition", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
