import javax.swing.*;  
class ScrollBarExample  
{  
    ScrollBarExample(){  
        JFrame frame= new JFrame("Scrollbar Example");  
        JScrollBar scroll=new JScrollBar();  

        scroll.setBounds(100,100, 50,100); 

        frame.add(scroll);  
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new ScrollBarExample();  
    }
}  