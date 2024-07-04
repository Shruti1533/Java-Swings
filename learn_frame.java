import javax.swing.JFrame;

public class learn_frame{

    public static void main(String[] args) {
        
        //creates a new instance of JFrame
        //which is a window with decorations such as a border, and buttons to close, minimize, and maximize. 
        //The frame variable is used to reference this JFrame object.
        JFrame frame=new JFrame("FRAME CREATION");

        //Program exit when the user closes the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // sets the layout manager of the frame to null. This means no layout manager is used
        frame.setLayout(null);

        //Sets the size of the frame to 400 pixels wide by 400 pixels high
        frame.setSize(400, 400);

        //Makes the frame visible. By default, a frame is not visible when it is created
        frame.setVisible(true);

    }
}