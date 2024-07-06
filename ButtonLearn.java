import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonLearn {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setLayout(null);

        JButton b = new JButton("CLICK");
        b.setBounds(200, 200, 100, 50);
        b.addActionListener(new ButtonClickListener());

        frame.add(b);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String data = "ACTION PERFORMED";
            show(data);
        }

        private void show(String data) {
            JFrame frame = new JFrame(data);
            JLabel l = new JLabel();
            l.setText("BUTTON IS CLICKED");
            l.setBounds(10, 50, 150, 50);

            frame.add(t);

            frame.setLayout(null);
            frame.setSize(500, 200);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}