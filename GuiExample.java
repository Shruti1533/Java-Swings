import javax.swing.*;
import java.awt.event.*;

public class GuiExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Simple GUI Example");
        
        JLabel l1 = new JLabel("Enter your name");
        JLabel l2 = new JLabel("Enter your Contact");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("SUBMIT");

        l1.setBounds(10, 50, 150, 30);
        t1.setBounds(250, 50, 200, 30);
        
        l2.setBounds(10, 100, 150, 30);
        t2.setBounds(250, 100, 200, 30);
        
        b.setBounds(200, 150, 100, 30);
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
            String name = t1.getText();
            String contact = t2.getText();
            String message = "Name: " + name + "\nContact: " + contact;
            JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
