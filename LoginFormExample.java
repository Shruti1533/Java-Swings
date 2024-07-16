import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFormExample {
    
    public static void create() {
        JFrame frame = new JFrame("Home Screen");
        frame.setLayout(null);

        // Create components
        JLabel head = new JLabel("Welcome to the Home Screen", SwingConstants.CENTER);
        JLabel forgot = new JLabel("Forgot Password?", SwingConstants.CENTER);
        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Password:");

        JTextField tf1 = new JTextField();
        JPasswordField tf2 = new JPasswordField();

        JButton button = new JButton("LOG IN");

        // Set bounds for components
        head.setBounds(50, 20, 300, 30);
        forgot.setBounds(120,250,150,30);
        l1.setBounds(50, 70, 100, 30);
        tf1.setBounds(150, 70, 200, 30);
        l2.setBounds(50, 120, 100, 30);
        tf2.setBounds(150, 120, 200, 30);
        button.setBounds(150, 180, 100, 30);

        button.addActionListener(new ButtonClickListener());
        
        forgot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Now you can reset the password");
            }
        });

        // Set colors for components
        head.setForeground(Color.WHITE);
        forgot.setForeground(Color.RED);
        l1.setForeground(Color.LIGHT_GRAY);
        l2.setForeground(Color.LIGHT_GRAY);
        
        button.setBackground(new Color(0, 153, 76));
        button.setForeground(Color.WHITE);
        tf1.setBackground(new Color(50, 50, 50));
        tf1.setForeground(Color.WHITE);
        tf2.setBackground(new Color(50, 50, 50));
        tf2.setForeground(Color.WHITE);

        // Set frame background color
        frame.getContentPane().setBackground(new Color(40, 40, 40));  // Modern dark gray background

        // Add components to frame
        frame.add(head);
        frame.add(forgot);
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(button);

        // Frame settings
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        create();
    }

    static class ButtonClickListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "You are logged in", "LOGIN STATUS", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}