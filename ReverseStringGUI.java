import javax.swing.*;
import java.awt.event.*;

public class ReverseStringGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse String");
        
        JLabel l = new JLabel("Enter string:");
        l.setBounds(50, 50, 100, 30);
        
        JTextField tf = new JTextField();
        tf.setBounds(150, 50, 200, 30);
        
        JButton b = new JButton("Reverse");
        b.setBounds(150, 100, 100, 30);
        
        b.addActionListener(new ButtonClickListener(tf));
        
        frame.add(l);
        frame.add(tf);
        frame.add(b);
        
        frame.setLayout(null);
        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class ButtonClickListener implements ActionListener {
        private JTextField tf;

        ButtonClickListener(JTextField tf) {
            this.tf = tf;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String reversed = "";
            String s = tf.getText().trim();
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }

            String message = "Reversed: " + reversed;
            JOptionPane.showMessageDialog(null, message, "Reversed", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
