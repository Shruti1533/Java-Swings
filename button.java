import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        // Create buttons
        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 100, 100, 40);
        
        JButton button2 = new JButton("Button 2");
        button2.setBounds(200, 100, 100, 40);
        
        // Add action listeners to the buttons
        button1.addActionListener(new ButtonClickListener());
        button2.addActionListener(new ButtonClickListener());

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to create and show a new frame
    public static void createAndShowNewFrame(String title) {
        JFrame newFrame = new JFrame(title);
        newFrame.setSize(300, 200);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setVisible(true);
    }

    // ActionListener class
    static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            String title = sourceButton.getText() + " Window";
            createAndShowNewFrame(title);
        }
    }
}


//https://chatgpt.com/c/2955d40d-93d1-4958-b6a3-175d472bb60b